package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import modelo.Filme;
import util.JpaUtil;


public class FilmeDao implements Serializable {
    EntityManager manager;
   
    public boolean alterar(Filme d){
        manager = JpaUtil.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(d);
        manager.getTransaction().commit();
        manager.close();
        return true;
    }
    
    public Filme buscarPorCodigo(int cod){
        manager = JpaUtil.getEntityManager();
        Filme filme = manager.find(Filme.class, cod);
        manager.close();
        return filme;
    }
    
    public Filme buscarPorNome(String nome){
        Filme temp;
        manager = JpaUtil.getEntityManager();
        String consulta = "SELECT c FROM Filme c WHERE c.nome = :nome"; 
        TypedQuery<Filme> query = manager.createQuery(consulta, Filme.class);
        query.setParameter("nome", nome);
        temp = query.getSingleResult();
        manager.close();
        return temp;
    }
    
    public boolean excluir(Filme filme){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction(); 
        tx.begin();
        // recupera a referência ao objeto
        Filme temp = manager.find(Filme.class, filme.getCodigo());
        manager.remove(temp);
        tx.commit();
        manager.close();
        return true;
    }
    
    public boolean inserir(Filme filme){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(filme);
        tx.commit();
        manager.close();
        return true;
    }
    
    public List<Filme> listarTodos(){
        manager = JpaUtil.getEntityManager();
        CriteriaQuery<Filme> query = manager.getCriteriaBuilder().createQuery(Filme.class);
        query.select(query.from(Filme.class));
        List<Filme> lista = manager.createQuery(query).getResultList();
        manager.close();
        return lista;
    }
        
    
}
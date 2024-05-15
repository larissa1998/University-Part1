package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import modelo.AluguelFilme;
import util.JpaUtil;

public class AluguelFilmeDao implements Serializable {
    EntityManager manager;
    
    public boolean alterar(AluguelFilme alFilme){
        manager = JpaUtil.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(alFilme);
        manager.getTransaction().commit();
        manager.close();
        return true;
    }
    
    public AluguelFilme buscarPorCodigo(int cod){
        manager = JpaUtil.getEntityManager();
        AluguelFilme alFilme = manager.find(AluguelFilme.class, cod);
        manager.close();
        return alFilme;
    }
    
    public AluguelFilme buscarPorNome(String nome){
        AluguelFilme temp;
        manager = JpaUtil.getEntityManager();
        String consulta = "SELECT c FROM AluguelFilme c WHERE c.nome = :nome"; 
        TypedQuery<AluguelFilme> query = manager.createQuery(consulta, AluguelFilme.class);
        query.setParameter("nome", nome);
        temp = query.getSingleResult();
        manager.close();
        return temp;
    }
    
    public boolean excluir(AluguelFilme alFilme){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction(); 
        tx.begin();
        AluguelFilme temp = manager.find(AluguelFilme.class, alFilme.getCodigo());
        manager.remove(temp);
        tx.commit();
        manager.close();
        return true;
    }
    
    public boolean inserir(AluguelFilme alFilme){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(alFilme);
        tx.commit();
        manager.close();
        return true;
    }
    
    public List<AluguelFilme> listarTodos(){
        manager = JpaUtil.getEntityManager();
        CriteriaQuery<AluguelFilme> query = manager.getCriteriaBuilder().createQuery(AluguelFilme.class);
        query.select(query.from(AluguelFilme.class));
        List<AluguelFilme> lista = manager.createQuery(query).getResultList();
        manager.close();
        return lista;
    }
}
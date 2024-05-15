package controle;

import dao.FilmeDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Filme;

@ManagedBean(name = "filmeControle")
@ViewScoped
public class FilmeControle implements Serializable {
    private Filme filme;
    private Filme aux;
    private FilmeDao dao;
    private List<Filme> filmes;
    
    public FilmeControle(){
        filme = new Filme();
        dao = new FilmeDao();
        filmes = dao.listarTodos();
    }
    
    public void salvarNovoFilme(){
        dao.inserir(filme);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Filme cadastrado", null));
        filmes.add(filme);
        limpar();
        listar();
    }
    
    public void preparaAlterar(Filme filme){
        aux = filme;
    }
    
    public void alterar(){
        dao.alterar(aux);
    }
    
    public void excluir(Filme filme){
        dao.excluir(filme);
        FacesContext context = FacesContext.getCurrentInstance(); 
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Filme excluido", null));
        filmes.remove(filme);
      //  listar(); //retirar
    }

    public void limpar() {
	filme = new Filme();
    } 
    public void listar() {
        filmes = dao.listarTodos();
    }     

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public FilmeDao getDao() {
        return dao;
    }

    public void setDao(FilmeDao dao) {
        this.dao = dao;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public Filme getAux() {
        return aux;
    }

    public void setAux(Filme aux) {
        this.aux = aux;
    }
    
}
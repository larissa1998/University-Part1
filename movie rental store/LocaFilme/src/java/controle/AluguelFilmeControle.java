package controle;

import dao.AluguelFilmeDao;
import dao.ClienteDao;
import dao.FilmeDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.AluguelFilme;
import modelo.Cliente;
import modelo.Filme;

@ManagedBean(name = "aluguelFilmeControle")
@ViewScoped
public class AluguelFilmeControle implements Serializable {
    private AluguelFilme alFilme;
    private AluguelFilme aux;
    private AluguelFilmeDao alFilmDao;
    private List<AluguelFilme> alFilmes;
    private ClienteDao clienteDao;
    private Cliente clienteSelecionado;
    private List<Cliente> clientes;
    private FilmeDao filmeDao;
    private Filme filmeSelecionado;
    private List<Filme> filmes;
    
    public AluguelFilmeControle(){
        alFilme = new AluguelFilme();
        alFilmDao = new AluguelFilmeDao();
        alFilmes = alFilmDao.listarTodos();
        clienteSelecionado = new Cliente();
        clienteDao = new ClienteDao();
        clientes = clienteDao.listarTodos();
        filmeSelecionado = new Filme();
        filmeDao = new FilmeDao();
        filmes = filmeDao.listarTodos();
    }
    
    public void preparaAlterar(AluguelFilme alFilme){
        setAux(alFilme);
    }
    
    public void alugar() {
        alFilme.setCliente(getClienteSelecionado());
	alFilme.setFilme(getFilmeSelecionado());
	alFilmDao.inserir(alFilme);
        filmeSelecionado.setLocado(Boolean.TRUE);
        filmeDao.alterar(filmeSelecionado);
	FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "A locação foi realizada.", null));
        alFilmes.add(alFilme);
        limpar();
        listar();
    }
    
    public void alterar(){
        getAlFilmDao().alterar(getAux());
    }
    
    public void excluir(AluguelFilme alFilme){
        filmeSelecionado=alFilme.getFilme(); //não significa que é o mesmo objeto que o anterior.
        filmeSelecionado.setLocado(Boolean.FALSE);
        filmeDao.alterar(filmeSelecionado);
	FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "A locação foi desfeita.", null));
        getAlFilmDao().excluir(alFilme);
        getAlFilmes().remove(alFilme);
        listar();
    }
    
    public void limpar() {
	alFilme = new AluguelFilme();
    }
    public void listar() {
        alFilmes = alFilmDao.listarTodos();
    }

    public AluguelFilme getAlFilme() {
        return alFilme;
    }

    public void setAlFilme(AluguelFilme alFilme) {
        this.alFilme = alFilme;
    }

    public AluguelFilme getAux() {
        return aux;
    }

    public void setAux(AluguelFilme aux) {
        this.aux = aux;
    }

    public AluguelFilmeDao getAlFilmDao() {
        return alFilmDao;
    }

    public void setAlFilmDao(AluguelFilmeDao alFilmDao) {
        this.alFilmDao = alFilmDao;
    }

    public List<AluguelFilme> getAlFilmes() {
        return alFilmes;
    }

    public void setAlFilmes(List<AluguelFilme> alFilmes) {
        this.alFilmes = alFilmes;
    }

    public ClienteDao getClienteDao() {
        return clienteDao;
    }

    public void setClienteDao(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public Cliente getClienteSelecionado() {
        return clienteSelecionado;
    }

    public void setClienteSelecionado(Cliente clienteSelecionado) {
        this.clienteSelecionado = clienteSelecionado;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public FilmeDao getFilmeDao() {
        return filmeDao;
    }

    public void setFilmeDao(FilmeDao filmeDao) {
        this.filmeDao = filmeDao;
    }

    public Filme getFilmeSelecionado() {
        return filmeSelecionado;
    }

    public void setFilmeSelecionado(Filme filmeSelecionado) {
        this.filmeSelecionado = filmeSelecionado;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}

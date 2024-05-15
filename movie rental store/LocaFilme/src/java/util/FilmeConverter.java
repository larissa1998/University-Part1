package util;

import dao.FilmeDao;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import modelo.Filme;

@FacesConverter(value = "filmeConverter", forClass = Filme.class)
public class FilmeConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        String nome;
        Filme temp = null;
        FilmeDao dao = new FilmeDao();
        try {
            nome = value;
            temp = dao.buscarPorNome(nome);
	} catch (Exception e) {
            System.out.println("Erro FilmeConverter: "+e.toString());
	}
 	return temp;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object obj) {
        if (obj == null){
            return " ";
        }
        if (obj instanceof Filme){
            Filme film = (Filme)obj;
            return film.getNome();
        }
        return "";
    }
    
}
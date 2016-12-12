package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;

import play.data.format.Formats;
import play.data.validation.Constraints;


@Entity
public class Orden extends Model{

	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String nombre;
    
    @Constraints.Required
    public String detalle;
    
    @Constraints.Required
    public String mesero;
    
    @Constraints.Required
    public String precio;

    public static Find<Long,Orden> find = new Find<Long,Orden>(){};
    
	public static List<Orden> listadoOrden() {
		// TODO Auto-generated method stub
		return find.all();
	}
    
	
}

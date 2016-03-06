/**
 * 
 */
package co.edu.javeriana.ambulancias.negocio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author andre
 *
 */
public class IPS {

	private String tipoAtencion;
	private Direccion direccion;
	private List<Servicio> servicios;

	public IPS(	String nombre,String tipoAtencion, String tipoDireccion,int calle,int carrera,int numero) {
		this.tipoAtencion = tipoAtencion;
		asignarDireccion(tipoDireccion, calle,
				carrera, numero);
		this.nombre = nombre;
		servicios = new ArrayList<Servicio>();
	}

	public void asignarDireccion(String tipoDireccion,int calle,int
			carrera,int numero) {
		this.direccion=new Direccion(tipoDireccion, calle, carrera, numero);
	}

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoAtencion() {
		return tipoAtencion;
	}

	public void setTipoAtencion(String tipoAtencion) {
		this.tipoAtencion = tipoAtencion;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
}

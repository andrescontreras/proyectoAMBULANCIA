/**
 * 
 */
package co.edu.javeriana.ambulancias.negocio;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author andre
 *
 */
public class EmpresaAmbulancias {
	private String nombre;
// ---- listas
	private List<Ambulancia>ambulancias=new ArrayList<Ambulancia>();
	private List<Servicio>servicios=new ArrayList<Servicio>();
	private List<IPS>losIPS=new ArrayList();
	
// ---- constructor
	public EmpresaAmbulancias(String nombre) {
		super();
		this.nombre = nombre;
	}
// ---- metodos extra	
	public void agregarIPS(String nombre,String tipoAtencion,String tipoDireccion,int calle ,int carrera, int numero){
		
	}
	public void agregarAmbulancia(int codigo,String placa,String tipoDotacion){
		Ambulancia ambulancia = new Ambulancia(codigo,placa,tipoDotacion);
		ambulancias.add(ambulancia);
		
		
	}
	/**
	 * se llama el metodo buscarAmbulancia 
	 * si el metodo buscarAmbulancia devuelve null el metodo registrarPosicionAmbulancia retorna false*/
	public boolean registrarPosicionAmbulancia(int codigo,int calle,int carrera){
		Ambulancia ambulancia=buscarAmbulancia(codigo);
		if(ambulancia != null){
		ambulancia.setHoraPosicion(new GregorianCalendar());
		ambulancia.setPosicionCalle(calle);
		ambulancia.setPosicionCarrera(carrera);
		return true;
		}
		return false;
	}
	public int registrarServicio(String paciente,String tServicio,String tDireccion,String telefono,int calle,int carrera,int numero){
		/*
		 * en esta clese es necesario que  la clase Servicio agrege los atributos
		 * -- codigo
		 * -- horaSolisitud
		 * -- estado por defecto (" NO_ASIGNADO")*/
	
		Servicio servicio(paciente,tServicio,tDireccion,telefono,calle,carrera,numero);
		servicios.add(servicio);
		return servicio.getCodigo;
	}
	public String asignarServicio(){
		
		return "";
	}
	public boolean finalizarServicio(){
		
		return true;
	}
// ---- metodos privados
	private Ambulancia buscarAmbulancia(int codigo){
		for(Ambulancia amb:this.ambulancias){
			if (amb.getCodigo()==codigo){
				return amb;
			}
		}
		return null;
	}
	private Servicio buscarServicio(){
		Servicio ser =new Servicio();
		return ser;
	}
	private list<Ambulancia> construirAmbulanciasDisponiblesServicio(){
		
	}
	private Ambulancia calcularAmbulanciaCercana(){
		Ambulancia amb = new Ambulancia();
		return amb;
	}
	private IPS calcularIPSmasCercano(){
		IPS ip=new IPS();
		return ip;
	}
	private long calcularDistancia(){
		return 10;
	}

	
// final clase	

}

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
	public boolean registrarPosicionAmbulancia(int codigo,int calle,int carrera){
		
		return true;
	}
	public int registrarServicio(String paciente,String tServicio,String Tdireccion,String telefono,int calle,int carrera,int numero){
		
		return 0;
	}
	public String asignarServicio(){
		
		return "";
	}
	public boolean finalizarServicio(){
		
		return true;
	}
	private Ambulancia buscarAmbulancia(){
		Ambulancia amb = new Ambulancia();
		return amb;
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

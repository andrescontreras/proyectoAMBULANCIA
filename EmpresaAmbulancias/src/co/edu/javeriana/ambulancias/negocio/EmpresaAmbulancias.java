/**
 * 
 */
package co.edu.javeriana.ambulancias.negocio;

/**
 * @author andre
 *
 */
public class EmpresaAmbulancias {
private String nombre;
	
	public void agregarIPS(){
		
	}
	public void agregarAmbulancia(){
		
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

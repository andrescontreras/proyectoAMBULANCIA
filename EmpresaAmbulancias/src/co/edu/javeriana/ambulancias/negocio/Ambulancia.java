package co.edu.javeriana.ambulancias.negocio;

public class Ambulancia {
	private String nombre;
	
	public void agregarIPS(){
		
	}
	public void agregarAmbulancia(){
		
	}
	public boolean registrarPosicionAmbulancia(){
		
		return true;
	}
	public int registrarServicio(){
		
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

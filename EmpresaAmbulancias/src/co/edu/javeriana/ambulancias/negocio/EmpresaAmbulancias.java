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
	public String asignarServicio(int codigo){
		Servicio ser=buscarServicio(codigo);
		
		construirAmbulanciasDisponiblesServicio(ser);
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
	private Servicio buscarServicio(int codigo){
		Servicio ser =new Servicio();
		return ser;
	}
	private List<Ambulancia> construirAmbulanciasDisponiblesServicio(Servicio servicio){
		boolean noAsociado=true;
		List<Ambulancia>ambDisponibles=new ArrayList<Ambulancia>();
		// reisar si la ambulancia tiene servicios asociados
		for(Ambulancia amb:this.ambulancias){
			noAsociado=true;
			List<Servicio> serAmb =amb.getServicios();
			// revisar cada servicio de esa ambulancia
			for(Servicio serAmbulancia:serAmb){
				if( serAmb.getEstado().ecuals("ASIGNADO")){
					noAsociado=false;
				}
			}
			/*
			 * se revisa si la ambulancia cumple con los requisitos
			 * 1) ambulancia == no asignado && tipo Servicio == urgencia
			 * 2) ambulancia == no asignado && tipo servicio == emergencia && ambulancia == alta UCI*/
			if(noSignado == true &&((servicio.getTiposervicio().ecuals("EMERGENCIA")&& 
					amb.getTipoDotacion().equals("ALTA_UCI"))||servicio.getTiposervicio().ecuals("URGENCIA") )){
				ambDisponibles.add(amb);
				
			}
			
		}
		return ambDisponibles;
	}
	/*
	 * */
	private Ambulancia calcularAmbulanciaCercana(List<Ambulancia> ambulancias,int calle ,int carrera){
		int min=1000;
		int distancia=0;
		Ambulancia minAmbulancia;
		for(Ambulancia amb:ambulancias){
			distancia=(int) calcularDistancia(amb.getPosicionCalle(),amb.getPosicionCarrera(),calle,carrera);
			if(distancia<min){
				min=distancia;
				minAmbulancia=amb;
			}
		}
		
	}
	private IPS calcularIPSmasCercano(){
		IPS ip=new IPS();
		return ip;
	}
	private long calcularDistancia(int calle,int carrera,int calle1,int carrera1){
		int distancia=0 , diferenciaCalle , diferenciaCarrera;
		diferenciaCalle=calle-carrera;
		diferenciaCarrera=carrera-carrera1;
		if(diferenciaCalle < 0){
			diferenciaCalle=diferenciaCalle *-1;
			
		}
		if(diferenciaCarrera<0){
			diferenciaCarrera=diferenciaCarrera*-1;
		}
		distancia=diferenciaCalle+diferenciaCarrera;
		
		return distancia;
	}

	
// final clase	

}

package co.edu.javeriana.ambulancias.negocio;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import co.edu.javeriana.ambulancias.presentacion.Utils;

public class Ambulancia {
	/***
	 * --la clase es una agregacion de la clase empresa ambulancias
	 * --tiene una relacion con servicios de una ambulancia 
	 * 	 tiene uno o mas servicios
	 * */
	private int codigo;
	private String placa;
	private String tipoDotacion;
	private GregorianCalendar horaPosicion;
	private int posicionCalle;
	private int posicionCarrera;
	
	private List<Servicio> servicios = new ArrayList<Servicio>();
// ---- CONSTRUCTORES

	public Ambulancia(int codigo, String placa, String tipoDotacion, GregorianCalendar horaPosicion, int posicionCalle,
			int posicionCarrera) {
		super();
		this.codigo = codigo;
		this.placa = placa;
		this.tipoDotacion = tipoDotacion;
		this.horaPosicion = horaPosicion;
		this.posicionCalle = posicionCalle;
		this.posicionCarrera = posicionCarrera;
	}
	
	public Ambulancia(){
		super();
		this.codigo=0;
		this.placa="-----";
		this.tipoDotacion="-----";
		this.horaPosicion = new GregorianCalendar();
		this.posicionCalle=0;
		this.posicionCarrera=0;
	}

	// ---- SET Y GET
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the tipoDotacion
	 */
	public String getTipoDotacion() {
		return tipoDotacion;
	}

	/**
	 * @param tipoDotacion the tipoDotacion to set
	 */
	public void setTipoDotacion(String tipoDotacion) {
		this.tipoDotacion = tipoDotacion;
	}

	/**
	 * @return the horaPosicion
	 */
	public GregorianCalendar getHoraPosicion() {
		return horaPosicion;
	}

	/**
	 * @param horaPosicion the horaPosicion to set
	 */
	public void setHoraPosicion(GregorianCalendar horaPosicion) {
		this.horaPosicion = horaPosicion;
	}

	/**
	 * @return the posicionCalle
	 */
	public int getPosicionCalle() {
		return posicionCalle;
	}

	/**
	 * @param posicionCalle the posicionCalle to set
	 */
	public void setPosicionCalle(int posicionCalle) {
		this.posicionCalle = posicionCalle;
	}

	/**
	 * @return the posicionCarrera
	 */
	public int getPosicionCarrera() {
		return posicionCarrera;
	}

	/**
	 * @param posicionCarrera the posicionCarrera to set
	 */
	public void setPosicionCarrera(int posicionCarrera) {
		this.posicionCarrera = posicionCarrera;
	}

	/**
	 * @return the servicios
	 */
	public List<Servicio> getServicios() {
		return servicios;
	}

	/**
	 * @param servicios the servicios to set
	 */
	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
		
	}
	// ---- TO STRING
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String hora=Utils.convertirHoraString(horaPosicion);
		return String.format("%10d %10s %14s %15s %5d %5d ",codigo,posicionCalle,placa,tipoDotacion,posicionCalle,posicionCarrera);
	}
	
// ----  METODOS EXTRA
	public void agregarServicio(){
		
	}

	
	
}

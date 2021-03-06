/**
 * 
 */
package co.edu.javeriana.ambulancias.negocio;

import java.util.GregorianCalendar;

/**
 * @author andre
 *
 */
public class Servicio {
	private static long CONSECUTIVO=0;
	private long codigo;
	private GregorianCalendar horaSolicitud;
	private String paciente;
	private String tipoServicio;
	private String telefono;
	private String estado;
	private Direccion direccion;
	private Ambulancia ambulancia;
	private IPS ips;
	
	public IPS getIps() {
		return ips;
	}

	public void setIps(IPS ips) {
		this.ips = ips;
	}

	public Servicio(String paciente, String tipoServicio, String telefono,String tipoDireccion,int calle,int
			carrera,int numero) {
		
		this.codigo=CONSECUTIVO++;
		this.paciente = paciente;
		this.tipoServicio = tipoServicio;
		this.telefono = telefono;
		asignarDireccion(tipoDireccion, calle,
				carrera, numero);
		this.horaSolicitud=new GregorianCalendar();
		this.estado="NO_ASIGNADO";
		
	}
	
	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public GregorianCalendar getHoraSolicitud() {
		return horaSolicitud;
	}

	public void setHoraSolicitud(GregorianCalendar horaSolicitud) {
		this.horaSolicitud = horaSolicitud;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Ambulancia getAmbulancia() {
		return ambulancia;
	}

	public void setAmbulancia(Ambulancia ambulancia) {
		this.ambulancia = ambulancia;
	}

	public void asignarDireccion(String tipoDireccion,int calle,int
			carrera,int numero)
	{
		this.direccion=new Direccion(tipoDireccion, calle, carrera, numero);
	}
}

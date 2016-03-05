package co.edu.javeriana.empleados.presentacion;
import java.util.Calendar;
import java.util.GregorianCalendar;
import  java.util.StringTokenizer;


/**
 * @author sala_c
 *
 */
public class Utils {
	/**
 	* Metodo encargado de convertir una variable de tipo String a GregorianCalendar (en formato anio,mes,dia )
 	*/
	public static GregorianCalendar convertirStringFecha (String fecha)
	{
		String dia,mes,anio;
		int diai,mesi,anioi;
		StringTokenizer st = new StringTokenizer(fecha,"-");

	         anio=st.nextToken();
	         mes=st.nextToken();
	         dia=st.nextToken();
	         anioi = Integer.parseInt(anio);
	         mesi = Integer.parseInt(mes);
	         diai = Integer.parseInt(dia);
	         GregorianCalendar fechaHoy = new GregorianCalendar(anioi,mesi,diai);
	         return fechaHoy;
	}
	/**
 	* Metodo encargado de convfertir una variable de tipo GregorianCalendar a String (en formato anio,mes,dia)
 	*/
	public static String convertirFechaString (GregorianCalendar fecha)
	{
		int dia = fecha.get(Calendar.DATE);
		int mes = fecha.get(Calendar.MONTH);
		int anio = fecha.get(Calendar.YEAR);
		String sfecha = anio+"-"+mes+"-"+dia;
		return sfecha;
	}
	/**
 	* Metodo encargado de cinvertir una vaiable de tipo GregorianCalendar a String (en formato hora:minutos )
 	*/
	public static String convertirHoraString(GregorianCalendar hora)
	{
		int horas = hora.get(Calendar.HOUR);
		int minutos = hora.get(Calendar.MINUTE);
		String shora = horas+":"+minutos;
		return shora;
	}
	/**
 	* Metodo encargado de convertir una variable de tipo String a GregorianCalendar (en formato hora:minutos) y agregarsela a una fecha.
 	*/
	public static GregorianCalendar convertirStringHoraToFecha (String fecha)
	{
		StringTokenizer fh = new StringTokenizer(fecha,":");
		String hora;
		String minutos;
		int ihora;
		int iminutos;
		
		hora = fh.nextToken();
		minutos = fh.nextToken();
		
		ihora=Integer.parseInt(hora); 
		iminutos=Integer.parseInt(minutos); 
		
		GregorianCalendar fechaHoy = new GregorianCalendar();
		
		int dia = fechaHoy.get(Calendar.DATE);
		int mes = fechaHoy.get(Calendar.MONTH);
		int anio = fechaHoy.get(Calendar.MONTH);
		return new GregorianCalendar(anio,mes,dia,
				 ihora, iminutos);
	}
	/**
 	* Metodo encargado de calcular la edad de un operario en años a partir de su fecha de nacimiento.
 	*/
	public static long obtenerEdad (GregorianCalendar fechaNacimiento)
	{
		GregorianCalendar fechaHoy = new GregorianCalendar();
		long resta=fechaHoy.getTimeInMillis()-fechaNacimiento.getTimeInMillis();
		resta=resta/((long) 1000*60*60*24*365);
		return resta;
	}
	/**
 	* Metodo encargado de calcular la diferencia en minutoos de dos fechas.
 	*/
	public static long diferenciaFechasMinutos(GregorianCalendar fecha1, GregorianCalendar
			fecha2){
		long resta=fecha1.getTimeInMillis()-fecha2.getTimeInMillis();
		resta=resta/((long) 1000*60);
		return resta;
	}
	
}
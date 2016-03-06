/**
 * 
 */
package co.edu.javeriana.ambulancias.persistencia;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.StringTokenizer;
import co.edu.javeriana.ambulancias.negocio.EmpresaAmbulancias;

/**
 * @author andrescontreras
 *
 */
public class ManejoArchivos {
	public static EmpresaAmbulancias ingresarIPS(EmpresaAmbulancias empresa,
			String nombreArchivo) {
		File inFile = new File("./" + nombreArchivo);
		Scanner input = null;
		String linea;

		try {

			input = new Scanner(inFile);

			linea = input.nextLine().trim(); // viene #nombre--
												// tipoAtencion--tipoDireccion(CALLE
												// o CARRERA)
												// ---calle---carrera--numero

			while (!linea.equals("0")) {

				linea = input.nextLine().trim(); // vienen datos de una
													// fundacion;
				procesarIps(linea, empresa);

				linea = input.nextLine().trim(); // vienen datos de fundacion o
													// 0

			}

			// fin de todas las ips.

		} catch (Exception e) {
			System.out.println("excepcion inesperada:" + e.getMessage());
		} finally {
			input.close();
		}
		return empresa;

	}

	public void IngresarAmbulancias(EmpresaAmbulancias empresa,String nombreArchivo) {
			File inFile = new File("./" + nombreArchivo);
			Scanner input = null;
			String linea;

			try {

				input = new Scanner(inFile);

				linea = input.nextLine().trim(); // viene #codigo---placa
													------tipoDotacion(MEDICALIZADA o ALTA_UCI)

				while (!linea.equals("0")) {

					linea = input.nextLine().trim(); // vienen datos de una
														// fundacion;
					procesarIps(linea, empresa);

					linea = input.nextLine().trim(); // vienen datos de fundacion o
														// 0

				}

				// fin de todas las ips.

			} catch (Exception e) {
				System.out.println("excepcion inesperada:" + e.getMessage());
			} finally {
				input.close();
			}
			return empresa;

		}

	}

	private static EmpresaAmbulancias procesarIPS(String datosips,
			EmpresaAmbulancias empresa) {
		String nombre, tipoAtencion, tipoDireccion, calle, carrera, numero;
		StringTokenizer st = new StringTokenizer(datosips, "*");
		nombre = (st.nextToken()).trim();
		tipoAtencion = (st.nextToken()).trim();
		tipoDireccion = (st.nextToken()).trim();
		calle = (st.nextToken()).trim();
		carrera = (st.nextToken()).trim();
		numero = (st.nextToken()).trim();
		int ccalle = Integer.parseInt(calle);
		int ccarrera = Integer.parseInt(carrera);
		int cnumero = Integer.parseInt(numero);
		empresa.agregarIPS(nombre, tipoAtencion, tipoDireccion, ccalle,
				ccarrera, cnumero);
		return empresa;
	}
}
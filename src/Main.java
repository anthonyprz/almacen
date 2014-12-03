import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main 
{
	
	public static void main(String[] args) 
	{
		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		FileInputStream fichero = new FileInputStream("./distribuidores.txt");
		InputStreamReader isr = new InputStreamReader(fichero);
		BufferedReader br = new BufferedReader(isr);
		
		String linea = br.readLine();
		String [] sitio = null;
			

			while (linea != null) {
				
				Distribuidor distribuidor = new Distribuidor();
				Direccion direccion = new Direccion();
				Contacto contacto = new Contacto();
				

				sitio = linea.split("#");
				String distri = sitio[0];

				String [] sitio2 = distri.split(",");

				distri.setNombre(sitio2[0]);
				distri.setCif(sitio2[1]);

				distri = sitio[1];
				sitio2 = distri.split(",");

				direccion.setDireccion(sitio2[0]);
				int entero = Integer.parseInt(sitio2[1]);
				direccion.setCodigoPostal(entero);
				direccion.setCalle(sitio2[2]);
				entero = Integer.parseInt(sitio2[4]);
				direccion.setNumero(entero);

				distribuidor.setDireccion(direccion);

				distri = sitio[2];
				sitio2 = distri.split(",");

				contacto.setNombre(sitio2[0]);
				contacto.setApellido(sitio2[1]);
				entero = Integer.parseInt(sitio2[2]);
				contacto.setNumTelefonico(entero);
				entero = Integer.parseInt(sitio2[3]);
				contacto.setEdad(entero);

				distribuidor.setContacto(contacto);
				distribuidores.add(distribuidor);
				linea = br.readLine();

		}	

		for (int a = 0; a < distribuidores ; a++ ) {

			Direccion direcc = new Direccion();
			Contacto contact = new Contacto();

			System.out.println((i + 1) + "º proveedor");
			System.out.println("<><><><><><><><><><><><><><><><><><><><>");
			System.out.println("Nombre: " + (distribuidores.get(a).getNombre()));
			System.out.println("Cif: " + (distribuidores.get(a).getCif()));
			direcc = distribuidores.get(a).getDireccion();
			System.out.println("\tCiudad: " + direc.getCiudad());
			System.out.println("\tCod.postal: " + direc.getCodigoPostal());
			System.out.println("\tCalle: " + direc.getCalle());
			System.out.println("\tCalle: " + direc.getNumero());
			direcc = distribuidores.get(a).getContacto();
			System.out.println("\tNombre: " + contact.getNombre());
			System.out.println("\tApellido: " + contact.getApellido());
			System.out.println("\tApellido: " + contact.getNumTelefonico());
			System.out.println("\tApellido: " + contact.getEdad());



		}

	}
}

//import java.util.Scanner;
import java.util.ArrayList;
//import java.io.File;
//import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
	public static void main(String[] args) {

		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		try{

			
			FileInputStream fis = new FileInputStream("distribuidores.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF8");
			BufferedReader br = new BufferedReader(isr);

			String linea = br.readLine();
			String [] campos = null;


			while(linea != null){

				Distribuidor distribuidor = new Distribuidor();
				Direccion direccion = new Direccion();
				Contacto contacto = new Contacto();
				campos = linea.split("#");
				String distri = campos[0];
				String [] campos2 = distri.split(",");
				distribuidor.setNombre(campos2[0]);
				distribuidor.setCif(campos2[1]);

				distri = campos[1];
				campos2 = distri.split(",");
				direccion.setCiudad(campos2[0]);
				int entero = Integer.parseInt(campos2[1]);
				direccion.setCodigoPostal(entero);
				direccion.setCalle(campos2[2]);
				entero = Integer.parseInt(campos2[4]);
				direccion.setNumero(entero);
	
				distribuidor.setDireccion(direccion);

				distri = campos[2];
				campos2 = distri.split(",");
				contacto.setNombre(campos2[0]);
				contacto.setApellido(campos2[1]);
				entero = Integer.parseInt(campos2[2]);
				contacto.setNumTelefonico(entero);
				entero = Integer.parseInt(campos2[3]);
				contacto.setEdad(entero);

				distribuidor.setPersonaContacto(contacto);

				distribuidores.add(distribuidor);
				linea = br.readLine();

			}
			for (int i=0;i<distribuidores.size() ;i++ ) {
				
			Direccion direc = new Direccion();
			Contacto contact = new Contacto();
			
			System.out.println("\nProveedor nº: " + (i + 1));
			System.out.println("<><><><><><><><><><><><><><><><><><><><>");
			System.out.println("Nombre: " + (distribuidores.get(i).getNombre()));
			System.out.println("Cif: " + (distribuidores.get(i).getCif()));
			
			direc = distribuidores.get(i).getDireccion();
			System.out.println("\tCiudad: " + direc.getCiudad());
			System.out.println("\tCod.postal: " + direc.getCodigoPostal());
			System.out.println("\tCalle: " + direc.getCalle());
			System.out.println("\tCalle: " + direc.getNumero());
			
			contact = distribuidores.get(i).getPersonaContacto();
			System.out.println("\tNombre: " + contact.getNombre());
			System.out.println("\tApellido: " + contact.getApellido());
			System.out.println("\tApellido: " + contact.getNumTelefonico());
			System.out.println("\tApellido: " + contact.getEdad());

			}

		}catch(Exception ioe) {
			System.out.println("aqui hay un error: "+ioe);
		}
	}
}

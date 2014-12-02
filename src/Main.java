import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main 
{
	
	public static void main(String[] args) 
	{
		

			Scanner sc = new Scanner (System.in);
			//variables 
			String nombre;
			String cif;
			//Direccion direccion;
			Contacto personaContacto;
			int numeroDistribuidores;
			String direccion;
			

		System.out.println("\n¿cuantos distribuidores quieres guardar?");
		numeroDistribuidores = sc.nextInt();

		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
			

		for (int c=0; c<numeroDistribuidores ;c++ )
		{
			System.out.println("\n<><><><>distribuidores<><><><>");
			
			Distribuidor distribuidor = new Distribuidor();
			//Contacto cont = new Contacto();


			System.out.println("\nintroduce el nombre del distribuidor");
			nombre = sc.next();
			distribuidor.setNombre(nombre);
			System.out.println("\nintroduce el CIF del distribuidor");
			cif = sc.next();
			distribuidor.setCif(cif);
			
					//direccion 
				
					
				
					//do {System.out.println("\nahora vamos con la dirección");
						System.out.println("\nvas a introducir una direccion");	
									
							
								Direccion direc = new Direccion();
								String ciudad;
								int codigoPostal;
								String calle;
								int numero;
								//direccion = sc.next();
								//distribuidor.setDireccion(direccion);	
								System.out.println("\nintroduce la ciudad del distribuidor");
								ciudad = sc.next();							
								direc.setCiudad(ciudad);
								System.out.println("\nintroduce el codigo postal");
								codigoPostal = sc.nextInt();
								direc.setCodigoPostal(codigoPostal);
								System.out.println("\nintroduce la calle");
								calle = sc.next();
								direc.setCalle(calle);
								System.out.println("\nintroduce el numero");
								numero = sc.nextInt();
								direc.setNumero(numero);

						}
						
						
					
					
					//fin de direccion

			//System.out.println("\nintroduce el numero de contacto del distribuidor");
			//personaContacto = sc.nextInt();
			//distribuidor.setPersonaContacto(personaContacto);
			
		//}while (direccion = 1);

	}
}

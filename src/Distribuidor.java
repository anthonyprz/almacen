public class Distribuidor {

	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto personaContacto;


	//-------------getters-------------
	public String getNombre (){
		return this.nombre;
	}
	public String getCif (){
		return this.cif;
	}
	public Direccion getDireccion(){
		return this.direccion;
	}
	public Contacto getPersonaContacto (){
		return this.personaContacto;
	}
	//-------------setters----------------
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setCif (String cif){
		this.cif = cif;
	}
	public void setDireccion (Direccion direccion){
		this.direccion = direccion;
	}
	public void setPersonaContacto (Contacto personaContacto){
		this.personaContacto = personaContacto;
	}
		

}

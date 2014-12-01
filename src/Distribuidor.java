public class Distribuidor {

	private String nombre;
	private String cif;
	private Direccion dirección;
	private Contacto personaContacto;


	//-------------getters-------------
	public String getNombre (){
		return this.nombre;
	}
	public String getCif (){
		return this.cif;
	}
	public Direccion getDirección(){
		return this.dirección;
	}
	public Contacto getPersonaContacto (){
		return this.personaContacto;
	}
	//-------------setters----------------
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setCif (String Cif){
		this.cif = cif;
	}
	public void setDirección (Direccion dirección){
		this.dirección = dirección;
	}
	public void setPersonaContacto (Contacto personaContacto){
		this.personaContacto = personaContacto;
	}
		

}
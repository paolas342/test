package clases;

public class Persona {
	private int idPersona;
	private int dni;
	private String nombre;
	private String apellido;
	private int edad;
	private int sueldo;
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public boolean Mayor(){
		if(this.edad>= 18){
			return true;
		}else
			return false;
	}
	
	public boolean SueldoMayorA(){
		if(this.sueldo>= 5000){
			return true;
		}else
			return false;
	}

}



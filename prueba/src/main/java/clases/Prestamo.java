package clases;

public class Prestamo {
	private int idPrestamo;
	private Persona persona;
	private int capital;
	private int cantCuotas;
	private int interes;
	
	public int getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public Persona getPersona() {
		return persona;
	}
	// me verifica si la persona cumple con las condiciones para que se le de un prestamo
	public void setPersona(Persona persona) {
		if (persona.Mayor()&& persona.SueldoMayorA()){	
			this.persona= persona;
		}else{
				throw new IllegalArgumentException("el sueldo no cumple con los requisitos");
				}
	}
	
	public int getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	public int getCantCuotas() {
		return cantCuotas;
	}
	
	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}
	
	public int getInteres() {
		return interes;
	}
	
	public void setInteres(int interes) {
		this.interes = interes;
	}
	
	public int getMontoPagar(){
		return(this.capital/this.interes)*100 + this.capital;
	}
	public int getCuota(){
		return this.getMontoPagar()/this.cantCuotas;
	}


}

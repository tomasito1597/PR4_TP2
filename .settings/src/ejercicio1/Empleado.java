package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona implements Comparable<Empleado>{

	//Atributos
	private final int legajo;
	private String puesto;
	
	//Variable estática para llevar el control del último legajo asignado
    private static int ultimoLegajo = 1000;  
	
	//Constructores
	public Empleado() {	
		super();
		this.puesto = "Sin Puesto";
	    this.legajo = generarLegajo();
	}
	
	public Empleado(LocalDate fechaNacimiento, String dni, String nombre, String apellido, String genero, String telefono, String direccion, String email, String puesto) {
		super(fechaNacimiento,dni,nombre,apellido,genero,telefono,direccion,email);
		this.puesto = puesto;
		this.legajo = generarLegajo();	
	}
	
	
	//Getters
	public int getLegajo() {
		return legajo;		
	}
	public String getPuesto() {
		return puesto;
	}
	//Setters
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
		
	//Metodo ToString de empleado	
	@Override
	public String toString() {
		return "Legajo: " + legajo + ", Puesto: " + puesto + ", " + super.toString();		
	}
	// Métodos
    private static int generarLegajo() {
       return ultimoLegajo++;
    }
    
    //Metodo para devolver proximo empleado
    
    public static int devuelveProximoLegajo() {
    	return ultimoLegajo; 
    }

    // comparable
    
	@Override
	public int compareTo(Empleado o) {

		 return Integer.compare(this.getLegajo(), o.getLegajo());
		
	}
//    Hashcode y Equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + legajo;
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (legajo != other.legajo)
			return false;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		return true;
	}
	
    
    
    
	
}
	
	
	


package dominio;

import java.time.LocalDate;

public class Persona {

	//atributos
	
	private LocalDate fechaNacimiento;
	private String dni;
	private String nombre;
	private String apellido;
	private String genero;
	private String telefono;
	private String direccion;
	private String email;
	

    
	// getters y setters
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha Nacimiento: " + fechaNacimiento +
				", DNI: " + dni + ", Genero: " + genero + ", Telefono: " + telefono + ", Email: " + email +
				", Direccion: " + direccion;
		
	}
	
		//Constructores
		public Persona() {
			fechaNacimiento = LocalDate.of(2025, 1, 1);
			this.dni = "Sin DNI";
		    this.nombre = "Sin Nombre";
		    this.apellido = "Sin Apellido";
		    this.genero = "N/A";
		    this.telefono = "Sin Teléfono";
		    this.direccion = "Sin Dirección";
		    this.email = "Sin Email";
			
		}
		
		public Persona (LocalDate fechaNacimiento, String dni, String nombre, String apellido, String genero, String telefono, String direccion, String email) {
			this.fechaNacimiento = fechaNacimiento;
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.genero	= genero;
			this.telefono = telefono;
			this.direccion = direccion;
			this.email = email;
		//	this.legajo = generarLegajo(); // Asignación automática del legajo
		}
		
	
}

package ejercicio1;

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
	
	
	public static void exVerificarDNI(String dni) throws ExVerificarDNI {
		
		if(!dni.matches("\\d{7,8}")) {
			throw new ExVerificarDNI(dni);
		}
		
	}
    
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
//	Hashcode y equals

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
			result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
			result = prime * result + ((dni == null) ? 0 : dni.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
			result = prime * result + ((genero == null) ? 0 : genero.hashCode());
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
			result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Persona other = (Persona) obj;
			if (apellido == null) {
				if (other.apellido != null)
					return false;
			} else if (!apellido.equals(other.apellido))
				return false;
			if (direccion == null) {
				if (other.direccion != null)
					return false;
			} else if (!direccion.equals(other.direccion))
				return false;
			if (dni == null) {
				if (other.dni != null)
					return false;
			} else if (!dni.equals(other.dni))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (fechaNacimiento == null) {
				if (other.fechaNacimiento != null)
					return false;
			} else if (!fechaNacimiento.equals(other.fechaNacimiento))
				return false;
			if (genero == null) {
				if (other.genero != null)
					return false;
			} else if (!genero.equals(other.genero))
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			if (telefono == null) {
				if (other.telefono != null)
					return false;
			} else if (!telefono.equals(other.telefono))
				return false;
			return true;
		}
		
		
}

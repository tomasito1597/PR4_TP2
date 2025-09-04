package Ejercicio2;

public class Polideportivo implements IinstalacionesDeportivas, Edificio {

	private String nombre;
	private double superficie;
	private int tipoDeInstalacion;
	
	
	
	public Polideportivo(String nombre, double superficie, int tipoDeInstalacion) {
		super();
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	@Override
	public double getSuperficieEdificio() {

		return superficie;
	}

	@Override
	public int getTipoDeInstalacion() {

		return tipoDeInstalacion;
	}

	@Override
	public String toString() {
		return "Polideportivo [nombre=" + nombre + ", superficie=" + superficie + ", tipoDeInstalacion="
				+ tipoDeInstalacion + "]";
	}
	
	
	
}

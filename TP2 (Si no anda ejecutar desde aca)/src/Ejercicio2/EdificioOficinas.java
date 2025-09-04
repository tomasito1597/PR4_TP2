package Ejercicio2;

public class EdificioOficinas implements Edificio {
	private int numOficinas;
	private double superficie;
	
	public EdificioOficinas(int numOficinas, double superficie) {
		super();
		this.numOficinas = numOficinas;
		this.superficie = superficie;
	}

	@Override
	public double getSuperficieEdificio() {

		return superficie;
	}

	@Override
	public String toString() {
	    return "Edificio de Oficinas | Nº Oficinas: " + numOficinas + 
	           " | Superficie: " + superficie + " m2";
	}
	
	
	
	
}

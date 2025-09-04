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
	

	public int getNumOficinas() {
		return numOficinas;
	}

	public void setNumOficinas(int numOficinas) {
		this.numOficinas = numOficinas;
	}

	@Override
	public String toString() {
		return "EdificioOficinas [numOficinas=" + numOficinas + ", superficie=" + superficie + "]";
	}
	
	
	
	
}

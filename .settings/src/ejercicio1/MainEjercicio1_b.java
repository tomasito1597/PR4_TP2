package ejercicio1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_b {

	public static void main(String[] args) {				
		
		///CREAR 5 EMPLEADOS Y GUARDARLOS DENTRO DE UN ArrayList
		
		ArrayList<Empleado> lista_de_empleados = new ArrayList<>();
		
		lista_de_empleados.add(new Empleado(
				LocalDate.of(2003, 9, 20),
                "45292157",
                "Marcos",
                "Colombres",
                "Masculino",
                "1135157104",
                "Francia 1508",
                "marcos123@gmail.com",
                "Programador"));
		
		lista_de_empleados.add(new Empleado(
				LocalDate.of(2004, 1, 1),
				"45292157",
				"Franco David",
				"Monzón López",
				"Masculino",
				"1135123456",
				"San Martín 2345",
				"franco.monzon@gmail.com",
				"Programador"));
		
		lista_de_empleados.add(new Empleado(
				LocalDate.of(2004, 2, 2),
				"45381234",
				"Tomás Uriel",
				"Díaz",
				"Masculino",
				"1164789523",
				"Belgrano 1020",
				"tomas.diaz@gmail.com",
				"Programador"));
		
		lista_de_empleados.add(new Empleado(
				LocalDate.of(2004, 3, 3),
				"45472345",
				"Juan Cruz",
				"Albornoz",
				"Masculino",
				"1145896532",
				"Rivadavia 450",
				"juan.albornoz@gmail.com",
				"Programador"));
		
		lista_de_empleados.add(new Empleado(
				LocalDate.of(2004, 4, 4),
				"45561234",
				"Luis Ignacio",
				"Calvá",
				"Masculino",
				"1178459623",
				"Mitre 879",
				"luis.calva@gmail.com",
				"Programador"));
		
		///MOSTRAR LA INFORMACIÓN DE CADA EMPLEADO UTILIZANDO UN Iterator
		Iterator<Empleado> iterator_de_empleado = lista_de_empleados.iterator();
		
		while(iterator_de_empleado.hasNext()) {
			Empleado temporal = iterator_de_empleado.next();
			System.out.println(temporal);
			
		}
	}
}
package ejercicio1;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;


///CREAR UNA CLASE LLAMADA MainEjercicio1_c

public class MainEjercicio1_c {

	public static void main(String[] args) {
		
		///CREAR 5 EMPLEADO Y GUARDARLOS DENTRO DE UN TreeSet
		
		TreeSet<Empleado> empleados = new TreeSet<>();
		
		Empleado e1 = new Empleado(
			    LocalDate.of(2003, 5, 15),
			    "46123456",
			    "Sofía",
			    "Ramírez",
			    "Femenino",
			    "1162347890",
			    "Lavalle 320",
			    "sofia.ramirez@gmail.com",
			    "Programador"
			);

			Empleado e2 = new Empleado(
			    LocalDate.of(2004, 6, 10),
			    "46234567",
			    "Martín",
			    "Fernández",
			    "Masculino",
			    "1159876543",
			    "Av. Siempre Viva 742",
			    "martin.fernandez@hotmail.com",
			    "Programador"
			);

			Empleado e3 = new Empleado(
			    LocalDate.of(2003, 11, 25),
			    "46345678",
			    "Camila",
			    "Gómez",
			    "Femenino",
			    "1145567788",
			    "Independencia 1450",
			    "camila.gomez@yahoo.com",
			    "Programador"
			);

			Empleado e4 = new Empleado(
			    LocalDate.of(2004, 3, 30),
			    "46456789",
			    "Luciano",
			    "Pereyra",
			    "Masculino",
			    "1132234455",
			    "Moreno 980",
			    "luciano.pereyra@gmail.com",
			    "Programador"
			);

			Empleado e5 = new Empleado(
			    LocalDate.of(2004, 9, 5),
			    "46567890",
			    "Valentina",
			    "Silva",
			    "Femenino",
			    "1178996655",
			    "Belgrano 2210",
			    "valentina.silva@hotmail.com",
			    "Programador"
			);

		
			empleados.add(e5);
			empleados.add(e1);
			empleados.add(e2);
			empleados.add(e3);
			empleados.add(e4);

		Iterator<Empleado> it = empleados.iterator();
		
		while(it.hasNext()) {
			Empleado e = it.next();
			System.out.println(e.toString());
		}
		
	}

}

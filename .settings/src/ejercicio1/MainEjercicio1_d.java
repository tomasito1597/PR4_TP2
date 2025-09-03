package ejercicio1;
import java.util.HashSet;
import java.util.Iterator;



import java.time.LocalDate;

public class MainEjercicio1_d {

	public static void main(String[] args) {
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
			HashSet<Empleado>ListaEmpleado= new HashSet<Empleado>();
			ListaEmpleado.add(e1);
			ListaEmpleado.add(e2);
			ListaEmpleado.add(e3);
			ListaEmpleado.add(e4);
			ListaEmpleado.add(e5);

			System.out.println("Listado de Empleados \n");		
			Iterator<Empleado> it = ListaEmpleado.iterator();
			while(it.hasNext())
			{
				Empleado p = (Empleado) it.next();
				System.out.println(p.toString());
			}
	}

}

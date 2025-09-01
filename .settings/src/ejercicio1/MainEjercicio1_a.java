package ejercicio1;
import java.time.LocalDate;

public class MainEjercicio1_a {

public static void main(String[] args) {

	Persona ejemplo1 = new Persona(
	                LocalDate.of(2003, 9, 20),
	                "AA202020",
	                "Marcos",
	                "Colombres",
	                "Masculino",
	                "1135157104",
	                "Francia 1508",
	                "marcos.ccc@gmail.com"
	        );

	 Persona ejemplo2 = new Persona(
	                LocalDate.of(1985, 10, 20),
	                "20202020",
	                "María",
	                "López",
	                "Femenino",
	                "1199887766",
	                "Av. Siempre Viva 742",
	                "maria.lopez@email.com"
	        );
	 
        try {
        	
            Persona.exVerificarDNI(ejemplo1.getDni());
            System.out.println("Persona agregada correctamente");
            
        } catch (ExVerificarDNI e) {
        	
            System.out.println("Persona no agregada por no verificar el DNI");
            
        }

        try {
        	
            Persona.exVerificarDNI(ejemplo2.getDni());
            System.out.println("Persona agregada correctamente");
            
        } catch (ExVerificarDNI e) {
        	
            System.out.println("Persona no agregada por no verificar el DNI");
            
        }
    }
}

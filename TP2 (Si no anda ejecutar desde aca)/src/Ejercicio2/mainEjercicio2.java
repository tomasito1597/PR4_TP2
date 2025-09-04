package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio2 {

	public static void main(String[] args) {
		ArrayList<Edificio> arrayEdificio = new ArrayList<Edificio>(5);//CREO EL ARRAY
		//AÑADO LOS 3 POLIDEPORTIVOS
		arrayEdificio.add(new Polideportivo("Polideportivo Municipal Norte", 2500.50, 1));
		arrayEdificio.add(new Polideportivo("Centro Deportivo Sur", 1800.00, 2));
		arrayEdificio.add(new Polideportivo("Club Atlético Barrio Oeste", 3200.75, 1));
		//AÑADO LOS 2 EDIFICIOS DE OFICINAS
		arrayEdificio.add(new EdificioOficinas(20, 4500.75));
		arrayEdificio.add(new EdificioOficinas(35, 8200.50));
		
		//AÑADO LO DE RECORRER Y MOSTRAR LOS DATOS CON ITERATOR
        Iterator <Edificio> iterator_edificios = arrayEdificio.iterator();
        while (iterator_edificios.hasNext()) {
            System.out.println(iterator_edificios.next().toString());
        }
		
		
		
	}

}

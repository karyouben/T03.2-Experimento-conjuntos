package fp.laboratorio.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import fp.laboratorio.Estudiante;
import fp.laboratorio.EstudianteImpl;

public class ExperimentoConjuntos {
	
	
	public static void main(String []args) {
		
		Estudiante e1 = new EstudianteImpl("Ada", "Lovelace", "adalov");  
		Estudiante e2 = new EstudianteImpl ("Grace", "Murray", "gramur");
		Estudiante e3 = new EstudianteImpl ("Frances", "Allen", "fraall");
		Estudiante e4 = new EstudianteImpl("Hedy", "Lamarr", "hedlam");
		Estudiante e5 = new EstudianteImpl ("Radia", "Perlman", "ritper");
		Estudiante e6 = new EstudianteImpl ("Margaret", "Hamilton", "marham");
		Estudiante e7 = new EstudianteImpl ("Frances", "Allen", "fraall");
			
		//Crea un par de conjuntos vac�os de estudiantes
	
		//A�ade 4 estudiantes (e1-e4) al conjunto 1 
		
		//A�ade 3 estudiantes (e5-e7) al conjunto 2
			
		//Comprueba si la estudiante e3 est� en el conjunto 1
		
		//Comprueba si la estudiante e3 est� en el conjunto 2
		
		//Haz la misma prueba anterior, pero comentando los m�todos equals y hashCode en la clase EstudianteImpl
	
		//Haz la misma prueba anterior, pero descomenta ahora el m�todo equals en la clase EstudianteImpl
		
		//A�ada el estudiante e2 al segundo conjunto y muestre el resultado de la operaci�n add y el segundo conjunto
		
		
		// A�ada el estudiante e3 al segundo conjunto y muestre el resultado de la operaci�n add.
		
		
		//Elimine al estudiante e2 del primer conjunto.
		
		//Calcula la uni�n, intersecci�n y diferencia de los dos conjuntos y muestra los resultados.

		
	}

}
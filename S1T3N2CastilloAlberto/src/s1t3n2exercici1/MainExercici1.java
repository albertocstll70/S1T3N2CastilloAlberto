package s1t3n2exercici1;

import java.util.HashSet;

public class MainExercici1 {

	public static void main(String[] args) {
		
		
	Restaurante  r1 = 	new Restaurante("La toscana", 6);
	Restaurante  r2 = 	new Restaurante("La toscana", 6);
	Restaurante  r3 = 	new Restaurante("El Gran", 8);
	Restaurante  r4 = 	new Restaurante("El Gran", 8);
	// para que funcione hay que sobrescribir  el  método equals en la clase Restaurante
	HashSet<Restaurante> hRestauran = new HashSet<Restaurante>();
	hRestauran.add(r1);
	hRestauran.add(r2);
	hRestauran.add(r3);
	hRestauran.add(r4);
	
	for(Restaurante r : hRestauran ) {
	
	System.out.println(r);
	
	}
	
	System.out.println(hRestauran.size());

	}

	
	
}

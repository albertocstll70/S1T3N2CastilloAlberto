package s1t3n2exercici2;

import java.util.HashSet;

import java.util.TreeSet;

public class MainExercici2 {

	public static void main(String[] args) {

		Restaurante r1 = new Restaurante("La toscana", 6);
		Restaurante r2 = new Restaurante("La toscana", 6);
		Restaurante r3 = new Restaurante("El Gran", 8);
		Restaurante r4 = new Restaurante("El Gran", 5);
		Restaurante r5 = new Restaurante("La Torre", 4);
		Restaurante r6 = new Restaurante("Mezzanotte", 5);
		Restaurante r7 = new Restaurante("El Turco", 3);
		Restaurante r8 = new Restaurante("BCN", 9);

		// para que funcione hay que sobrescribir  el  método equals en la clase Restaurante
		HashSet<Restaurante> hRestauran = new HashSet<Restaurante>();
		hRestauran.add(r1);
		hRestauran.add(r2);
		hRestauran.add(r3);
		hRestauran.add(r4);
		hRestauran.add(r5);
		hRestauran.add(r6);
		hRestauran.add(r7);
		hRestauran.add(r8);

		for (Restaurante r : hRestauran) {

			System.out.println(r);

		}

		/*
		 * pasamos el HashSet TreeSet para ordenar. hay que definir una interfaz que
		 * implemente la clase Comprable o implementarla en la clase que nos interesa
		 * ordenar ( si saltaría una excepción ) y sobrescribir  dicho método
		 */
		TreeSet<Restaurante> listRestauran = new TreeSet<Restaurante>(hRestauran);

		System.out.println("\n lista ordenada");

		for (Restaurante r : listRestauran) {

			System.out.println(r);
		}

	}

}

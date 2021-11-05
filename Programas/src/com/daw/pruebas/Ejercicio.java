package com.daw.pruebas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//HASHSET
		
		Set<String>Nombres = new HashSet<String>();
		
		Nombres.add("Juan");
		Nombres.add("Jose");
		Nombres.add("Carlos");
		Nombres.add("Antonio");
		Nombres.add("Miguel");
		Nombres.add("Ángel");
		Nombres.add("Julián");
		
		System.out.println("Los participantes son: " +Nombres);
				
		for (String cad1 : Nombres) {
			
			System.out.println("Jugadores: "+ cad1);
			
		}
			
		//TREESET
		
		Set<String> OrdenDeLetras = new TreeSet<String>();
		
		OrdenDeLetras.add("e");
		OrdenDeLetras.add("b");
		OrdenDeLetras.add("a");
		OrdenDeLetras.add("c");
		OrdenDeLetras.add("d");
		
		System.out.println("El orden de las letras es: " +OrdenDeLetras);
		
		for (String cad2 : OrdenDeLetras) {
			
			System.out.println("Orden de letras" +cad2);
			
		}

		//MAP
				
		//HASHMAP
		//Almacena los elementos desordenados
		
		Map <Integer, String> IdParticipantes = new HashMap<Integer, String>();
		
		IdParticipantes.put(523, "Antonio");
		IdParticipantes.put(445, "Juan");
		IdParticipantes.put(123, "Jose");
		IdParticipantes.put(696, "Carlos");
		IdParticipantes.put(778, "Miguel");
		IdParticipantes.put(225, "Angel");
		IdParticipantes.put(398, "Julián");
		
		System.out.println("El id de los participantes es: " +IdParticipantes);
		
		for (Map.Entry<Integer, String> entry : IdParticipantes.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println("Las id son:" +key);
		}
		
		//TREEMAP
		//Almacena los elementos ordenados
		
		Map <Integer, String> IdEliminados = new TreeMap<Integer, String>();		
		
		IdEliminados.put(568, "Alba");
		IdEliminados.put(756, "Diego");
		IdEliminados.put(256, "Rafael");
		IdEliminados.put(865, "Julio");
		IdEliminados.put(325, "Manuel");
		IdEliminados.put(596, "Raul");
		IdEliminados.put(893, "Sara");
		
		System.out.println("Los eliminados son: " +IdEliminados);
		
		for (Map.Entry<Integer, String> entry : IdEliminados.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println("El nombre de los eliminados es: " +val);
			System.out.println("El id de los eliminados es: " +key);
			
		}	

	}

}
 
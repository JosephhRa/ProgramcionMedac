package com.daw.pruebas;

import java.util.Arrays;
import java.util.Random;

public class Tema4Actividad2Ordenaton {
	long iteracionesOrdenacion = 0;
	long iteracionesBusqueda = 0;
	int numElemEncontrados = 0;
	int numArrOrdenados = 0;
	Random rand = new Random();
	
	public static void main(String[] args) {
		
		
		System.out.println("Empieza");
		
		Tema4Actividad2Ordenaton act = new Tema4Actividad2Ordenaton();
		
		//Creación e inicializacion de arrays desordenados
		int[] arr1 = act.inicializarArray(100);
		int[] arr2 = act.inicializarArray(100);
		int[] arr3 = act.inicializarArray(1000);
		int[] arr4 = act.inicializarArray(1000);
		int[] arr5 = act.inicializarArray(1000);
		int[] arr6 = act.inicializarArray(1000);
		int[] arr7 = act.inicializarArray(1000);
		int[] arr8 = act.inicializarArray(1000);
		int[] arr9 = act.inicializarArray(1000);
		int[] arr10 = act.inicializarArray(2000);
		int[] arr11 = act.inicializarArray(2000);
		int[] arr12 = act.inicializarArray(2000);
		
		//Creacion e inicializacion de numeros aleatorios
		int num1 = act.numRandom(1000);
		int num2 = act.numRandom(1000);
		int num3 = act.numRandom(1000);
		int num4 = act.numRandom(1000);
		int num5 = act.numRandom(1000);
		int num6 = act.numRandom(1000);
		int num7 = act.numRandom(1000);
		int num8 = act.numRandom(1000);
		int num9 = act.numRandom(1000);
		int num10 = act.numRandom(1000);
		int num11 = act.numRandom(1000);
		int num12 = act.numRandom(1000);
		
		//Mensajes de inicio del programa
		act.menu();
		
		//****************************************//
		//*Comienzo de la ordenacion de elementos*//
		//****************************************//
		long start = System.currentTimeMillis();
		long start2 = System.nanoTime();
		
		arr1 = act.ordenarArray(arr1);
		arr2 = act.ordenarArray(arr2);
		arr3 = act.ordenarArray(arr3);
		arr4 = act.ordenarArray(arr4);
		arr5 = act.ordenarArray(arr5);
		arr6 = act.ordenarArray(arr6);
		arr7 = act.ordenarArray(arr7);
		arr8 = act.ordenarArray(arr8);
		arr9 = act.ordenarArray(arr9);
		arr10 = act.ordenarArray(arr10);
		arr11 = act.ordenarArray(arr11);
		arr12 = act.ordenarArray(arr12);
		
		long end2 = System.nanoTime();
		long total2 = end2 - start2;
		
		
		//Comprobacion de si los arrays estan ordenados o no
		act.esArrayOrdenado(arr1);
		act.esArrayOrdenado(arr2);
		act.esArrayOrdenado(arr3);
		act.esArrayOrdenado(arr4);
		act.esArrayOrdenado(arr5);
		act.esArrayOrdenado(arr6);
		act.esArrayOrdenado(arr7);
		act.esArrayOrdenado(arr8);
		act.esArrayOrdenado(arr9);
		act.esArrayOrdenado(arr10);
		act.esArrayOrdenado(arr11);
		act.esArrayOrdenado(arr12);
		
		//Mensajes de tiempo de ejecucion en ordenacion de arrays
		act.tiempoEjecOrd(total2);
		
		//*************************************//
		//Comienzo de la busqueda de elementos*//
		//*************************************//
		start2 = 0; end2 = 0;
		start2 = System.nanoTime();
		
		act.busquedaLineal(num1, arr1);
		act.busquedaLineal(num2, arr2);
		act.busquedaLineal(num3, arr3);
		act.busquedaLineal(num4, arr4);
		act.busquedaBinaria(num5, arr5);
		act.busquedaBinaria(num6, arr6);
		act.busquedaBinaria(num7, arr7);
		act.busquedaBinaria(num8, arr8);
		act.busquedaBinaria(num9, arr9);
		act.busquedaBinaria(num10, arr10);
		act.busquedaBinaria(num11, arr11);
		act.busquedaBinaria(num12, arr12);
		
		end2 = System.nanoTime();
		total2 = end2 - start2;
		//Mensajes de tiempo de ejecucion en ordenacion de arrays
		act.tiempoEjecBusc(total2);
		
		//Mensajes de tiempo de ejecucion del programa entero
		long end = System.currentTimeMillis();
		act.tiempoEjecPrograma(end);
	}

	/**
	 * Menu de mensajes
	 */
	private void menu() {
		try {
			System.out.println("Comienza la prueba en 3..");
			Thread.sleep(1000);
			System.out.println("2..");
			Thread.sleep(1000);
			System.out.println("1..");
			Thread.sleep(1000);
			System.out.println("¡GO!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Impresion por pantalla de los mensajes asociados a la ordenacion de arrays
	 * @param tEjec : en nanosegundos
	 */
	private void tiempoEjecOrd(long tEjec) {
		System.out.printf("El tiempo transcurrido para ordenar todos los arrays ha sido de: %s microSegundos "
				+ "\n y han hecho falta un total de %s iteraciones. \n", (tEjec/1000), iteracionesOrdenacion);
		
		System.out.printf("Numero de arrays correctamente ordenados es de %s/12 \n", numArrOrdenados);
	}
	
	/**
	 * Impresion por pantalla de los mensajes asociados a la busqueda de elementos
	 * @param tEjec : en nanosegundos
	 */
	private void tiempoEjecBusc(long tEjec) {
		System.out.printf("El tiempo transcurrido para buscar todos los elementos ha sido de: %s microSegundos"
				+ "\n y han hecho falta un total de %s iteraciones. \n", (tEjec/1000), iteracionesBusqueda);
		
		System.out.printf("Numero de elementos encontrados es de %s/12 \n", numElemEncontrados);
	}
	
	/**
	 * 
	 * @param tEjec : en milisegundos
	 */
	private void tiempoEjecPrograma(long tEjec) {
		System.out.printf("El tiempo transcurrido total del programa ha sido de %s segundos "
				+ "\n y han hecho falta un total de %s iteraciones totales. \n", (double)(tEjec/1000), (iteracionesBusqueda + iteracionesOrdenacion));
	}
	
	/**
	 * Generador de array de enteros desordenado
	 * @param pos
	 * @return
	 */
	private int[] inicializarArray(int pos) {
		int[] a = new int[pos];
		
		for(int i=0;i<pos;i++) {
			a[i] = 1+rand.nextInt(pos);
		}
		return a;
	}
		
	/**
	 * Generador num random
	 * @param pos
	 * @return
	 */
	private int numRandom(int pos) {
		return (1+rand.nextInt(pos));
	}
	
	
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	/**
	 * Metodo que ordena un array de enteros dado.
	 * Se puede usar el método de ordenación que se desee entre los siguientes:
	 * 
	 * BubbleSort
	 * InsertionSort
	 * SelectionSort
	 * 
	 * MergeSort
	 * QuickSort
	 * 
	 * 4 puntos
	 * 
	 * @param arr
	 * @return
	 */
	private int[] ordenarArray(int[] arr) {
		//Tu codigo aqui debajo
		
		
		//creamos un for para recorrer la array
		for (int i = 0; i < arr.length-1; i++) {
			//creamos otro for para que la array se recorra el número de veces necesario
			for (int j = 0; j < arr.length-1; j++) {
				iteracionesOrdenacion++;
				//creamos un if para comparar nuestras array 
				if (arr[j+1] < arr[j]) {
					//creamos una variable auxiliar y guardamos el valor de la array
					int aux = arr[j];
					//Intercambiamos las variables 
					arr[j] = arr[j+1];
					arr[j+1] = aux;
				}
			}	
		}
	
		//No modificar este punto
		return arr;
	}
	
	
	/**
	 * Metodo de busqueda binaria
	 * 
	 * Apunte: Esta busqueda puede buscar en arrays únicamente ordenados
	 * 
	 * 3 puntos
	 * 
	 * @param num : elemento que se quiere encontrar
	 * @param arr : array de enteros
	 */
	private void busquedaBinaria(int num, int[] arr) {
		
		//Implementar codigo aqui debajo
		//creamos nuestras variables
		int inicio, fin, mitad;
		//creamos una variable boleana inicializada a false
		boolean encontrado = false;
		//inicializamos la variable inicio a 0
		inicio = 0;
		//inicializamos la variable fin al ultimo valor de nuestra array
		fin = arr.length-1;
		//Creamos un while que compara si inicio es menor o igual que fin y si no se ha encontrado
		while (inicio <= fin && encontrado == false) {
			iteracionesBusqueda++;
			//A la variable mitad le otorgamos el valor de inicio + fin /2
			mitad = (inicio + fin)/2;
			//Comprobamos si el número fue encontrado
			if (arr[mitad] == num) {
				numElemEncontrados++;
				//si el número se encuentra dentro de la array encontrado será igual a true
				encontrado = true;
				//System.out.println("El número: " + num + " fue encontrado");
			}else {
				//Si el número no fue encontrado reducimos el rango de busqueda 
				if (arr[mitad] > num) {
					//Se reduce el rango de busqueda final
					fin = mitad-1;	
					
				}else {
					//se reduce el rango de busqueda inicial
					inicio = mitad+1;
			
				}
			}
		}
		if (encontrado == false) {
			System.out.println("El número no fue encontrado");
		}
		
	}
	
	/**
	 * Metodo de busqueda lineal
	 * 
	 * Apunte: este tipo de busqueda puede buscar en arrays desordenados y ordenados
	 * 
	 * 2 puntos
	 * 
	 * @param num : elemento que se quiere encontrar
	 * @param arr : array de enteros
	 */
	private void busquedaLineal(int num, int[] arr) {
		
		//Implementar codigo aqui debajo
		//recorremos la array
		for(int i = 0; i < arr.length; i++) {
			iteracionesBusqueda++;
			//creamos una condición que nos diga si hemos encontrado el número que buscamos 
			if (arr[i] == num) {
				numElemEncontrados++;
				//System.out.println("el número fue encontrado");
				break;
				
			}
		}
		
	}
	
	/**
	 * Metodo que imprime por pantalla si un array dado esta correctamente ordenado de menor a mayor
	 * 
	 * 1 punto
	 * 
	 * @param arr : array de enteros
	 */
	private void esArrayOrdenado(int[] arr) {
		
		//Imprimir por pantalla: "El array no está ordenado" si no está ordenado.
		//o
		//"El array está correctamente ordenado" en caso de que sí lo esté.
		
		//creamos una variable booleana
		boolean ordenado = true;
		//recorremos el array
		for (int i = 0; i < arr.length-1; i++) {
			// Comprobamos si i es menor que i+1 
			if(arr[i] < arr[i+1]) {
				//En caso de que i sea menos que i+1 ordenado será igual a  true
				ordenado = true;
				//Imprimimos por pantalla
				System.out.println("El array está ordenado");
				//si i es mayor que i+1 el array no estará ordenado, por lo tanto, ordenado será igual a false
			}else {
				ordenado = false;
				//imprimimos por pantalla
				System.out.println("El array no está ordenado");
				
			}
			}
			
			
		}
				
	}
		
		
		
	


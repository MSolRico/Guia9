package Ejercicio3.Service;

import java.util.Arrays;
import java.util.Collections;

public class ArrayServiceNaui {
	
	
	public static Double [] inicializarA(Double [] a) {
		for(int i =0;i<a.length;i++) {
			a[i] = (Math.random()*10);
		}
		return a;
	}
	
	public static void mostrar(Double[] a) {
		for(int i =0;i<a.length;i++) {
			System.out.print("["+a[(Integer)i]+"]");
		}
	}
	
	public static Double [] ordenar(Double [] a) {
		Collections.reverse(Arrays.asList(a));
		return a;
		
	}
	
	public static void main(String[] args) {
		Double[] array = new Double[5];
		inicializarA(array);
		System.out.println("DESORDENADO");
		mostrar(array);
		
		ordenar(array);
		System.out.println("");
		System.out.println("ORDENADO");
		mostrar(array);
	}

}

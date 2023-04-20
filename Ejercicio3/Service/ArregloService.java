/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package Ejercicio3.Service;

import java.util.Arrays;
import java.util.Collections;

public class ArregloService {

    public static void inicializarA(double arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public static void mostrar(double arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " |");
        }
    }

    public static void ordenar(double arreglo[]) {
        Collections.reverse(Arrays.asList(arreglo));
    }

    public static void inicializarB(double arreglo[], double vacio[]) {
        System.arraycopy(arreglo, 0, vacio, 0, 10);
        Arrays.fill(vacio, 10, 20, 0.5);
    }

    public static void mostrar(double arregloA[], double arregloB[]) {
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print(arregloA[i] + " |");
        }
        System.out.println("");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.print(arregloB[i] + " |");
        }

    }

}

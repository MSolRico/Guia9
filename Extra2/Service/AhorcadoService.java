/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra2.Service;

import Extra2.Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class AhorcadoService {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra");
        String palabra = read.next();
        System.out.println("Ingrese cantidad de jugadas máximas");
        int cantidadEncontradas = 0;
        int cantidadJugadas = read.nextInt();
        char[] vector = palabra.toCharArray();
        return new Ahorcado(vector, cantidadEncontradas, cantidadJugadas);
    }

    public int longitud(Ahorcado a1) {
        return a1.getVector().length;
    }

    public boolean buscar(Ahorcado a1, String letra) {
        if (Arrays.toString(a1.getVector()).contains(letra) == true) {
            System.out.println("La letra es correcta");
            return true;
        } else {
            System.out.println("Incorrecto");
            return false;
        }
    }

    public String encontradas(Ahorcado a1, String letra) {
        char[] vector = a1.getVector();
        int contador = 0;
        for (int i = 0; i < a1.getVector().length; i++) {
            if (vector[i] == letra.charAt(0)) {
                contador++;
            }
        }
        a1.setCantidadEncontradas(contador);
        return "Número de letras (encontradas, faltantes): (" + contador + "," + (a1.getVector().length - contador) + ")";
    }

    public int intentos(Ahorcado a1) {
        a1.setCantidadJugadas(a1.getCantidadJugadas() - 1);
        return a1.getCantidadJugadas();
    }

    public void juego(Ahorcado a1) {
        System.out.print("Longitud de la palabra: ");
        System.out.println(longitud(a1));
        int a = a1.getVector().length;
        do {
            System.out.println("Ingrese una letra:");
            String letra = read.next();
            buscar(a1, letra);
            encontradas(a1, letra);
            System.out.println("Cantidad de intentos disponibles:");
            System.out.println(intentos(a1));
            a -= a1.getCantidadEncontradas();
        } while (!(a1.getCantidadJugadas() == 0) && !(a == 0));
        if (a == 0) {
            System.out.println("Ganaste!!");
        } else System.out.println("Perdiste :(");
    }
}

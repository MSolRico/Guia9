package Ejercicio2;

import Ejercicio2.Entidades.ParDeNumeros;
import Ejercicio2.Servicios.ParDeNumerosService;

public class Main {

    public static void main(String[] args) {

        ParDeNumerosService uno = new ParDeNumerosService();

        ParDeNumeros primer = new ParDeNumeros();

        uno.mostrarValores(primer);
        uno.devolverMayor(primer);
        uno.calcularPotencia(primer);
        uno.calculaRaiz(primer);

    }

}

package Ejercicio2.Servicios;

import Ejercicio2.Entidades.ParDeNumeros;

public class ParDeNumerosService {

    ParDeNumeros primer = new ParDeNumeros();

    public void mostrarValores(ParDeNumeros primer) {
        System.out.println("Primer numero : " + primer.getNum1() + "Segundo numero : " + primer.getNum2());

    }

    public void devolverMayor(ParDeNumeros primer) {
        if (primer.getNum1() > primer.getNum2()) {
            System.out.println("El numero mayor es " + primer.getNum1());
        } else {
            System.out.println("El numero mayor es " + primer.getNum2());
        }
    }

    public void calcularPotencia(ParDeNumeros primer) {
        int num1 = (int) (Math.round(primer.getNum1()));
        int num2 = (int) (Math.round(primer.getNum2()));
        System.out.println("num1 redondeado " + num1 + "num2 redondeado " + num2);
        if (num1 > num2) {
            System.out.println("El primer numero elevador por el segundo da : " + Math.pow(num1, num2));
        } else {
            System.out.println("El segundo numero elevador por el primero da : " + Math.pow(num2, num1));
        }

    }

    public void calculaRaiz(ParDeNumeros primer) {
        int num1 = (int) (Math.abs(primer.getNum1()));
        int num2 = (int) (Math.abs(primer.getNum2()));

        if (num1 < num2) {
            System.out.println("La raiz cuadrada del primero numero es : " + Math.sqrt(num1));
        } else {
            System.out.println("La raiz cuadrada del segundo numero es : " + Math.sqrt(num2));
        }
    }
}

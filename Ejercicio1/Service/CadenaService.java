/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Service;

import Ejercicio1.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class CadenaService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public void mostrarVocales(Cadena c1){
        int cont = 0, i = 0;
        for (i = 0; i < c1.getLongitud(); i++) {
              if ((Character.toString(c1.getFrase().charAt(i)).matches("[aeiouAEIOU]")) ){
                  cont++;
              }
        }
        System.out.println("Cantidad de veces que tiene vocales es igual a: " + cont);
    }
    
    public void invertirFrase(Cadena c1){
        StringBuffer sb = new StringBuffer(c1.getFrase());
        sb.reverse();
        System.out.println("La frase invertida es " + sb);
    }
    
    public void vecesRepetido(Cadena c1){
        System.out.println("Ingrese un caracter");
        String letra = read.nextLine();
        int cont = 0, i;
        for (i = 0; i < c1.getLongitud(); i++) {
              if ((Character.toString(c1.getFrase().charAt(i)).matches(letra)) ){
                  cont++;
              }
        }
        System.out.println("Cantidad de veces que tiene ese caracter: " + cont);
    }
    
    public void compararLongitud(Cadena c1){
        System.out.println("Ingrese una frase");
        String frase = read.nextLine();
        int longit = frase.length();
        if (longit == c1.getLongitud()){
            System.out.println("La cadena es igual");
        } else System.out.println("La cadena ingresada es diferente");
    }
    
    public String unirFrases(Cadena c1){
        System.out.println("Ingrese una frase");
        String frase = " " + read.nextLine();
        frase = c1.getFrase().concat(frase);
        System.out.println(frase);
        return frase;
    }
    
    public String reemplazar(Cadena c1){
        System.out.println("Elige un caracter");
        String carac = read.next();
        carac = c1.getFrase().replaceAll("a", carac);
        System.out.println(carac);
        return carac;
    }
    
    public boolean contiene(Cadena c1){
        System.out.println("Ingrese una letra");
        String a = read.next();
        return c1.getFrase().contains(a);
    }
    
}

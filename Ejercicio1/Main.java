/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Ejercicio1.Entidades.Cadena;
import Ejercicio1.Service.CadenaService;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        CadenaService cs = new CadenaService();
        Cadena c1 = new Cadena(leer.next());
        int opc;
        do {
        System.out.println("Desea: 1)Saber cuantas vocales tiene la frase\n2)Invertir la frase\n3)Ver cuantas veces se repite un caracter especifico\n4)Unir otra frase a la frase ya existente\n5)Reemplazar una letra por otra\n6)Ver si la frase tiene una letra especifica");
        opc = leer.nextInt();
        switch (opc) {
            case 1:
                cs.mostrarVocales(c1);
                break;
            case 2:
                cs.invertirFrase(c1);
                break;
            case 3:
                cs.vecesRepetido(c1);
                break;               
            case 4:
                cs.unirFrases(c1);
                break;
            case 5:
                cs.reemplazar(c1);
                break;
            case 6:
                System.out.println(cs.contiene(c1));
                break;
        }    
        } while (opc<=6);
        
    }
    
}

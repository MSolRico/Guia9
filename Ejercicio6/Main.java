/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import Ejercicio6.Entidades.Curso;
import Ejercicio6.Service.ClaseService;

/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseService sc = new ClaseService();
        Curso c1 = sc.crearCurso();
        double ganancia = sc.calcularGananciaSemanal(c1);
        System.out.println("Ganancia de la semana: " + ganancia);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import Ejercicio5.Entidades.Persona;
import Ejercicio5.Servicios.PersonaService;

/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        int edad = ps.calcularEdad(p1);
        System.out.println(ps.menorQue(p1));
        ps.mostrarPersona(p1);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5.Servicios;

import Ejercicio5.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class PersonaService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = read.next();
        System.out.println("Ingrese su fecha de nacimiento");
        int dia = read.nextInt();
        int mes = read.nextInt();
        int anio = read.nextInt();
        Date nacimiento = new Date(anio-1900,mes-1,dia);
        return new Persona(nombre, nacimiento);
    }

    public int calcularEdad(Persona p1) {
        Date hoy = new Date();
        int año;
        if (hoy.getMonth() <= p1.nacimiento.getMonth()) {
            año = hoy.getYear() - p1.nacimiento.getYear() - 1;
            if (hoy.getMonth() == p1.nacimiento.getMonth() && hoy.getDate() == p1.nacimiento.getDate()) {
                año = hoy.getYear() - p1.nacimiento.getYear();
                System.out.println("Feliz cumple!!");
            }
        } else {
            año = hoy.getYear() - p1.nacimiento.getYear();
        }

        return año;
    }

    public boolean menorQue(Persona p1) {
        System.out.println("Es " + p1.getNombre() + " menor a -ingrese edad-:");
        int edad = read.nextInt();
        if (edad > calcularEdad(p1)){
            return true;
        } else
            return false;
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println(p1.toString());
        System.out.println("Edad: " + calcularEdad(p1) + " años.");
    }
}

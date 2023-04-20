/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6.Service;

import Ejercicio6.Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class ClaseService {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarAlumnos(String[] alumnos){
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre del alumno");
            alumnos[i] = read.next();
        }
    }
    
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso = read.next();
        System.out.println("Ingrese la cantidad de horas por dia");
        int cantidadHorasPorDia = read.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana");
        int cantidadDiasPorSemana = read.nextInt();
        System.out.println("Ingrese turno (mañana o tarde)");
        String turno = read.next();
        System.out.println("Ingrese el precio por hora");
        int precioPorHora = read.nextInt();
        System.out.println("Ingrese sus alumnos:");
        String[] alumnos = new String[5];
        cargarAlumnos(alumnos);
        return new Curso(nombreCurso, cantidadHorasPorDia,cantidadDiasPorSemana,turno,precioPorHora);
    }
    
    public double calcularGananciaSemanal(Curso c1){
        return c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*5*c1.getCantidadDiasPorSemana();
    }
}

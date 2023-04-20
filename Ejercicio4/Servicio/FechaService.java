package Ejercicio4.Servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner scan = new Scanner(System.in);

    public Date fechaDeNacimiento() {
        System.out.println("Ingrese día, mes y año de su nacimiento: ");
        int dia, mes, anio;
        dia = scan.nextInt();
        mes = scan.nextInt();
        anio = scan.nextInt();
        return new Date(anio - 1900, mes - 1, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public int diferenciaEdad(Date dia, Date hoy) {
        int año;
        if (hoy.getMonth() <= dia.getMonth()) {
            año = hoy.getYear() - dia.getYear() - 1;
            if (hoy.getMonth() == dia.getMonth() && hoy.getDate() == dia.getDate()) {
                año = hoy.getYear() - dia.getYear();
                System.out.println("Feliz cumple!!");
            }
        } else {
            año = hoy.getYear() - dia.getYear();
        }
        return año;
    }

}

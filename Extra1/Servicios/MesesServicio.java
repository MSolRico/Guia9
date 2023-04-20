/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra1.Servicios;

import Extra1.Entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class MesesServicio {

    Scanner read = new Scanner(System.in);

    public void adivine(Meses m1) {
        String mes;
        do {
            System.out.println("Adivine el mes secreto (en minúsculas)");
            mes = read.nextLine();
            
            if (mes.equals(m1.getMesSecreto())) {
                System.out.println("Acertaste!!");
            } else System.out.println("Incorrecto :(");
            
        } while (!mes.equals(m1.getMesSecreto()));
    }
}

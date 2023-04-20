/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra1;

import Extra1.Entidades.Meses;
import Extra1.Servicios.MesesServicio;

/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MesesServicio ms = new MesesServicio();
        Meses m1 = new Meses();
        ms.adivine(m1);
    }
    
}

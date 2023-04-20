/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra2.Entidades;

/**
 *
 * @author SFC
 */
public class Ahorcado {

    public char[] vector;
    public int cantidadEncontradas;
    public int cantidadJugadas;

    public Ahorcado() {
    }

    public Ahorcado(char[] vector, int cantidadEncontradas, int cantidadJugadas) {
        this.vector = vector;
        this.cantidadEncontradas = cantidadEncontradas;
        this.cantidadJugadas = cantidadJugadas;
    }

    public char[] getVector() {
        return vector;
    }

    public void setVector(char[] vector) {
        this.vector = vector;
    }

    public int getCantidadEncontradas() {
        return cantidadEncontradas;
    }

    public void setCantidadEncontradas(int cantidadEncontradas) {
        this.cantidadEncontradas = cantidadEncontradas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }
    
}

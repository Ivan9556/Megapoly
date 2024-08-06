package megapoly;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan-
 */
public class VeCarcel extends Calles {

    private String nombre;
    private int posicion;
    private int numeroSalida;
    private int numeroSalida2;
    private int pulsador;
    
    public VeCarcel() {
    }
    
    public VeCarcel(int posicion) {
        this.posicion = posicion;
    }
    
    public VeCarcel(String nombre) {
        this.nombre = nombre;        
    }
    
    public int getPosicion() {
        return posicion;
    }
    
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public void vealaCarcel(FichaTablero fichaJugador, Calles[] calle, JLabel[] labels) {
        JOptionPane.showMessageDialog(null, "¡Ve a la cárcel");
        labels[21].setIcon(null);
        labels[fichaJugador.getPosicionFicha()].setIcon(null);
        fichaJugador.setPosicionFicha(8);
        labels[fichaJugador.getPosicionFicha()].setIcon(fichaJugador.getIcono());
    }
}

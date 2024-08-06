package megapoly;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CalleCarcel extends Calles {

    private String nombre;
    private int numeroSalida;
    private int numeroSalida2;
    private int pulsador;

    public CalleCarcel() {
    }

    public CalleCarcel(int numeroSalida) {
        this.numeroSalida = numeroSalida;
        this.numeroSalida2 = numeroSalida2;
    }

    public CalleCarcel(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSalida() {
        return numeroSalida;
    }

    public void setNumeroSalida(int numeroSalida) {
        this.numeroSalida = numeroSalida;
    }

    public void setNumeroSalida2(int numeroSalida2) {
        this.numeroSalida2 = numeroSalida2;
    }

    @Override
    public String toString() {
        return "CalleCarcel{" + "numeroSalida=" + numeroSalida + ", numeroSalida2=" + numeroSalida2 + ", pulsador=" + pulsador + '}';
    }

    public void salirCarcel(FichaTablero fichaJugador, Calles[] calles, JLabel[] labels) {

        JOptionPane.showMessageDialog(null, "Jugador lanza el dado");
        int numeroSalida = numeroAleatorio();
        JOptionPane.showMessageDialog(null, "El resultado es " + numeroSalida);

        if (numeroSalida == 5) {
            JOptionPane.showMessageDialog(null, "Has salido de la cárcel");
            numeroSalida = numeroAleatorio();
            JOptionPane.showMessageDialog(null, "Lazas el dado y el resultado es " + numeroSalida);
            JOptionPane.showMessageDialog(null, "Avanzas " + numeroSalida + " casillas");
            labels[8].setIcon(null);
            labels[fichaJugador.getPosicionFicha()].setIcon(null);
            fichaJugador.setPosicionFicha(fichaJugador.getPosicionFicha() + numeroSalida);
            labels[fichaJugador.getPosicionFicha()].setIcon(fichaJugador.getIcono());
        } else {
            JOptionPane.showMessageDialog(null, "Sigues en la cárcel");
            int turno = 2;

        }
    }

    public void salirCarcel2(FichaTablero fichaJugador, Calles[] calles, JLabel[] labels) {

        JOptionPane.showMessageDialog(null, "Jugador lanza el dado");
        int numeroSalida2 = numeroAleatorio();
        JOptionPane.showMessageDialog(null, "El resultado es " + numeroSalida2);

        if (numeroSalida2 == 5) {
            JOptionPane.showMessageDialog(null, "Has salido de la cárcel");
            numeroSalida2 = numeroAleatorio();
            JOptionPane.showMessageDialog(null, "Lazas el dado y el resultado es " + numeroSalida2);
            JOptionPane.showMessageDialog(null, "Avanzas " + numeroSalida2 + " casillas");
            labels[8].setIcon(null);
            labels[fichaJugador.getPosicionFicha()].setIcon(null);
            fichaJugador.setPosicionFicha(fichaJugador.getPosicionFicha() + numeroSalida2);
            labels[fichaJugador.getPosicionFicha()].setIcon(fichaJugador.getIcono());
        } else {
            JOptionPane.showMessageDialog(null, "Sigues en la cárcel");
            int turno = 1;
        }
    }

    public int numeroAleatorio() {
        Random random = new Random();
        int numeroBoton = random.nextInt(6) + 1;
        return numeroBoton;
    }
    
    public void tarjetaCarcel(FichaTablero fichaJugador, Calles[] calles, JLabel[] labels){
            numeroSalida = numeroAleatorio();
            JOptionPane.showMessageDialog(null, "Lazas el dado y el resultado es " + numeroSalida);
            JOptionPane.showMessageDialog(null, "Avanzas " + numeroSalida + " casillas");
            labels[8].setIcon(null);
            labels[fichaJugador.getPosicionFicha()].setIcon(null);
            fichaJugador.setPosicionFicha(fichaJugador.getPosicionFicha() + numeroSalida);
            labels[fichaJugador.getPosicionFicha()].setIcon(fichaJugador.getIcono());
    }

}

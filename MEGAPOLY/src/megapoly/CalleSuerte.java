package megapoly;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CalleSuerte extends Calles {

    private int tarjeta;
    private String nombre;
    private Jugadores jugador1;
    private Jugadores jugador2;

    public CalleSuerte() {
    }

    public CalleSuerte(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public CalleSuerte(String nombre) {
        this.nombre = nombre;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "CalleSuerte{" + "tarjeta=" + tarjeta + '}';
    }

    public void tarjetas(int numeroTarjeta, Jugadores jugador, FichaTablero fichaJugador, JLabel[] labels, Calles[] calles) {
        switch (numeroTarjeta) {
            case 1:
                JOptionPane.showMessageDialog(null, "Aumenta tus Megamonedas en 5!");
                jugador.setDinero(jugador.getDinero() + 5);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Avanza hasta Paseo de los Tristes");
                labels[4].setIcon(null);
                labels[fichaJugador.getPosicionFicha()].setIcon(null);
                fichaJugador.setPosicionFicha(25);
                labels[fichaJugador.getPosicionFicha()].setIcon(fichaJugador.getIcono());
                if (calles[fichaJugador.getPosicionFicha()].getPropiedad() == 0) {
                    String informacion = calles[fichaJugador.getPosicionFicha()].getNombre();
                    Object[] opciones = {"Si", "No"};
                    int pregunta = JOptionPane.showOptionDialog(null,
                            ("Quieres comprar la calle " + informacion),
                            "Pregunta",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, opciones, opciones[0]);

                    if (pregunta == JOptionPane.YES_OPTION) {
                        int dineroActual = jugador.getDinero();
                        int precioCalle = calles[fichaJugador.getPosicionFicha()].getPrecio();
                        int dineroFinal = dineroActual - precioCalle;
                        jugador.setDinero(dineroFinal);
                        calles[25].setPropiedad(1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Deja pasar");
                    }
                } else {
                    if (calles[25].getPropiedad() == 2) {
                        JOptionPane.showMessageDialog(null, "Esta calle pertenece al jugador 2");
                        JOptionPane.showMessageDialog(null, "El coste por caer es de 17 MegaMonedas");
                        int dineroActual = jugador.getDinero();
                        int dineroFinal = dineroActual - 17;
                        jugador.setDinero(dineroFinal);
                    }
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Tarjeta SAL DE LA CARCEL");
                JOptionPane.showMessageDialog(null, "Con ella podrás salir de la carcel");
                jugador.setTarjetas(1);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Recibes 20 MegaMonedas sin pasar por la Salida");
                jugador.setDinero(jugador.getDinero() + 20);
                break;
        }
    }

    public void tarjetas2(int numeroTarjeta2, Jugadores jugador, FichaTablero fichaJugador, JLabel[] labels, Calles[] calles) {
        switch (numeroTarjeta2) {
            case 1:
                JOptionPane.showMessageDialog(null, "Aumenta tus Megamonedas en 5!");
                jugador.setDinero(jugador.getDinero() + 5);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Avanza hasta Paseo de los Tristes");
                fichaJugador.setPosicionFicha(25);
                labels[4].setIcon(null);
                labels[fichaJugador.getPosicionFicha()].setIcon(null);
                fichaJugador.setPosicionFicha(25);
                labels[fichaJugador.getPosicionFicha()].setIcon(fichaJugador.getIcono());
                if (calles[fichaJugador.getPosicionFicha()].getPropiedad() == 0) {
                    String informacion = calles[fichaJugador.getPosicionFicha()].getNombre();
                    Object[] opciones = {"Si", "No"};
                    int pregunta = JOptionPane.showOptionDialog(null,
                            ("Quieres comprar la calle " + informacion),
                            "Pregunta",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, opciones, opciones[0]);

                    if (pregunta == JOptionPane.YES_OPTION) {
                        int dineroActual = jugador.getDinero();
                        int precioCalle = calles[fichaJugador.getPosicionFicha()].getPrecio();
                        int dineroFinal = dineroActual - precioCalle;
                        jugador.setDinero(dineroFinal);
                        calles[25].setPropiedad(2);
                    } else {
                        JOptionPane.showMessageDialog(null, "Deja pasar");
                    }
                } else if (calles[25].getPropiedad() == 1) {
                    JOptionPane.showMessageDialog(null, "Esta calle pertenece al jugador 1");
                    JOptionPane.showMessageDialog(null, "El coste por caer es de 17 MegaMonedas");
                    int dineroActual = jugador.getDinero();
                    int dineroFinal = dineroActual - 17;
                    jugador.setDinero(dineroFinal);
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Tarjeta SAL DE LA CARCEL");
                JOptionPane.showMessageDialog(null, "Con ella podrás salir de la carcel");
                jugador.setTarjetas(1);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Recibes 20 MegaMonedas sin pasar por la Salida");
                jugador.setDinero(jugador.getDinero() + 20);
                break;
        }
    }
}

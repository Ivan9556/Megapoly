package megapoly;


import java.io.Serializable;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Jugadores implements Serializable{
    //Atributos    

    private String nombre;
    private int dinero;
    private int tarjetas;

//Constructor por defecto
    public Jugadores() {
        nombre = "nombreJugador";
        dinero = 0;
        tarjetas = 0;
    }
//Construcor  con atributos

    public Jugadores(String nombre, int dinero, int tarjetas) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.tarjetas = tarjetas;
    }
//Observadores

    public String getNombre() {
        return nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public int getTarjetas() {
        return tarjetas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void setTarjetas(int tarjetas) {
        this.tarjetas = tarjetas;
    }

    public void aumentoDinero(Jugadores jugador) {
        int dinero = jugador.getDinero() + 20;
        jugador.setDinero(dinero);
    }

}

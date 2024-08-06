package megapoly;


import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Calles implements Serializable {
  
   private String nombre;
   private int precio;
   private int propiedad;

    public Calles() {
    nombre="nombreCalle";
    precio=0;
    propiedad = 0;
    }

    public Calles(String nombre, int precio, int propiedad) {
        this.nombre = nombre;
        this.precio = precio;
        this.propiedad = propiedad;
    }
    
    public Calles(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPropiedad() {
        return propiedad;
    }
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPropiedad(int propiedad) {
        this.propiedad = propiedad;
    }

    @Override
    public String toString() {
        return "Calles{" + "nombre=" + nombre + ", precio=" + precio + ", propiedad=" + propiedad + '}';
    }

}
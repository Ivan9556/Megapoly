package megapoly;



import java.io.Serializable;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class FichaTablero implements Serializable{

    private int posicionFicha;
    private int avanzarFicha;
    private ImageIcon icono;

    public FichaTablero() {
        this.posicionFicha = 0;
        this.avanzarFicha = 0;
        this.icono = null;
    }

    public FichaTablero(ImageIcon icono) {
        this.icono = icono;
        this.posicionFicha= 0;
    }

    public ImageIcon getIcono() {
        return icono;
    }

    public void setIcono(ImageIcon icono) {
        this.icono = icono;
    }



    public int obtenerPosicion() {
        return posicionFicha;
    }

    public void avanzarFicha(int avance) {
        this.posicionFicha = (this.posicionFicha + avance);

    }

    public int getPosicionFicha() {
        return posicionFicha;
    }

    public int getAvanzarFicha() {
        return avanzarFicha;
    }



    public void setPosicionFicha(int posicionFicha) {
        this.posicionFicha = posicionFicha;
    }

    public void setAvanzarFicha(int avanzarFicha) {
        this.avanzarFicha = avanzarFicha;
    }

 

}

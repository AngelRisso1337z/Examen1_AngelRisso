package examen1_progra2;

import java.awt.Color;

public class Zapatos extends Objeto{
    private int talla;
    private String suela;
    private int confort;

    public Zapatos() {
        super();
    }

    public Zapatos(int talla, String suela, int confort, Color color, String descripcion, String marca, int tamagno, int calidad, int precio, String duegno) {
        super(color, descripcion, marca, tamagno, calidad, precio, duegno);
        this.talla = talla;
        this.suela = suela;
        this.confort = confort;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public int getConfort() {
        return confort;
    }

    public void setConfort(int confort) {
        this.confort = confort;
    }

    @Override
    public String toString() {
        return super.toString()+ " talla=" + talla + ", suela=" + suela + ", confort=" + confort + '}';
    }
    
}

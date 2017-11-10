/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_progra2;

import java.awt.Color;

/**
 *
 * @author HP_AMD_64
 */
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
        return super.toString()+ "talla=" + talla + ", suela=" + suela + ", confort=" + confort + '}';
    }
    
}

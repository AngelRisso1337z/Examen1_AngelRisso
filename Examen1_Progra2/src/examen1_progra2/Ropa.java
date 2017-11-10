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
public class Ropa extends Objeto{
    private int talla;
    private String material;
    private String pais;

    public Ropa() {
        super();
    }

    public Ropa(int talla, String material, String pais, Color color, String descripcion, String marca, int tamagno, int calidad, int precio, String duegno) {
        super(color, descripcion, marca, tamagno, calidad, precio, duegno);
        this.talla = talla;
        this.material = material;
        this.pais = pais;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + " talla=" + talla + ", material=" + material + ", pais=" + pais + '}';
    }
    
}

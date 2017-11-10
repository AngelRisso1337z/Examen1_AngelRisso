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
public class Objeto {
    protected Color color;
    protected String descripcion;
    protected String marca;
    protected int tamagno;
    protected int calidad;
    protected int precio;
    protected String duegno;

    public Objeto() {
    }

    public Objeto(Color color, String descripcion, String marca, int tamagno, int calidad, int precio, String duegno) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamagno = tamagno;
        this.calidad = calidad;
        this.precio = precio;
        this.duegno = duegno;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamagno() {
        return tamagno;
    }

    public void setTamagno(int tamagno) {
        this.tamagno = tamagno;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDuegno() {
        return duegno;
    }

    public void setDuegno(String duegno) {
        this.duegno = duegno;
    }

    @Override
    public String toString() {
        return "Objeto{" + "descripcion=" + descripcion + ", marca=" + marca + ", tamaño=" + tamagno + ", precio=" + precio + ", dueño=" + duegno + '}';
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_progra2;

import java.awt.Color;
import java.util.Date;

public class Objetos_del_Hogar extends Objeto {
    private int vida_util;
    private String area;
    private String instrucciones;
    private Date fecha_de_Compra;

    public Objetos_del_Hogar() {
        super();
    }

    

    public Objetos_del_Hogar(int vida_util, String area, String instrucciones, Date fecha_de_Compra, Color color, String descripcion, String marca, int tamagno, int calidad, int precio, String duegno) {
        super(color, descripcion, marca, tamagno, calidad, precio, duegno);
        this.vida_util = vida_util;
        this.area = area;
        this.instrucciones = instrucciones;
        this.fecha_de_Compra = fecha_de_Compra;
    }

    public int getVida_util() {
        return vida_util;
    }

    public void setVida_util(int vida_util) {
        this.vida_util = vida_util;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Date getFecha_de_Compra() {
        return fecha_de_Compra;
    }

    public void setFecha_de_Compra(Date fecha_de_Compra) {
        this.fecha_de_Compra = fecha_de_Compra;
    }

    @Override
    public String toString() {
        return super.toString() + " vida_util=" + vida_util + ", area=" + area + ", instrucciones=" + instrucciones + ", fecha_de_Compra=" + fecha_de_Compra + '}';
    }
    
    
}

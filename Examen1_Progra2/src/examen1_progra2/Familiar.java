 
package examen1_progra2;

import java.util.ArrayList;

public class Familiar extends Persona{
    private String rol;
    private String trabajo;
    private double altura;
    private double peso;
    public ArrayList<Objeto> objeto;

    public Familiar() {
        super();
    }

    public Familiar(String rol, String trabajo, double altura, double peso, String nombre, int edad, int ID, String sexo, String estado_civil) {
        super(nombre, edad, ID, sexo, estado_civil);
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
        
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<Objeto> getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto o) {
        objeto.add(o);
    }

    @Override
    public String toString() {
        return super.toString() + "rol=" + rol + ", trabajo=" + trabajo + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
}

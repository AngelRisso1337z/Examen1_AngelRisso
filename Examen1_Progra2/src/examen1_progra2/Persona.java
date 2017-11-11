package examen1_progra2;

import java.util.ArrayList;

public class Persona {

    protected String nombre;
    protected int edad;
    protected int ID;
    protected String sexo;
    protected String estado_civil;
    protected ArrayList mensajeria;

    public Persona() {
    }

    public Persona(String nombre, int edad, int ID, String sexo, String estado_civil) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public ArrayList getMensajeria() {
        return mensajeria;
    }

    public void setMensajeria(ArrayList mensajeria) {
        this.mensajeria = mensajeria;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre  ;
    }
    
}

package examen1_progra2;

import java.util.ArrayList;

public class Personal extends Persona{
    
    private String ocupacion;
    private String horario;
    private int semanas_trabajadas;
    private double sueldo;

    public Personal() {
        super();
    }
    
    public Personal(String ocupacion, String horario, int semanas_trabajadas, double sueldo, String nombre, int edad, int ID, String sexo, String estado_civil) {
        super(nombre, edad, ID, sexo, estado_civil);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.semanas_trabajadas = semanas_trabajadas;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemanas_trabajadas() {
        return semanas_trabajadas;
    }

    public void setSemanas_trabajadas(int semanas_trabajadas) {
        this.semanas_trabajadas = semanas_trabajadas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+ "ocupacion=" + ocupacion + ", horario=" + horario + ", semanas_trabajadas=" + semanas_trabajadas + ", sueldo=" + sueldo + '}';
    }
    
    
}

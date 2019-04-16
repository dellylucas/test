package com.dfl9.apptst.Model;

public class Estudiante extends  Persona {
    private String cod;
    private String colegio;
    private float promedio;

    public Estudiante(String cod, String colegio, float promedio,String id, String nombre) {
        super(id,nombre);
        this.cod = cod;
        this.colegio = colegio;
        this.promedio = promedio;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}

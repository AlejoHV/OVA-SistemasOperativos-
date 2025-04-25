package com.example.sistemas.ovasistemasoperativos.model;


public class ResultadoProcesoSJF {
    private String nombre;
    private int tiempoInicio;
    private int tiempoFin;
    private int tiempoEspera;

    public ResultadoProcesoSJF() {
    }

    public ResultadoProcesoSJF(String nombre, int tiempoInicio, int tiempoFin, int tiempoEspera) {
        this.nombre = nombre;
        this.tiempoInicio = tiempoInicio;
        this.tiempoFin = tiempoFin;
        this.tiempoEspera = tiempoEspera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(int tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public int getTiempoFin() {
        return tiempoFin;
    }

    public void setTiempoFin(int tiempoFin) {
        this.tiempoFin = tiempoFin;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }
}

package com.example.sistemas.ovasistemasoperativos.model;


public class ProcesoSJF {

    private String nombre;
    private int rafaga;

    public ProcesoSJF(){
    }

    public ProcesoSJF (String nombre, int rafaga){
        this.nombre = nombre;
        this.rafaga = rafaga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRafaga() {
        return rafaga;
    }

    public void setRafaga(int rafaga) {
        this.rafaga = rafaga;
    }

    /*public double calcularProceso() {
        if (rafaga < 0){
          throw new ArithmeticException("El tiempo de duración del proceso debe ser positivo");
        }
        return rafaga;
    }
    
     */
}

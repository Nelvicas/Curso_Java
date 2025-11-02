package com.aluracursos.audio.modelos;

public class Audio {

       // atributos
    private String titulo;
    private int totalReproducciones;
    private int totalDeMegusta;
    private int clasificacion;


       // metodo para sobreescribir


       // metodos

    public void meGusta(){
        this.totalDeMegusta++;
    }

    public void reproduce(){
        this.totalReproducciones++;
    }


       //  getter y setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public int getTotalDeMegusta() {
        return totalDeMegusta;
    }

    public void setTotalDeMegusta(int totalDeMegusta) {
        this.totalDeMegusta = totalDeMegusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}

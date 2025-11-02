package com.aluracursos.audio.modelos;

public class Podcast extends Audio{

    //  atributos
    private String presentador;
    private String descripcion;


    //  metodo  para sobreescribir metodos

    @Override
    public int getClasificacion() {
        if ( getTotalReproducciones() >= 200){
            return 9;
        } else {
            return 2;
        }
    }


    // getters y setters


    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

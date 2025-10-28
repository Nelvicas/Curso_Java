package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

///  programacion orientada a objetos   POO


public class Pelicula  extends Titulo implements Clasificacion {

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);    // casteo  (int)
    }

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
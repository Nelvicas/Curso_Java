package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;


    public int getTiempoTotal() {
        return tiempoTotal;
    }


    // polimorfismo (El polimorfismo es tener un mismo método que se usa de diferentes maneras según el objeto que lo ejecute.)

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }


}

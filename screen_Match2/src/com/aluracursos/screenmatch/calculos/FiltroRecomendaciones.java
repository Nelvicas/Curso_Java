package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendaciones {

    void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy nien evaluado en el momento");
        }else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Popular por el momento");
        }else{
            System.out.println("Colocalo en tu lista para verlo despues");
        }
    }
}

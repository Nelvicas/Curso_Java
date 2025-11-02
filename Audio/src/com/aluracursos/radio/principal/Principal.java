package com.aluracursos.radio.principal;

import com.aluracursos.audio.modelos.Cancion;
import com.aluracursos.audio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        // Creando intancias ( objetos)
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");  // se utiliza set para modificar informacion

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Agular");
        miPodcast.setTitulo("Cafe.tech");


        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalReproducciones());
        System.out.println("Total de me Gusta: " + miCancion.getTotalDeMegusta());
    }
}
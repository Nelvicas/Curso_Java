package com.aluracursos.screenmatch.modelos;

public class Series extends Titulo {
    int temporadas;
    int episodiosPorTemporadas;
    int minutosPorEpisodio;



    @Override     ///  sobreescritura de metodos
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodio;
    }

    ///   metodos getter (obtener)  metodo setter (colocar datos)


    public int getTemposadas() {
        return temporadas;
    }

    public void setTemposadas(int temposadas) {
        this.temporadas = temposadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}

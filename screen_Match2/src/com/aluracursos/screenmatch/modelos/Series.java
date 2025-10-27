package com.aluracursos.screenmatch.modelos;

public class Series extends Titulo {
    int temposadas;
    int episodiosPorTemporadas;
    int minutosPorEpisodio;




    ///   metodos getter (obtener)  metodo setter (colocar datos)
    public int getTemposadas() {
        return temposadas;
    }

    public void setTemposadas(int temposadas) {
        this.temposadas = temposadas;
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

package com.aluracursos.screenmatch.modelos;

///  programacion orientada en objetos   POO


public class Pelicula {

    // clase modelo: nos sirve para crear diferentes objetos ( peliculas)
    //  atributos
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;

    private double sumaDeLasEvoluciones;     // modificadores de acceso (private, public,protected)
    private int totalDeLasEvaluaciones;


        // metodo getter para obtener
    public int getTotalDeLasEvaluaciones() {     // metodo para obtener (getter)

        return totalDeLasEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }


    // metodos setter  para colocar datos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }


    //  metodo del tipo void
    public void muestraFichaTecnica() {
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento fue en: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
    }

    public void evalua(double nota) {
        sumaDeLasEvoluciones += nota;
        //sumaDeLasEvoluciones = sumaDeLasEvoluciones + nota;
        totalDeLasEvaluaciones++;
    }

    //   metodo del tipo double (retorna un valor de tipo double)

    public double calculaMedia() {
        return sumaDeLasEvoluciones / totalDeLasEvaluaciones;
    }

}
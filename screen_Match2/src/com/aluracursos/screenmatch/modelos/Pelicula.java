package com.aluracursos.screenmatch.modelos;

///  programacion orientada en objetos   POO


public class Pelicula {

    // clase modelo: nos sirve para crear diferentes objetos ( peliculas)
        //  atributos
    public String nombre;
    public int fechaDeLanzamiento;
    public int duracionEnMinutos;
    public boolean incluidoEnElPlan;

    private double sumaDeLasEvoluciones;     // modificadores de acceso (private, public,protected)
    private int totalDeLasEvaluaciones;


    public int getTotalDeLasEvaluaciones(){     // metodo para obtener (getter)
        return totalDeLasEvaluaciones;
    }


    //  metodo del tipo void
    public void muestraFichaTecnica(){
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento fue en: " + fechaDeLanzamiento);
    }

    public void evalua(double nota){
        sumaDeLasEvoluciones += nota;
        //sumaDeLasEvoluciones = sumaDeLasEvoluciones + nota;
        totalDeLasEvaluaciones++;
    }

    //   metodo del tipo double (retorna un valor de tipo double)

    public double calculaMedia(){
        return sumaDeLasEvoluciones / totalDeLasEvaluaciones;
    }


}
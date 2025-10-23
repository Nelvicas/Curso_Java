
///  programacion orientada en objetos   POO


public class Pelicula {

    // clase modelo: nos sirve para crear diferentes objetos ( peliculas)
        //  atributos
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;

    private double sumaDeLasEvoluciones;     // modificadores de acceso (private, public,protected)
    private int totalDeLasEvaluaciones;


    int getTotalDeLasEvaluaciones(){     // metodo para obtener (getter)
        return totalDeLasEvaluaciones;
    }


    //  metodo del tipo void
    void muestraFichaTecnica(){
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento fue en: " + fechaDeLanzamiento);
    }

    void evalua(double nota){
        sumaDeLasEvoluciones += nota;
        //sumaDeLasEvoluciones = sumaDeLasEvoluciones + nota;
        totalDeLasEvaluaciones++;
    }

    //   metodo del tipo double (retorna un valor de tipo double)

    double calculaMedia(){
        return sumaDeLasEvoluciones / totalDeLasEvaluaciones;
    }


}
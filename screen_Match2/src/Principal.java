import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {

        // creacion de objeto 1
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);


        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());


        // Creacion de objeto 2
        //com.aluracursos.screenmatch.modelos.Pelicula otrapelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
        //otrapelicula.nombre = "Matrix";
        //otrapelicula.fechaDeLanzamiento = 1998;
        //otrapelicula.duracionEnMinutos = 180;

        //otrapelicula.muestraFichaTecnica();
    }
}

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.modelos.Titulo;

public class Principal {
    public static void main(String[] args) {

        // creacion de objeto 1
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);


        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        // creacion de objeto 3
        Series casaDragon = new Series();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemposadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporadas(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());


        // Creacion de objeto 2
        Pelicula otrapelicula = new Pelicula();
        otrapelicula.setNombre("Matrix");
        otrapelicula.setFechaDeLanzamiento(1998);
        otrapelicula.setDuracionEnMinutos(180);



        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otrapelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos en estas vacaciones "
                + calculadora.getTiempoTotal() + " minutos");



    }
}
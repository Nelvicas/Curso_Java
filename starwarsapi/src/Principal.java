public class Principal {
    public static void main(String[] args) {
        ConsultaPelicula consulta = new ConsultaPelicula();
        Pelicula pelicula = consulta.buscarPelicula(1);
        System.out.println(pelicula);
    }
}

import java.util.Scanner;

public class MenuConversor {

    private ConversorMonedas conversor;

    public MenuConversor(ConversorMonedas conversor) {
        this.conversor = conversor;
    }

    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
            
            ********************************************************
            Sea Bienvenido al Conversor de Monedas =]
            1) Dólar => Peso Argentino
            2) Peso Argentino => Dólar
            3) Dólar => Real Brasileño
            4) Real Brasileño => Dólar
            5) Dólar => Peso Colombiano
            6) Peso Colombiano => Dólar
            7) Salir
            Elija una opción válida: 
            *********************************************************
            """);

            opcion = sc.nextInt();

            double monto;
            double resultado;

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el monto en Dolares: ");
                    monto = sc.nextDouble();
                    resultado = conversor.convertir(monto, "ARS");
                    System.out.println(monto + " Dolares equivalen a " + resultado + " Peso Argentinos");
                }
                case 2 -> {
                    System.out.print("Ingrese el monto en Peso Argentinos: ");
                    monto = sc.nextDouble();
                    resultado = conversor.convertirInverso(monto, "Peso Argentinos");
                    System.out.println(monto + " Peso Argentinos equivalen a " + resultado + " Dolares");
                }
                case 3 -> {
                    System.out.print("Ingrese el monto en Dolares: ");
                    monto = sc.nextDouble();
                    resultado = conversor.convertir(monto, "Pesos Brasileños");
                    System.out.println(monto + " Dolares equivalen a " + resultado + " Pesos Brasileños");
                }
                case 4 -> {
                    System.out.print("Ingrese el monto en Pesos Brasileños: ");
                    monto = sc.nextDouble();
                    resultado = conversor.convertirInverso(monto, "BRL");
                    System.out.println(monto + " Pesos Brasileños equivalen a " + resultado + " Dolares");
                }
                case 5 -> {
                    System.out.print("Ingrese el monto en Dolares: ");
                    monto = sc.nextDouble();
                    resultado = conversor.convertir(monto, "Peso Colombianos");
                    System.out.println(monto + " Dolares equivalen a " + resultado + " Pesos Colombianos");
                }
                case 6 -> {
                    System.out.print("Ingrese el monto en Pesos Colombianos: ");
                    monto = sc.nextDouble();
                    resultado = conversor.convertirInverso(monto, "Pesos Colombianos");
                    System.out.println(monto + " Pesos colombianos equivalen a " + resultado + " Dolares");
                }
                case 7 -> System.out.println("¡Gracias por usar el conversor! Hasta luego :)");
                default -> System.out.println("⚠ Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 7);

        sc.close();
    }
}

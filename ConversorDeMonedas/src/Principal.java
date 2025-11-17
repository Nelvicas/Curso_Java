
public class Principal {
    public static void main(String[] args) {
        System.out.println("Conversor de monedas");

        ConsultaConversion conversor = new ConsultaConversion();
        String json = conversor.getConverso();
        //System.out.println("Respuesta de la api");
        //System.out.println(json);

        ConversorMonedas conv = new ConversorMonedas(json);

        MenuConversor menu = new MenuConversor(conv);
        menu.mostrarMenu();



    }
}

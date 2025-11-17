import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorMonedas {

    private JsonObject conversiones;
    public String moneda;
    public double monto;

    public ConversorMonedas(String json) {
        JsonObject objeto = JsonParser.parseString(json).getAsJsonObject();
        this.conversiones = objeto.getAsJsonObject("conversion_rates");
    }

    public double getTasa(String moneda) {
        return conversiones.get(moneda).getAsDouble();
    }

    public double convertir(double monto, String moneda) {
        double tasa = getTasa(moneda);
        return monto * tasa;
    }

    public double convertirInverso(double monto, String moneda) {
        double tasa = getTasa(moneda);
        return monto / tasa;
    }
}

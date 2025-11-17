import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {

    private static String Api_url = "https://v6.exchangerate-api.com/v6/4a443e6741bd276e72450746/latest/USD";


    public String getConverso(){

        // Creando cliente Http
        HttpClient cliente = HttpClient.newHttpClient();

        //Creando la solicitud
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(Api_url))
                .GET()
                .build();

        try {
            HttpResponse<String> respuesta = cliente
                    .send(request,HttpResponse.BodyHandlers.ofString());
            return respuesta.body();
        } catch(Exception  e){
            throw new RuntimeException("Error al llamar a la API" + e.getMessage());
        }

    }

}

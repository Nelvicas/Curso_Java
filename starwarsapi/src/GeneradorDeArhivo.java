import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class GeneradorDeArhivo {
    public void guaradaJson(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(pelicula.title() + ".json");
        escritura.write(gson.toJson(pelicula));
        escritura.close();
    }
}

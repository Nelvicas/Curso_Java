package com.alura.screenmatch.principal;

import com.alura.screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import com.alura.screenmatch.modelos.Titulo;
import com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Filter;

public class PrincipalConBusqueda {

    ///  hacer request con el servidor web
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        ///  hacer varias consulta y guardar en archivo .JSON
        while(true){

            System.out.println("Escriba el nombre de una Pelicula: ");
            var busqueda = lectura.nextLine();

            if(busqueda.equalsIgnoreCase("salir")){
                break;
            }

            String direccion = "https://www.omdbapi.com/?t=" + busqueda.replace(" ", "+") +"&apikey=87dbee7d";


            //   uso de try catch

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);
                    /*
                Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .create();*/

                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(miTituloOmdb);
                //Titulo miTitulo = gson.fromJson(json, Titulo.class);


                ///   grabar datos en un archivo

                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Titulo ya convertido: " + miTitulo);
               /*
                FileWriter escritura = new FileWriter("peliula.txt");
                escritura.write(miTitulo.toString());
                escritura.close();
                */

                titulos.add(miTitulo);

            } catch (NumberFormatException e){
                System.out.println("Ocurrio un error: ");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Error en la URI, verifique la direccion ");
            }catch (ErrorEnConversionDeDuracionException e){  // mensaje personalizado
                System.out.println(e.getMessage());
            }
        }

        System.out.println(titulos);

        // Creacion de archivo .JSON

        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();

        System.out.println("Finalizo la ejecucion de programa!");

    }
}

package controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import model.Libro;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class APIController {

    /* ––––––––––––––––––––––––––––––––––––
       1.- MOSTRAR CATÁLOGO DE LIBROS
       –––––––––––––––––––––––––––––––––––– */

    public List<Libro> mostrarLibros(){

        String url = "https://stephen-king-api.onrender.com/api/books";

       try{
           Gson gson = new Gson();
           HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest
                   .newBuilder()
                   .uri(URI.create(url))
                   .GET()
                   .build();
           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
           String librosJSON = response.body();
           JsonObject jsonObject = gson.fromJson(librosJSON, JsonObject.class);
           JsonArray jsonArray = jsonObject.getAsJsonArray("data");
           List<Libro> libros = new ArrayList<>();
           for (JsonElement item : jsonArray) {
               Libro libro = gson.fromJson(item, Libro.class);
               libros.add(libro);
           }

           return libros;

       } catch (Exception e){
           System.out.println("Error en la petición HTTP");
           return new ArrayList<>();
       }

    }

    /* ––––––––––––––––––––––––––––––––––––
    2.- BUSCAR LIBROS POR ID
    –––––––––––––––––––––––––––––––––––– */

    public Libro buscarLibroID(int id){

        String url = "https://stephen-king-api.onrender.com/api/book/" + id;

        try{
            Gson gson = new Gson();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String librosJSON = response.body();
            JsonObject jsonObject = gson.fromJson(librosJSON, JsonObject.class);
            JsonObject dataObject = jsonObject.getAsJsonObject("data");

            return gson.fromJson(dataObject, Libro.class);

        } catch (Exception e){
            System.out.println("Error buscando libro con ID " + id);
            return null;
        }

    }




}

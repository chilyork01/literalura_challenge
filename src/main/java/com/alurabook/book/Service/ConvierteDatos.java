package com.alurabook.book.Service;

import com.alurabook.book.model.Libro;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

public class ConvierteDatos {

    public List<Libro> convertir(String datos) {
        List<Libro> libros = new ArrayList<>();

        try {
            // Parsear JSON usando Gson
            JsonObject json = JsonParser.parseString(datos).getAsJsonObject();
            JsonArray resultados = json.getAsJsonArray("results");

            for (int i = 0; i < resultados.size(); i++) {
                JsonObject libroJson = resultados.get(i).getAsJsonObject();
                String titulo = libroJson.get("title").getAsString();
                String autor = libroJson.getAsJsonArray("authors").get(0).getAsJsonObject().get("name").getAsString();
                String idioma = libroJson.getAsJsonArray("languages").get(0).getAsString();
                String publicacion = libroJson.has("download_count") ? libroJson.get("download_count").getAsString() : "0";

                libros.add(new Libro(titulo, autor, idioma, publicacion));
            }
        } catch (Exception e) {
            System.out.println("Error al analizar el JSON: " + e.getMessage());
        }

        return libros;
    }
}

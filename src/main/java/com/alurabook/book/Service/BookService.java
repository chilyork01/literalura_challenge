package com.alurabook.book.Service;

import com.alurabook.book.model.Libro;

import java.util.List;

public class BookService {

    // Este método debe buscar un libro por título
    public void buscarLibroPorTitulo(String titulo) {
        // Aquí llamamos al método que consume la API
        System.out.println("Buscando libro con título: " + titulo);
        // Simulación de resultado:
        System.out.println("Resultado: [Simulación] Libro encontrado: 'El Principito', Autor: Antoine de Saint-Exupéry");
    }

    // Este método debe listar libros registrados
    public void listarLibrosRegistrados() {
        // Simulación de resultado:
        System.out.println("Libros registrados:");
        System.out.println("1. Don Quijote de la Mancha, Autor: Miguel de Cervantes");
        System.out.println("2. Cien años de soledad, Autor: Gabriel García Márquez");
    }

    // Este método debe listar autores registrados
    public void listarAutoresRegistrados() {
        // Simulación de resultado:
        System.out.println("Autores registrados:");
        System.out.println("1. Miguel de Cervantes");
        System.out.println("2. Gabriel García Márquez");
    }

    // Este método debe listar autores vivos en una época
    public void listarAutoresVivos(String epoca) {
        // Simulación de resultado:
        System.out.println("Autores vivos en " + epoca + ":");
        System.out.println("1. [Simulación] Autor: Gabriel García Márquez");
    }

    // Este método debe listar libros por idioma
    public void listarLibrosPorIdioma(String idioma) {
        // Simulación de resultado:
        System.out.println("Libros en el idioma " + idioma + ":");
        System.out.println("1. [Simulación] Libro: 'El Principito', Autor: Antoine de Saint-Exupéry");
    }
}

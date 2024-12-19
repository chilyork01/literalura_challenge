package com.alurabook.book.model;

public class Libro {
    private String titulo;
    private String autor;
    private String idioma;
    private String publicacion;

    public Libro(String titulo, String autor, String idioma, String publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.publicacion = publicacion;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    public String getPublicacion() { return publicacion; }
    public void setPublicacion(String publicacion) { this.publicacion = publicacion; }
}

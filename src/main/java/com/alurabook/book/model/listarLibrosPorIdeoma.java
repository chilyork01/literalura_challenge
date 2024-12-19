package com.alurabook.book.model;

enum ListarLibrosPorIdioma {
    ESPANOL("es"), INGLES("en"), FRANCES("fr");

    private final String codigo;

    ListarLibrosPorIdioma(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}

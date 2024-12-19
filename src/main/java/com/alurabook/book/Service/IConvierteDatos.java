package com.alurabook.book.Service;

import java.util.List;

interface IconvierteDatos<T> {
    List<T> convertir(String datos);
}

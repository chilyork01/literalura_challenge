package com.alurabook.book.Service;

import java.util.Scanner;

public class BookApplication {
	private final BookService bookService = new BookService();

	public void iniciar() {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			// Mostrar el menú
			System.out.println("1. Buscar libro por título");
			System.out.println("2. Listar libros registrados");
			System.out.println("3. Listar autores registrados");
			System.out.println("4. Listar autores vivos en una época");
			System.out.println("5. Listar libros por idioma");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opción: ");

			// Leer la opción seleccionada
			opcion = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer

			// Manejar las opciones
			switch (opcion) {
				case 1 -> buscarLibroPorTitulo(scanner);
				case 2 -> listarLibrosRegistrados();
				case 3 -> listarAutoresRegistrados();
				case 4 -> listarAutoresVivos(scanner);
				case 5 -> listarLibrosPorIdioma(scanner);
				case 0 -> System.out.println("Saliendo del programa...");
				default -> System.out.println("Opción no válida, intente de nuevo.");
			}
		} while (opcion != 0);

		scanner.close();
	}

	private void buscarLibroPorTitulo(Scanner scanner) {
		System.out.print("Ingrese el título del libro: ");
		String titulo = scanner.nextLine();
		bookService.buscarLibroPorTitulo(titulo);
	}

	private void listarLibrosRegistrados() {
		bookService.listarLibrosRegistrados();
	}

	private void listarAutoresRegistrados() {
		bookService.listarAutoresRegistrados();
	}

	private void listarAutoresVivos(Scanner scanner) {
		System.out.print("Ingrese la época (por ejemplo, 'siglo XIX'): ");
		String epoca = scanner.nextLine();
		bookService.listarAutoresVivos(epoca);
	}

	private void listarLibrosPorIdioma(Scanner scanner) {
		System.out.print("Ingrese el idioma (por ejemplo, 'en' para inglés): ");
		String idioma = scanner.nextLine();
		bookService.listarLibrosPorIdioma(idioma);
	}
}

package ejercicios_carlos_julio.pruba_de_factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryFactory factory = new DefaultLibraryFactory();
        Library library = factory.createLibrary();

        while (true) {
            System.out.println("\n--- SISTEMA DE BIBLIOTECA ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar lector");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Listar préstamos");
            System.out.println("6. LIStar libros");
            System.out.println("7. listar lectores");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print(" ingrse el Título: ");
                    String title = scanner.nextLine();
                    System.out.print(" ingrese el Autor: ");
                    String author = scanner.nextLine();
                    System.out.print(" ingrese el Género: ");
                    String genre = scanner.nextLine();
                    System.out.print(" ingresr el ISBN: ");
                    String isbn = scanner.nextLine();
                    Book book = factory.createBook(title, author, genre, isbn);
                    library.registerBook(book);
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Carnet/Cédula: ");
                    String carnet = scanner.nextLine();
                    System.out.print("Gmail: ");
                    String gmail = scanner.nextLine();
                    Reader reader = factory.createReader(name, lastName, carnet, gmail);
                    library.registerReader(reader);
                    break;

                case 3:
                    System.out.print("ISBN del libro: ");
                    String loanIsbn = scanner.nextLine();
                    System.out.print("Carnet/Cédula del lector: ");
                    String loanCarnet = scanner.nextLine();
                    library.loanBook(loanIsbn, loanCarnet);
                    break;

                case 4:
                    System.out.print("ISBN del libro a devolver: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnIsbn);
                    break;

                case 5:
                    library.listLoans();
                    break;

                case 6:
                    library.listBooks();
                    break;

                case 7:
                    library.listReader();

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
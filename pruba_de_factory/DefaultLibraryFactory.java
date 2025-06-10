package ejercicios_carlos_julio.pruba_de_factory;

//funcion para crwar objetos para el sistema de biblioteca

import java.time.LocalDate;

public class DefaultLibraryFactory implements LibraryFactory{
    @Override
    public Book createBook(String title, String author, String genre, String isbn) {
        return new Book(title, author, genre, isbn);
    }

    @Override
    public Reader createReader(String name, String lastName, String carnet_cedula, String gmail) {
        return new Reader(name, lastName, carnet_cedula, gmail);
    }

    @Override
    public Loan createLoan(Book book, Reader reader) {
        return new Loan(book, reader, LocalDate.now());
    }
    
    @Override
    public Library createLibrary() {
        return new LibraryManager(); // creanos y devolvemos una instancia libraryManager
    }
}
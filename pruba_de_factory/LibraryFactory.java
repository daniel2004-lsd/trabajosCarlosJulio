package ejercicios_carlos_julio.pruba_de_factory;

//define metodos que debe tener cualquier fabrica 
public interface LibraryFactory {
    Book createBook(String title, String author, String genre, String isbn);
    Reader createReader(String name, String lastName, String carnet_cedula, String gmail);
    Loan createLoan(Book book, Reader reader);
    Library createLibrary();
}
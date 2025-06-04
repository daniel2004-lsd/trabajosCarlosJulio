import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryManajer  implements Library{

    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    @Override
    public void registerBook(Book book){
        books.add(book);
        System.out.println("libro registrado!" + book.getTitle());
    }
    @Override

    public void registerReader(Reader reader){
        readers.add(reader);
        System.out.println("Lector Registrado con exito!");
    }
    @Override

    public void loanBook(String isbn , String carnetCedula){
        Book book = null;
        Reader reader = null;

    
    for (Book b : books) {
        if (b.getIsbn().equals(isbn)) {
            book = b;
            break;
        }
    }

    for (Reader r : readers) {
        if (r.getCarnet_cedula().equals(carnetCedula)) {
            reader = r;
            break;
        }
    }
    if (book == null) {
        System.out.println("Libro no encontrado.");
        return;
    }

    if (reader == null) {
        System.out.println("Lector no encontrado.");
        return;
    }

    Loan loan = new Loan(book, reader, LocalDate.now());
    loans.add(loan);
    System.out.println("Préstamo registrado con éxito.");
    }
        

    @Override
    public void returnBook(String isbn) {
        for (Loan l : loans) {
        if (l.getBook().getIsbn().equals(isbn) && !l.isReturned()) {
            l.returnBook();
            System.out.println("Libro devuelto exitosamente.");
            return;
        }
    }
    System.out.println("No se encontró un préstamo activo con ese ISBN.");
    }

    @Override
    public void listLoans() {
        if (loans.isEmpty()) {
        System.out.println("No hay préstamos registrados.");
        return;
    }

    for (Loan l : loans) {
        System.out.println("Libro: " + l.getBook().getTitle());
        System.out.println("Lector: " + l.getReader().getName() + " " + l.getReader().getLastName());
        System.out.println("Fecha de préstamo: " + l.getLoanDate());
        System.out.println("Devuelto: " + (l.isReturned() ? "Sí (" + l.getReturnDate() + ")" : "No"));
        System.out.println("-------------------------------------------------");
    }
    }
    @Override
    public void listBooks() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listBooks'");
    }
    @Override
    public void listReader() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listReader'");
    }
    
}
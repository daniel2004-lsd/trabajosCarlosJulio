import java.time.LocalDate;

public class Loan {
    private Book book;
    private Reader reader;
    private LocalDate date;
    private boolean returned;

    public Loan(Book book, Reader reader, LocalDate date) {
        this.book = book;
        this.reader = reader;
        this.date = date;
        this.returned = false;
    }

    public Book getBook() { return book; }
    public Reader getReader() { return reader; }
    public LocalDate getDate() { return date; }
    public boolean isReturned() { return returned; }
    public void setReturned(boolean returned) { this.returned = returned; }

    @Override
    public String toString() {
        return "Préstamo: " + book.getTitle() + " a " + reader.getName() + " " + reader.getLastName() + ", Fecha: " + date + ", Devuelto: " + (returned ? "Sí" : "No");
    }

    public void returnBook() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnBook'");
    }

    public String getLoanDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLoanDate'");
    }

    public String getReturnDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getReturnDate'");
    }
}
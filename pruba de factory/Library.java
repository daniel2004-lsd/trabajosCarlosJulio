// aca se d4fine los metodos que debe el sistema de biblioteca 
public interface Library {
    void registerBook(Book book);
    void registerReader(Reader reader);
    void loanBook(String isbn, String carnet);
    void returnBook(String isbn);
    void listLoans();
}

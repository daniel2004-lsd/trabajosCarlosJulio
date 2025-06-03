public interface Library {
    void registerBook(Book book);
    void registerReader(Reader reader);
    void loanBook(String isbn, String carnetCedula);
    void returnBook(String isbn);
    void listLoans();
}
 
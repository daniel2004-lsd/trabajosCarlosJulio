public class Book {

    private String title;
    private String author;
    private String genre;
    private String isbn;

    public Book(String title, String author, String genre, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    
    public void showInformation() {
        System.out.println(" Título: " + title);
        System.out.println(" Autor: " + author);
        System.out.println(" Género: " + genre);
        System.out.println(" ISBN: " + isbn);
    }
}

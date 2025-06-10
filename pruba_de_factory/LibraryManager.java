package ejercicios_carlos_julio.pruba_de_factory;

// aca estamos inplementando la interfaz library qy gestinna la logica de la biblioteca
    import java.util.*;

    public class LibraryManager implements Library {
        private List<Book> books = new ArrayList<>();
        private List<Reader> readers = new ArrayList<>();
        private List<Loan> loans = new ArrayList<>();

        @Override
        public void registerBook(Book book) {
            books.add(book);
            System.out.println("Libro registrado correctamente.");
        }

        @Override
        public void registerReader(Reader reader) {
            readers.add(reader);
            System.out.println("Lector registrado correctamente.");
        }

        @Override
        public void loanBook(String isbn, String carnet) {
            Book book = books.stream().filter(b -> b.getIsbn().equals(isbn)).findFirst().orElse(null);
            Reader reader = readers.stream().filter(r -> r.getCarnet_cedula().equals(carnet)).findFirst().orElse(null);
            if (book == null) {
                System.out.println("Libro no encontrado.");
                return;
            }
            if (reader == null) {
                System.out.println("Lector no encontrado.");
                return;
            }
            if (loans.stream().anyMatch(l -> l.getBook().getIsbn().equals(isbn) && !l.isReturned())) {
                System.out.println("El libro ya está prestado.");
                return;
            }
            loans.add(new Loan(book, reader, java.time.LocalDate.now()));
            System.out.println("Préstamo realizado correctamente.");
        }

        @Override
        public void returnBook(String isbn) {
            Loan loan = loans.stream().filter(l -> l.getBook().getIsbn().equals(isbn) && !l.isReturned()).findFirst().orElse(null);
            if (loan == null) {
                System.out.println("No se encontró un préstamo activo para este libro.");
                return;
            }
            loan.setReturned(true);
            System.out.println("Libro devuelto correctamente.");
        }

        @Override
        public void listLoans() {
            if (loans.isEmpty()) {
                System.out.println("No hay préstamos registrados.");
                return;
            }
            for (Loan loan : loans) {
                System.out.println(loan);
            }
        }
        @Override
        public void listBooks(){
            if(books.isEmpty()){
                System.out.println("no hay libros rgistrados");
                return;

            }
            System.out.println("......Lista de libros regisytrados");
            for (Book book : books) {
                System.out.println("titulo : " + book.getTitle());
                System.out.println("autor : " + book.getAuthor());
                System.out.println("genero : " + book.getGenre());
                System.out.println("ISBN :" +   book.getIsbn());
                System.out.println("........................................................................");
            }
        }
        @Override
        public void listReader(){
            if (readers.isEmpty()) {
                System.out.println("no hay lectores registrados");
                return;
            }
            for (Reader reader : readers) {
                System.out.println("Lista de lectores");
                System.out.println("Nombre : " + reader.getName());
                System.out.println("Apellido: " + reader.getLastName());
                System.out.println("cedula/carnet : " + reader.getCarnet_cedula());
                System.out.println("correo: " + reader.getGmail());
            }

        }
    }

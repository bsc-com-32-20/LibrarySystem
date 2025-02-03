import java.util.ArrayList;

public class Book {
    private static int number_of_books = 1;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private static ArrayList<Book> books = new ArrayList<Book>();

    public Book(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        number_of_books++;
    }
    public static int getNumberOfBooks() {
        return number_of_books;
    }

    public String getTitle() {
        return title;
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static void addBook(Book book) {
        books.add(book);
    }

    public static void removeBook(String book_title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().toLowerCase().equals(book_title.toLowerCase())) {
                books.remove(i);
                System.out.println("Book removed");
                break;
            }
        }
    }
}

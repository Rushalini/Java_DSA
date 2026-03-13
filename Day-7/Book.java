public class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }
    void display() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title + ", Author: " + author);
    }
    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien");
        book1.display();
        Book book2 = new Book("A Book", "Unknown");
        book2.display();
    }
}

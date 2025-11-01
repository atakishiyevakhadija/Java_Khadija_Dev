package OuterAndInner;

public class LibraryMain {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.showContent();
    }
}
class Library{
    String book1 = "Sherlock Holmes";
    String book2 = "Garry Potter";
    String book3 = "Heidi";
    String book4 = "Black beauty";

    void showContent(){
        Book book = new Book();
        book.showBooks();
    }

    class Book{
       void showBooks(){
           System.out.println("Эта книга про: " + book1);
           System.out.println("Я читала эту книгу: " + book2);
           System.out.println("Я читала эту книгу: " + book3);
           System.out.println("Я читала эту книгу: " + book4);
       }
    }
}
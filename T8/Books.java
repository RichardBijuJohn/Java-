package T8;
class Book{
    String title,author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    void display(){
        System.out.println("title: "+title);
        System.out.println("Author: "+author);
    }
}
class Technical extends Book {
    String subject;
    Technical(String title, String author, String s) {
        super(title, author);
        subject=s;
    }
    void display() {
        System.out.println("Technical Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}
class Story extends Technical {
    String genre;
    Story(String title, String author, String subject, String g) {
        super(title, author, subject);
        genre=g;
    }
    void display() {
        System.out.println("Story Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Genre: " + genre);
    }
}
public class Books {
    public static void main(String[] arg) {
        Book ref;
        ref = new Book("This is Me", "Paul Fillings");
        ref.display();
        System.out.println();
        ref = new Technical("More about Java", "Lucia James", "Computer Science");
        ref.display();
        System.out.println();
        ref = new Story("Harry potter", "J.K. Rowling", "Fantasy & Magic", "Adventure");
        ref.display();
    }
}

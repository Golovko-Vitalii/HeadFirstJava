package les_16.tree;

public class Book implements Comparable<Book>{
    String title;
    public Book(String title){
        this.title = title;
    }
    public int compareTo(Book book){
        return(this.title.compareTo(book.title));
    }
    public String toString(){
        return this.title;
    }
}

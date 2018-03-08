package les_16.tree;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[]args){
        new TestTree().go();
    }
    public void go(){
        Book b1 = new Book("How are cats");
        Book b2 = new Book("Build again your body");
        Book b3 = new Book("Finding Nemo");
        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
        TreeSet<Book> tree2 = new TreeSet<Book>(new BookCompare());
        tree2.add(b1);
        tree2.add(b2);
        tree2.add(b3);
        System.out.println(tree2);
    }
    class BookCompare implements Comparator<Book> {
        public int compare(Book b1, Book b2){
            return (b1.title.compareTo(b2.title));
        }
    }
}

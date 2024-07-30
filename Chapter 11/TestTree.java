// Sharpen your pencil
// Look at this code.
// Read it carefully, then
// answer the questions
// below. (Note: there
// are no syntax errors in
// this code.)
//Page(353)

import java.util.*;
public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }
    public void go() {
        Book b1 = new Book("How Cats Work");    
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        Set<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}
class Book {
    private String title;
    public Book(String t) {
            title = t;
    }
}

/*1. What is the result when you compile this code?
 * Yes, it compiles correctly
 * 
 * 2. If it compiles, what is the result when you run the TestTree class?
 * It gives exception as an output
 * Exception in thread "main" java.lang.ClassCastException: class Book cannot be cast to class java.lang.Comparable (Book is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
        at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)      
        at java.base/java.util.TreeMap.put(TreeMap.java:785)
        at java.base/java.util.TreeMap.put(TreeMap.java:534)
        at java.base/java.util.TreeSet.add(TreeSet.java:255)
        at TestTree.go(TestTree.java:19)
        at TestTree.main(TestTree.java:12)

 *
 * 3. If there is a problem (either compile-time or runtime) with this code, how would you fix it?
 * To resolve this we can impliment comparable in Book class
 */
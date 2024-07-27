//27/07/24
// BE the Compiler
// The Java file on this page represents a
// complete program. Your job is to play
// compiler and determine whether this
// file will compile. If it won’t compile,
// how would you fix it? When
// it runs, what would be its
// output?

// "So the output will be
// super static block
// static block 3
// in main
// super constructor
// constructor"

// static block will be executed firstly when classes are loaded and than "in main"
// than we instantiate class than constructors are called

// Page(306)

class StaticSuper {
    static {
        System.out.println("super static block");
    }
    StaticSuper () {
        System.out.println("super constructor");
    }
}
public class StaticTests extends StaticSuper {
    static int rand;
    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }
    StaticTests() {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}

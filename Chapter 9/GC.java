//24/07/24
// Which of the lines of code on the right, if added to
// the class on the left at point A, would cause exactly
// one additional object to be eligible for the Garbage
// Collector? (Assume that point A (//call more methods)
// will execute for a long time, giving the Garbage
// Collector time to do its stuff.
public class GC {
    public static GC doStuff() {
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }
    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();
        // 2,4 and 8 makes extra object eligible for GC
        gc2 = null;
        gc1 = null;
        gc1 = gc4;
        // call more methods
    }
    public static void doStuff2(GC copyGC) {
        GC localGC = copyGC;
    }
}
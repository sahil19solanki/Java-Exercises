/*
 * 16/07/2024
 * A
 * Be the compiler
 * it will compile and output will be 
 * "42 84"
 */
class XCopy{
    public static void main(String[] args){
        int orgi = 42;
        XCopy x = new XCopy();
        int y = x.go(orgi);
        System.out.println(orgi + " " + y);
    }

    int go(int arg){
        arg = arg * 2;
        return arg;
    }
}
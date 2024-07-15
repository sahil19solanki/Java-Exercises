/*  15/07/2024
 *  B
 *  we have to move x=x+1 statement at the end of while loop
 *  and also replace 4 with 3 of while loop condition otherwise it will 
 *  give array out of bound exception
 */
class Hobbits {
    String name;
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;
        while (z < 3) {
    
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
             z = z + 1;
        }
    }
}
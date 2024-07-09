//  09/07/2024
/* A
   in this there is one infinite loop,so we need to 
   increment x to reach false condition or to exit 
   the loop
*/
class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            x=x+1;
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }
}

/*  B
    In this there is no class declaration for main method,
    We need to enclose the main function in Class
*/
// class Exercise1b{}
public static void main(String[] args){
    int x=5;
    while(x>1){
        x=x-1;
        if(x<3){
            System.out.print("big x");
        }
    }
}

/*  C
    There is no main function,
    so main function shoud be added
 */

class Exercise1c{
    int x=5;
    while(x>1){
        x=x-1;
        if(x<3){
            System.out.print("small X");
        }
    }
}
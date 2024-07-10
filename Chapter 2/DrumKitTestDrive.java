//  10/07/2024
/*
    Arranging the code in correct sequence

    Which give output
    "bang bang ba-bang
    ding ding da-ding"
 */
public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        if (d.snare == true) {
            d.playSnare();
        }
        d.snare = false;
        d.playTopHat();
    }
}

class DrumKit{
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    void playTopHat () {
        System.out.println("ding ding da-ding");
    }   
}

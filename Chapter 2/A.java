//  10/07/2024
/* 
    In Test class main function there is no object initialization,
    so it will throw error
*/
class StreamingSong{

    String title;
    String artist;
    int duration;

    void play(){
        System.out.println("Playing song");
    }

    void printDetails(){
        System.out.println("This is "+ title + " by "+artist);
    }
}

class StreamingSongTestDrive{
    public static void main(String[] args) {
        //initializing object of StreamingSong class
        StreamingSong song = new StreamingSong();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}
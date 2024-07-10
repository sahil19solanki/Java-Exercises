//  10/07/2024
/*
    There is no play method in class so when we call episode.play() it will throw
    error, so we need to make that method
 */
class Episode {
    int seriesNumber;
    int episodeNumber;
    
    void skipIntro() {
        System.out.println("Skipping intro...");
    }
    void skipToNext() {
        System.out.println("Loading next episode...");
    }

    //For removing error 
    void play(){
        System.out.println("playing episode " + episodeNumber);
    }
}
class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play();
        episode.skipIntro();
    }
}
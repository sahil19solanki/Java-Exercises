// Pool Puzzle
// Your job is to take code snippets from
// the pool and place them into the blank
// lines in the code. You may not use the
// same snippet more than once, and
// you won’t need to use all the snip-
// pets. Your goal is to make a class that
// will compile and run and produce the
// output listed.
// Page(416)

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPuzzle {
    public static void main(String[] args) {
        SongSearch songSearch = new SongSearch();
        songSearch.printTopFiveSongs();
        songSearch.search("The Beatles");
        songSearch.search("The Beach Boys");
    }
}
class SongSearch {
    
    private final Songs song = new Songs();
    private final List<Song> songs = song.getSongs();
        void printTopFiveSongs() {
            List<String> topFive = songs.stream()
                                        .sorted(Comparator.comparingInt(Song::getTimesPlayed))
                                        .map(song -> song.getTitle())
                                        .limit(5)
                                        .collect(Collectors.toList());
            System.out.println(topFive);
    }
    void search(String artist) {
        Optional<Song> result = songs.stream()
                        .filter(song -> song.getArtist().equals(artist))
                        .findFirst();
        if (result.isPresent()) {
            System.out.println(result.get().getTitle());
        } else {
            System.out.println("No songs found by: " + artist);
        }
    }
}

class Songs {
    public List<Song> getSongs() {
        return List.of(
            new Song("$10", "Hitchhiker", "Electronic", 2016, 183),
            new Song("Havana", "Camila Cabello", "R&B", 2017, 324),
            new Song("Cassidy", "Grateful Dead", "Rock", 1972, 123),
            new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 199),
            new Song("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257),
            new Song("Silence", "Delerium", "Electronic", 1999, 134),
            new Song("Hurt", "Johnny Cash", "Soft Rock", 2002, 392),
            new Song("Watercolour", "Pendulum", "Electronic", 2010, 155),
            new Song("The Outsider", "A Perfect Circle", "Alternative Rock", 2004, 312),
            new Song("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168),
            new Song("Come Together", "The Beatles", "Blues rock", 1968, 173),
            new Song("Come Together", "Ike & Tina Turner", "Rock", 1970, 165),
            new Song("With a Little Help from My Friends", "Joe Cocker", "Rock", 1968, 46),
            new Song("Immigrant Song", "Karen O", "Industrial Rock", 2011, 12),
            new Song("Breathe", "The Prodigy", "Electronic", 1996, 337),
            new Song("What's Going On", "Gaye", "R&B", 1971, 420),
            new Song("Hallucinate", "Dua Lipa", "Pop", 2020, 75),
            new Song("Walk Me Home", "P!nk", "Pop", 2019, 459),
            new Song("I am not a woman, I'm a god", "Halsey", "Alternative Rock", 2021, 384),
            new Song("Pasos de cero", "Pablo Alborán", "Latin", 2014, 117),
            new Song("Smooth", "Santana", "Latin", 1999, 244),
            new Song("Immigrant song", "Led Zeppelin", "Rock", 1970, 484)
        );
    }
}
class Song {
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timesPlayed;
// Practice for you! Create a constructor, all the getters and a toString()
    Song(String title, String artist, String genre, int year,int timesPlayed){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timesPlayed = timesPlayed;
    }
    String getTitle(){
        return title;
    }

    String getArtist(){
        return artist;
    }

    String getGenre(){
        return genre;
    }
    int getYear(){
        return year;
    }

    int getTimesPlayed(){
        return timesPlayed;
    }
}

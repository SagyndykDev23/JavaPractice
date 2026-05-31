package Day12.task5;

import java.util.*;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> artists;

    public MusicBand(String name, int year, List<MusicArtist> artists) {
        this.name = name;
        this.year = year;
        this.artists = new ArrayList<>(artists);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getArtists() {
        return artists;
    }

    public void setArtists(List<MusicArtist> artists) {
        this.artists = new ArrayList<>(artists);
    }

    public static void transferArtists(MusicBand source, MusicBand destination){
        for(MusicArtist artist: source.getArtists()){
            destination.getArtists().add(artist);
        }

        source.getArtists().clear();
    }

    public void printArtists(){
        System.out.println(this.getArtists().toString());
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name = '" + name + "\' " +
                ", year = " + year +
                ", members = " + artists +
                " }";
    }
}

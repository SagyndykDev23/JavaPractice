package Day12.task5;

import Day12.task5.MusicBand;
import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> artistsA = new ArrayList<>(
                List.of(
                        new MusicArtist("Sagyndyk", 23),
                        new MusicArtist("Damir", 24),
                        new MusicArtist("Renat", 25),
                        new MusicArtist("Medet", 26)
                )
        );

        List<MusicArtist> artistsB = new ArrayList<>(
                List.of(
                        new MusicArtist("Logan", 32),
                        new MusicArtist("Kendall", 34),
                        new MusicArtist("Carlos", 35),
                        new MusicArtist("James", 36)
                )
        );

        MusicBand bts = new MusicBand(
                "BTS",
                2010,
                artistsA
        );

        MusicBand btr = new MusicBand(
                "BIG TIME RUSH",
                2012,
                artistsB
        );

        System.out.println(bts);
        System.out.println(btr);

        MusicBand.transferArtists(bts, btr);

        System.out.println(bts);
        System.out.println(btr);



    }
}

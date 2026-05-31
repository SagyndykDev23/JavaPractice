package Day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> bands = new ArrayList<>(
                List.of(
                        new MusicBand("Metallica", 1981),
                        new MusicBand("Queen", 1970),
                        new MusicBand("Nirvana", 1987),
                        new MusicBand("Linkin Park", 1996),
                        new MusicBand("Imagine Dragons", 2008),
                        new MusicBand("Coldplay", 1997),
                        new MusicBand("Red Hot Chili Peppers", 1983),
                        new MusicBand("Green Day", 1987),
                        new MusicBand("Arctic Monkeys", 2002),
                        new MusicBand("Foo Fighters", 1994)
                )
        );

        List<MusicBand> filtered = groupsAfter2000(bands);

        System.out.println("Original List = = = = = = = =");
        for(MusicBand band: bands){
            System.out.println(band.toString());
        }

        System.out.println("Filtered List = = = = = = = =");
        for(MusicBand band: filtered){
            System.out.println(band.toString());
        }

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> filteredBands = new ArrayList<>();

        for(MusicBand band: bands){
            if(band.getYear() > 2000){
                filteredBands.add(band);
            }
        }

        return filteredBands;
    }
}

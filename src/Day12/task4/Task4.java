package Day12.task4;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        MusicBand A = new MusicBand(
                "BTS",
                2008,
                List.of("Kimchi", "Bolton", "BurgerKing", "MacBook")
        );

        MusicBand B = new MusicBand(
                "BTR",
                2000,
                List.of("Logan", "Kendall", "James", "Carlos")
        );

        MusicBand.transferMembers(A, B);

        System.out.println(A);
        System.out.println(B);
    }
}

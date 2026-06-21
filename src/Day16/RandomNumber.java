package Day16;

import java.util.Random;

public class RandomNumber {


    public static int randomInteger(){
        Random rand = new Random();
        return rand.nextInt(101);
    }

    public static double randomDouble(){
        Random rand = new Random();
        return rand.nextDouble();
    }
}

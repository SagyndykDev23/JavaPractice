package Day18;

import java.util.*;

public class Day18 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

        System.out.println(recursionSum(numbers, 0));

        System.out.println(count7(23727792));
    }

    public static int recursionSum(int[] numbers, int index){
        if(index == numbers.length){
            return 0;
        }

        return numbers[index] + recursionSum(numbers, index+1);
    }

    public static int count7(int number){
        if(number == 0){
            return 0;
        }

        int lastDigit = Math.abs(number%10);
        int isSeven = (lastDigit == 7) ? 1 : 0;

        return isSeven + count7(Math.abs(number / 10));
    }
}

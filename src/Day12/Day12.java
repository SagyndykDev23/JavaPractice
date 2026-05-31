package Day12;

import java.util.*;

public class Day12 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Porsche");

        cars.add("Toyota");
        System.out.println(cars);
        int index = (int) Math.ceil(cars.size() / 2);
        cars.add(index, "Jeep");
        System.out.println(cars);
        cars.removeFirst();
        System.out.println(cars);


        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<=30; i++){
            if(i%2==0 && i>0) numbers.add(i);
        }
        for(int i=300; i<=350; i++){
            if(i%2==0) numbers.add(i);
        }

        System.out.println(numbers);

    }
}

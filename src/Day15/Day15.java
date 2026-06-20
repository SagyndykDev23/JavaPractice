package Day15;

import java.io.*;
import java.util.*;

public class Day15 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(new File("shoes.csv"));
            PrintWriter pw = new PrintWriter("missing_shoes.txt")
        ){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] shoesLine = line.split(";");

                if(Integer.parseInt(shoesLine[2]) == 0){
                    pw.println(Arrays.toString(shoesLine));
                }
            }

        }catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        }

    }
}

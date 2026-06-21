package Day16;

import java.io.*;
import java.util.*;

public class Day16 {
    public static void main(String[] args) {

        File file = new File("numbers.txt");
        System.out.println(printResult(file));

        try(PrintWriter file1 = new PrintWriter("file1.txt")){

            Random rand = new Random();

            for(int i=0; i<1000; i++){
                file1.println(rand.nextInt(101));
            }

        }catch(FileNotFoundException e){

            System.out.println("Файл не найден");
        }

        try(
                Scanner scanner = new Scanner(new File("file1.txt"));
                PrintWriter file2 = new PrintWriter(new File("file2.txt"));
        ){
            List<Integer> line = new ArrayList<>();
            int sum = 0;
            double temp;

            while(scanner.hasNextInt()) {
                int number = scanner.nextInt();

                line.add(number);
                sum += number;

                if (line.size() == 20) {
                    temp = (double) sum / line.size();
                    file2.println(temp);

                    line.clear();
                    sum = 0;
                }
            }

        }catch(FileNotFoundException e){

            System.out.println("Файл не найден");
        }


        System.out.println(printResult(new File("file2.txt")));
    }

    public static double printResult(File file){
        List<Double> numbers = new ArrayList<>();
        double sum = 0;

        try(
                Scanner scan = new Scanner(file);
        ){
            scan.useLocale(Locale.US); // вся проблема из-за него 667
            while(scan.hasNextDouble()){
                double number = scan.nextDouble();

                sum+=number;
                numbers.add(number);
            }

        }catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        }

        return (Math.round(sum / numbers.size() * 1000.0) / 1000.0);
    }
}

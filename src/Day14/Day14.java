package Day14;

import java.io.*;
import java.util.*;

public class Day14 {
    public static void main(String[] args) {

        File file = new File("numbers.txt");
        System.out.println(printSumDigits(file));

        System.out.println(parseFileToStringList());

        List<Person> persons = parseFileToObjList();

        for(Person person: persons){
            System.out.println(person.toString());
        }
    }

    public static int printSumDigits(File file) {
        int sumDigits = 0;
        int counter = 0;

        try(Scanner scan = new Scanner(file)){

            while(scan.hasNextInt()) {
                sumDigits += scan.nextInt();
                counter++;
            }

            if (counter != 10) {
                throw new MoreOrLessException("Некорректный входной файл");
            }

        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (MoreOrLessException e){
            System.out.println(e.getMessage());
        }

        return sumDigits;
    }

    public static List<String> parseFileToStringList(){
        List<String> people = new ArrayList<>();

        try(Scanner scan = new Scanner(new File("people.txt"))){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] person = line.split(" ");

                if(person.length != 2){
                    throw new IllegalArgumentException();
                }

                int personAge = Integer.parseInt(person[1]);

                if(personAge < 0){
                    throw new IllegalArgumentException();
                }

                people.add(line);
            }

        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return null;
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }

        return people;
    }


    public static List<Person> parseFileToObjList(){
        List<Person> people = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File("people.txt"))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] person = line.split(" ");

                if(person.length != 2){
                    throw new IllegalArgumentException();
                }

                int personAge = Integer.parseInt(person[1]);

                if(personAge < 0){
                    throw new IllegalArgumentException();
                }

                people.add(new Person(person[0], personAge));
            }

        }catch(FileNotFoundException e){
            System.out.println("Файл не найден");
            return null;
        }catch(IllegalArgumentException e){
            System.out.println("Некорретный входной файл");
            return null;
        }

        return people;
    }
}

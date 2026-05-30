package Day3;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {

//        1)
//        Scanner scanner = new Scanner(System.in);
//
//        while(true) {
//            String input = scanner.nextLine();
//            if (input.equals("Stop")) {
//                break;
//            } else {
//                switch (input) {
//                    case "Москва", "Владивосток", "Ростов" -> System.out.println("Россия");
//                    case "Рим", "Милан", "Турин" -> System.out.println("Италия");
//                    case "Ливерпуль", "Манчестер", "Лондон" -> System.out.println("Англия");
//                    case "Берлин", "Мюнхен", "Кёльн" -> System.out.println("Германия");
//                    default -> System.out.println("Неизвестная страна");
//                }
//            }
//        }

//        2)
//        Scanner scanner = new Scanner(System.in);
//
//        while(true){
//            double x = scanner.nextDouble();
//            double y = scanner.nextDouble();
//
//            if(y == 0){
//                break;
//            }
//            System.out.println(x / y);
//        }

//        3)
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i<5){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if(y == 0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(x / y);

            ++i;
        }
    }
}

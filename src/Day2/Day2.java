package Day2;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

//        1)
//        Scanner scanner = new Scanner(System.in);
//
//        int floor = scanner.nextInt();
//
//        if(floor >= 1 && floor <= 4){
//            System.out.println("Малоэтажный дом");
//        }else if(floor >= 5 && floor <= 8){
//            System.out.println("Среднеэтажный дом");
//        }else if(floor >= 9){
//            System.out.println("Многоэтажный дом");
//        }else{
//            System.out.println("Ошибка ввода");
//        }

//        2)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число: ");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число: ");
//        int b = scanner.nextInt();
//
//        if(a >=b ){
//            System.out.println("Некореректный ввод");
//        } else {
//            for(int i=a; i <= b; i+=1){
//                if(i%5 == 0 && i%10!=0){
//                    System.out.println(i);
//                }
//            }
//        }

//        3) не до конца решен
            Scanner scanner = new Scanner(System.in);

            double x = scanner.nextDouble();

            double res = (Math.pow(x, 2) - 10) / (x + 7);

            double secondres = (x + 3)*(Math.pow(x, 2) - 2);

        System.out.println(res);
        System.out.println(secondres);

    }
}

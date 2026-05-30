package Day4;

public class Day4 {
    public static void main(String[] args) {
//        1)
//        Scanner scanner = new Scanner(System.in);
//        int capacity = scanner.nextInt();
//
//        int[] numbers = new int[capacity];
//
//        for(int i=0; i<numbers.length; i++){
//            numbers[i] = (int) (Math.random() * 10);
//        }
//
//        int countMoreEight = 0;
//        int countOne = 0;
//        int countOdd = 0;
//        int countEven = 0;
//        int sumOfArray = 0;
//
//        for(int number: numbers){
//            if(number == 1){
//                countOne++;
//            }else if(number > 8){
//                countMoreEight++;
//            }
//            if(number % 2 == 0){
//                countEven++;
//            }else if(number % 2 != 0){
//                countOdd++;
//            }
//
//            sumOfArray+=number;
//        }
//
//        System.out.printf("Длина массива: %d \n", numbers.length);
//        System.out.printf("Количество чисел больше 8: %d \n", countMoreEight);
//        System.out.printf("Количество чисел равных 1: %d \n", countOne);
//        System.out.printf("Количество четных чисел: %d \n", countEven);
//        System.out.printf("Количество нечетных чисел: %d \n", countOdd);
//        System.out.printf("Сумма всех элементов массива: %d \n", sumOfArray);

//        2)
//        int[] numbers2 = new int[100];
//
//        for(int i=0; i<numbers2.length; i++){
//            numbers2[i] = (int) (Math.random() * 10000);
//        }
//
//        int highNum = 0;
//        int lowNum = 10000;
//        int countTailZeroNum = 0;
//        int countTailZeroSum = 0;
//
//        for(int number: numbers2){
//            if(number > highNum){
//                highNum = number;
//            }
//
//            if(number < lowNum){
//                lowNum = number;
//            }
//
//            if(number % 10 == 0){
//                countTailZeroNum++;
//                countTailZeroSum += number;
//            }
//        }
//
//        System.out.println(highNum);
//        System.out.println(lowNum);
//        System.out.println(countTailZeroNum);
//        System.out.println(countTailZeroSum);

//        3)
//        int[][] matrix = new int[3][5];
//        int[] sumLines = new int[3];
//        int temp = 0;
//
//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix[i].length; j++){
//                matrix[i][j] = (int)(Math.random() * 50);
//                temp+=matrix[i][j];
//            }
//            sumLines[i] = temp;
//            temp = 0;
//        };
//
//
//        int high = 0;
//        for(int sum: sumLines){
//            if(sum>high){
//                high = sum;
//            }
//        }
//        System.out.println(high);

//        4)

        int[] numbers = new int[100];

        for(int i=0; i<numbers.length; i++){
            numbers[i] = (int)(Math.random() * 1000);
        }

        int maxSum = 0;
        int maxIndex = 0;
        for(int i=0; i<numbers.length-2; i++){
            int sum = numbers[i] + numbers[i+1] + numbers[i+2];
            if(sum > maxSum){
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.printf("Максимальное число: %d; Индекс: %d;", maxSum, maxIndex);
    }
}

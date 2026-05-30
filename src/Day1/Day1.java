package Day1;

public class Day1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int init = 0;

//        1)
        while(init <= 10){
            sb.append("JAVA ");
            init++;
        }
        System.out.println(sb.toString());

//        2)
        sb.delete(0, sb.length());
        System.out.println(sb.toString());
        for(int i=0; i<=10; i++){
            sb.append("JAVA ");
        }
        System.out.println(sb.toString());

//        3)
        for(int i=0; i<=10; i++){
            System.out.println("JAVA");
        }

//        4)
        int year = 1980;

        while(year <= 2020){
            System.out.printf("Олимпиада %d года \n", year);
            year+=4;
        }
//        5)
        for(int i=1980; i<=2020; i+=4){
            System.out.printf("Олимпиада %d года \n", i);
        }

//        6)
        int k = 9;

        for(int i=1; i<10; i++){
            System.out.printf("%d x %d = %d \n", k, i, (k*i));
        }
    }
}

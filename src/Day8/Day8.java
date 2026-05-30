package Day8;

public class Day8 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<=20000; i++){
            sb.append(i + " ");
        }

        System.out.printf(sb.toString() + "\n");

        Airplane boing = new Airplane("Boing", 2000, 150, 10000);
        System.out.println(boing);
    }
}

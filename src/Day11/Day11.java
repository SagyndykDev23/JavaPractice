package Day11;

public class Day11 {
    public static void main(String[] args) {

        Warehouse wh = new Warehouse();
        Picker pick = new Picker(wh);
        Courier cour = new Courier(wh);


        System.out.println(wh + " " + pick + " " + cour);
        pick.doWork();
        cour.doWork();
        System.out.println(wh + " " + pick + " " + cour);
        for(int i=1; i<=1500; i++){
            pick.doWork();
            cour.doWork();
        }

        pick.bonus();
        cour.bonus();

        System.out.println(wh + " " + pick + " " + cour);



        Warehouse wh2 = new Warehouse();
        Picker pick2 = new Picker(wh2);
        Courier cour2 = new Courier(wh2);

        System.out.println(wh2 + " " + pick2 + " " + cour2);

        pick2.doWork();
        cour2.doWork();

        System.out.println(wh2 + " " + pick2 + " " + cour2);

        System.out.println(wh + " " + pick + " " + cour);

    }
}

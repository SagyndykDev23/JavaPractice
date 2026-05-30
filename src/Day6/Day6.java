package Day6;

public class Day6 {
    public static void main(String[] args) {
        Airplane air = new Airplane("Yamaha", 2010, 180, 2000);
        air.fillUp(50);

        air.info();

        air.setProducer("Boing");
        air.setYear(2020);
        air.fillUp(20);

        air.info();


        Student sagyndyk = new Student("Sagyndyk");
        Teacher nurbolat = new Teacher("Nurbolat", "Computer Science");

        nurbolat.evalueate(sagyndyk);
    }
}

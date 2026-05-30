package Day5;

public class Day5 {
    public static void main(String[] args) {

        Motorbike mb = new Motorbike("Yamaha", "black", 2010);

        System.out.printf(
                "Model: %s; Color: %s; Year: %d",
                mb.getModel(),
                mb.getColor(),
                mb.getYear()
        );
    }
}

class Car {
    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Motorbike{
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
package Day11;

public class Courier implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary+=100;
        warehouse.setBalance((warehouse.getBalance() + 1000));
    }

    @Override
    public void bonus() {
        int limitForBonus = 1_000_000;
        int bonusMultiplication = 2;

        if(warehouse.getBalance() >=  limitForBonus){
            salary *= bonusMultiplication;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}

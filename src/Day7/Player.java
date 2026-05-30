package Day7;

import java.util.Random;
import java.util.UUID;

class Player{
    private UUID id;
    private int stamina;
    private static final int MIN_STAMINA = 0;
    private static final int MAX_STAMINA = 100;
    private static int countPlayers = 0;
    private boolean onField;

    public Player(){
        this.id = UUID.randomUUID();
        Random rand = new Random();
        this.stamina = rand.nextInt(90, MAX_STAMINA+1);

        if(countPlayers < 6){
            countPlayers++;
            this.onField = true;
        }else{
            this.onField = false;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public UUID getId() {
        return id;
    }

    public int getStamina(){
        return this.stamina;
    }

    public void run(){
        if(stamina > MIN_STAMINA){
            this.stamina--;
        }
        if(stamina == MIN_STAMINA && onField){
            countPlayers--;
            onField = false;
        }

    }

    public static void info(){
        int maxCountPlayers = 6;
        if(countPlayers >= maxCountPlayers){
            System.out.printf("На поле нет свободных мест, игроков на поле %d \n", countPlayers);
        }else{
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест \n", maxCountPlayers- countPlayers);
        }
    }
}
package FinalProject;

import java.util.Random;

public class GameController {
    private final Player player1;
    private final Player player2;


    GameController(Player p1, Player p2){
        this.player1 = p1;
        this.player2 = p2;

        gameStart();
    }

    public void gameStart() {
        Random rand = new Random();
        int randNum = rand.nextInt(2)+1;

        if (randNum == 2) {
            System.out.printf("Начнем расставлять корабли на поле %s\n", this.player2.getName());
            System.out.println("Другой игрок, не смотри!");
        } else {
            System.out.printf("Начнем расставлять корабли на поле %s\n", this.player1.getName());
            System.out.println("Другой игрок, не смотри!");
        }
    }

    public void infoBoardPlayer1(){
        player1.board.getBoard();
    }

}

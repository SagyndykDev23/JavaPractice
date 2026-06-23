package FinalProject;

import java.util.*;

public class FinalProject {
    public static void main(String[] args) {

        Player p1 = new Player("Sagyndyk");
        Player p2 = new Player("Damir");

        GameController game = new GameController(p1, p2);

        game.infoBoardPlayer1();
    }
}

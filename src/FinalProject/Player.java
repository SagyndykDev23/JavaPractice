package FinalProject;

public class Player {
    private final String name;
    Board board;

    Player(String name){
        this.name = name;
        this.board = new Board();
    }

    public String getName() {
        return name;
    }

    public void info(){
        board.getBoard();
    }
}

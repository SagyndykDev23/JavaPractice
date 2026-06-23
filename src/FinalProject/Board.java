package FinalProject;

import java.util.Arrays;

public class Board {
    int[][] board;

    Board(){
        this.board = new int[9][9];
    }

    public void getBoard() {
       for(int i=0; i<9; i++){
           System.out.println(Arrays.toString(board[i]));
       }
    }

    @Override
    public String toString() {
        return "Board{" +
                "board=" + Arrays.toString(board) +
                '}';
    }
}

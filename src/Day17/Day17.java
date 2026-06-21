package Day17;

import java.util.*;

public class Day17 {
    public static void main(String[] args) {
        List<ChessPiece> chess = new ArrayList<>();

        for(int i=0; i<=7; i++){
            if(i<4){
                chess.add(ChessPiece.PAWN_WHITE);
            }else{
                chess.add(ChessPiece.ROOK_BLACK);
            }

        }

        System.out.println(chess);

        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
                        {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
                        {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK},
                        {ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY},
                        {ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                        {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                        {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY},
                        {ChessPiece.PAWN_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.QUEEN_WHITE,ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE},
                        {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE,ChessPiece.EMPTY},
                });

        chessBoard.print();
    }
}

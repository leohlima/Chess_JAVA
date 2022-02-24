package Program;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        ChessMatch chessMatch = new ChessMatch();


        UI.printBoard(chessMatch.getPieces());
    }
}

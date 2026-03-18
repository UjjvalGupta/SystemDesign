package Classes;

import Enums.PlayingPieces;

public abstract class PlayingPiece {

    private PlayingPieces piece;

    PlayingPiece(PlayingPieces piece){
        this.piece = piece;
    }

    public String getSymbol() {
        return piece.name();
    }
}

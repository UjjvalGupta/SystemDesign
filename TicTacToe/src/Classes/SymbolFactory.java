package Classes;

import Enums.PlayingPieces;

public class SymbolFactory {

    public PlayingPiece getPlayingPiece(String symbol){
        if(symbol.equalsIgnoreCase(PlayingPieces.X.name())){
            return new PlayingPieceX();
        } else if (symbol.equalsIgnoreCase(PlayingPieces.O.name())){
            return new PlayingPieceO();
        }
        return null;
    }
}

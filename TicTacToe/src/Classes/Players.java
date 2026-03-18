package Classes;

public class Players {

    private String name;
    private PlayingPiece piece;

    Players(PlayingPiece piece, String name){
        this.piece = piece;
        this.name = name;
    }

    public String getPlayerSymbol(){
        return piece.getSymbol();
    }

    public String getName() {
        return name;
    }
}

import java.util.List;

public class Board {
    private Cell[][] cells;


    public Board(int boardSize, List<Snake> snakes, List<Ladder> ladders) {
        this.cells = new Cell[boardSize][boardSize];
        initializeCellsWithSnakeAndLadders(snakes, ladders);
    }

    private void initializeCellsWithSnakeAndLadders(List<Snake> snakes, List<Ladder> ladders) {
        // initialized cells with snakes and ladders
    }

    private Snake checkSnake(Players player){

    }

    private Ladder checkLadder(Players player){

    }
}

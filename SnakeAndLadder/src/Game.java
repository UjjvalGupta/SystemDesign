import java.util.List;
import java.util.Queue;

public class Game {
    Board board;
    Queue<Players> players;
    Dice dice;


    Game(int boardSize, List<Snake> snakes, List<Ladder> ladders, Queue<Players> players, int diceCount){
        this.board = new Board(boardSize, snakes, ladders);
        this.players = players;
        this.dice = new Dice(diceCount);
    }

    Players playGame(){
        // game is played until winner is found
        //rollDice()
        // checkWinner, checkSnake, checkLadder
        return winner;
    }

    boolean checkWinner(Players player){
        return // true or false;
    }






}

import Classes.Game;
import Enums.PlayingPieces;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of players: ");
        Scanner sc = new Scanner(System.in);
        int maxNumberOfPlayers = PlayingPieces.values().length;
        int n=0;
        while(true){
            n = sc.nextInt();
            if(n==1 || n>maxNumberOfPlayers){
                System.out.println("Invalid number of players, players should be more than 1, less than or equal to" + maxNumberOfPlayers + ", please try again");
            } else {
                break;
            }
        }
        System.out.println("Enter the size of the board: ");
        int size = sc.nextInt();
        Game game = new Game(size, n);
        System.out.println(game.startGame());

    }
}
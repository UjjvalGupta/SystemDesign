package Classes;

import java.util.*;

public class Game {
    private String [][] board;
    private int numberOfPlayers;
    private Queue<Players> players;
    private SymbolFactory symbolFactory;
    private int maxEntries;

    public Game(int size, int numberOfPlayers){
        board = new String[size][size];
        this.players = new LinkedList<>();
        this.numberOfPlayers = numberOfPlayers;
        this.symbolFactory = new SymbolFactory();
        maxEntries = size * size;
    }

    public String startGame(){
        Scanner sc = new Scanner(System.in);
        initializePlayers(sc);
        int entries = 0;
        while(true){
            Players player = players.peek();
            String symbol = player.getPlayerSymbol();
            String name = player.getName();
            System.out.println("Player: " + name + " please enter the row or column to be played in (comma separated): ");
            String rowCol = sc.nextLine();
            List<String> rowColList = Arrays.asList(rowCol.split(","));
            if(!validEntry(rowColList)){
                continue;
            }
            int row = Integer.parseInt(rowColList.get(0));
            int col = Integer.parseInt(rowColList.get(1));
            board[row-1][col-1] = symbol;
            entries++;
            players.poll();
            players.add(player);
            String s = evaluateGameOver(player, entries, row, col);
            if(s!=null){
                return s;
            }
        }
        return null;

    }

    private String evaluateGameOver(Players player, int entries, int row, int col) {

        for(int j=1;j< board.length; j++){
            String entry = board[row][j];
            if(entry.isEmpty() || !entry.equalsIgnoreCase(board[row][j-1])){
                break;
            }
            if(j==board.length-1){
                return "Player: " + player.getName() + "has won";
            }
        }
        for(int j=1;j< board.length; j++){
            String entry = board[j][col];
            if(entry.isEmpty() || !entry.equalsIgnoreCase(board[j-1][col])){
                break;
            }
            if(j==board.length-1){
                return "Player: " + player.getName() + "has won";
            }
        }

        if(row == col){
            for(int i=1;i<board.length;i++){
                String entry = board[i][i];
                if(entry.isEmpty() || !entry.equalsIgnoreCase(board[i-1][i-1])){
                    break;
                }
                if(i==board.length-1){
                    return "Player: " + player.getName() + "has won";
                }
            }
        }
    }

    private boolean validEntry(List<String> rowColList) {
        if(rowColList.size()!=2){
            System.out.println("Invalid row column");
            return false;
        }
        int row = Integer.parseInt(rowColList.get(0));
        int col = Integer.parseInt(rowColList.get(1));

        String s = row<=board.length && col<=board.length && row>0 && col>0  ? board[row - 1][col -1] : null;
        if(s == null){
            System.out.println("Invalid row column");
            return false;
        }

        if(!s.isEmpty()){
            System.out.println("Place already filled");
            return false;
        }
        return true;
    }

    private void initializePlayers(Scanner scanner) {
        int i=1;
        List<String> usedSymbols = new ArrayList<>();
        while(i > numberOfPlayers){
            System.out.println("Enter the playing piece of player" + i + ":");
            String symbol = scanner.nextLine();
            PlayingPiece piece = symbolFactory.getPlayingPiece(symbol);
            if(piece == null){
                System.out.println("Incorrect symbol");
                continue;
            }
            System.out.println("Enter the name of player" + i + ":");
            String name = scanner.nextLine();
            Players player = new Players(piece, name);
            players.add(player);
            i++;
        }
    }


}

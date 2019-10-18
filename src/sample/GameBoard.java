package sample;

import sample.squares.Privacy;
import sample.squares.Square;
import sample.squares.Start;
import sample.squares.Type;

import java.util.*;
import java.util.List;
import java.util.Random;

public class GameBoard {

    public Player player;
    public List<Player> playersV1;
    public int numberOfPlayers;
    public int numberOfRounds;
    public Map<Square, CircularList> positionPlayer = new HashMap<>();
    public Map<CircularList, Square> playerPosition = new HashMap<>();

    //  public List<Player> players;

    // public Map<Privacy, Player> positionOfEachPlayer;
    //public Privacy gameSquares;
    public List<Square> allGameSquares;
 //   public Map<Integer, Privacy> gameBoard = new HashMap<>();//не нужно


    Scanner sc = new Scanner(System.in);
    Random random;

    public void addpalyer(String name) {
        player = new Player(name);
        playersV1.add(player);
        player = null;
    }


    public void createGameDeck() {
        Start gameSquareStart = new Start("Start", Type.SPECIAL, 1);
        Privacy gameSquare1 = new Privacy("Avenue", Type.PRIVACY, cost(), 2);
        Privacy gameSquareRoad = new Privacy("Road", Type.STATE, cost(), 3);

    }

    public int cost() {
        random = new Random();
        return (random.nextInt(300) + 1);
    }


    public void play() {

        createGameDeck();
        playersV1 = new LinkedList<>();
        System.out.print("Enter count of players: ");
        numberOfPlayers = sc.nextInt();
        String name;

        if (numberOfPlayers == 0) return;
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Enter name: ");
            name = sc.next();
            addpalyer(name);
            //playersV1.display();
        }

        while (numberOfRounds <= 10) {
            for (int i = 0; i < playersV1.size(); i++) {
                
            }
        }


    }


//        createGameDeck();
//        counters = new ArrayList<>();
//        players = new ArrayList<>();
//        System.out.print("Enter count of players: ");
//        numberOfPlayers = sc.nextInt();
//        String name;
//        String color;
//        boolean answer;
//        if (numberOfPlayers == 0) return;
//        for (int i = 0; i < numberOfPlayers; i++) {
//            System.out.print("Enter name: ");
//            name = sc.next();
//            System.out.print("Enter color: ");
//            color = sc.next();
//            addpalyer(name, color);
//        }
//        while (players.get(0).getPosition() != 7 || players.get(1).getPosition() != 7) {
//
//            if (players.get(0).getPosition() == 7) System.out.print("Player 1 is a winner");
//            else if (players.get(1).getPosition() == 7) System.out.print("Player 2 is a winner");
//
//            players.get(0).setPosition(players.get(0).rollTheDice() + players.get(0).getPosition());
//            Privacy currentSquare = gameBoard.get(players.get(0).getPosition());
//            System.out.print("Player now on field:" + players.get(0).getPosition() + "\n");
//            System.out.print("Name: ");
//            System.out.print(currentSquare.getName() + "\n");
//            System.out.print("Color: ");
//            System.out.print(currentSquare.getColor() + "\n");
//            System.out.print("Price: ");
//            System.out.print(currentSquare.getPrice() + "\n");
//            System.out.print("Is bought: ");
//            System.out.print(currentSquare.isBought() + "\n");
//            System.out.print("Do you want to by it?");
//            answer = sc.nextBoolean();
//            if (answer && !currentSquare.isBought()) {
//                if (players.get(0).getMoney().money != 0 && !currentSquare.isBought()) {
//                    currentSquare.setBought(true);
//                    players.get(0).getMoney().setMoney((players.get(0).getMoney().money - currentSquare.getPrice()));
//                }
//            } else {
//                players.get(0).getMoney().setMoney((players.get(0).getMoney().money - currentSquare.getPrice()));
//                players.get(1).getMoney().setMoney((players.get(1).getMoney().money + currentSquare.getPrice()));
//            }
//
//            if (players.get(0).getPosition() == 7) System.out.print("Player 1 is a winner");
//            else if (players.get(1).getPosition() == 7) System.out.print("Player 2 is a winner");
//
//            players.get(1).setPosition(players.get(1).rollTheDice() + players.get(1).getPosition());
//            Privacy currentField1 = gameBoard.get(players.get(1).getPosition());
//            System.out.print("Player now on field:" + players.get(1).getPosition() + "\n");
//            System.out.print("Name: ");
//            System.out.print(currentField1.getName() + "\n");
//            System.out.print("Price: ");
//            System.out.print(currentField1.getPrice() + "\n");
//            System.out.print("Color: ");
//            System.out.print(currentField1.getColor() + "\n");
//            System.out.print("Is bought: ");
//            System.out.print(currentField1.isBought() + "\n");
//            System.out.print("Do you want to by it?");
//            answer = sc.nextBoolean();
//            if ((answer && !currentField1.isBought())) {
//                if (players.get(1).getMoney().money != 0 && !currentField1.isBought()) {
//                    currentField1.setBought(true);
//                    players.get(1).getMoney().setMoney(players.get(1).getMoney().money - currentField1.getPrice());
//                }
//            } else {
//                players.get(1).getMoney().setMoney(players.get(1).getMoney().money - currentField1.getPrice());
//                players.get(0).getMoney().setMoney(players.get(0).getMoney().money + currentField1.getPrice());
//            }
//        }
}


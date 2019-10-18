package sample;

import sample.squares.*;

import java.util.*;
import java.util.List;
import java.util.Random;

import static sample.squares.Type.PRIVACY;
import static sample.squares.Type.SPECIAL;


public class GameBoard {

    public Player player;
    public CircularList<Player> playersV1;
    public int numberOfPlayers;
    public int numberOfRounds;
    public Map<Square, CircularList> positionPlayer = new HashMap<>();
    public Map<CircularList, Square> playerPosition = new HashMap<>();

    public Map<Square, Player> squaresBoughtByPlayer = new HashMap<>();
    public Map<Player, Square> playersSquares = new HashMap<>();


    //  public List<Player> players;

    // public Map<Privacy, Player> positionOfEachPlayer;
    //public Privacy gameSquares;
    public List<Square> allGameSquares = new CircularList<>();
    //   public Map<Integer, Privacy> gameBoard = new HashMap<>();//не нужно


    Scanner sc = new Scanner(System.in);
    private Random random1 = new Random();
    private Boolean randomBoolean;

    public void addpalyer(String name) {
        player = new Player(name);
        playersV1.add(player);
        player = null;
    }


    public void createGameDeck() {

        Start gameSquareStart = new Start("Start", SPECIAL, 1);
        allGameSquares.add(gameSquareStart);
        squaresBoughtByPlayer.put(gameSquareStart, null);
        Privacy gameSquare1 = new Privacy("Avenue", PRIVACY, cost(), 2);
        allGameSquares.add(gameSquare1);
        squaresBoughtByPlayer.put(gameSquare1, null);
        Privacy gameSquareRoad = new Privacy("Road", PRIVACY, cost(), 3);
        allGameSquares.add(gameSquareRoad);
        squaresBoughtByPlayer.put(gameSquareRoad, null);
        Bonus gameSquareBonus = new Bonus("Bonus", SPECIAL, bonus(), 4);
        allGameSquares.add(gameSquareBonus);
        squaresBoughtByPlayer.put(gameSquareBonus, null);

    }


    public int cost() {
        int min = 1;
        int max = 300;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }

    public int bonus() {
        int min = 1;
        int max = 500;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }

    public void play() {

        createGameDeck();
        playersV1 = new CircularList<>();
        System.out.print("Enter count of players: ");
        numberOfPlayers = sc.nextInt();
        String name;

        if (numberOfPlayers == 0) return;
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Enter name: ");
            name = sc.next();
            addpalyer(name);

        }

        while (numberOfRounds <= 10) {
            for (int i = 0; i < numberOfPlayers; i++) {
                Player player = playersV1.get(i);
                int rollToDice = player.rollTheDice();
                int getPos = player.getPosition();
                int currentPosition = rollToDice + getPos - 1;
                if (currentPosition > allGameSquares.size()) currentPosition -= allGameSquares.size();
                player.setPosition(currentPosition);
                Square square = allGameSquares.get(currentPosition);
                playerPosition.put(playersV1, square);
                Square currentSquare = playerPosition.get(playersV1);
                System.out.print("Player " + player.colorID + " now on field:" + player.getPosition() + "\n");
                System.out.print("Name: " + currentSquare.getName() + "\n");
                int money = player.getMoney();
                switch (square.getType()) {
                    case PRIVACY:
                        if (squaresBoughtByPlayer.get(square) != null) {
                            System.out.println("The square is bought by " + squaresBoughtByPlayer.get(square).colorID);
                        } else {
                            System.out.println("The square is free");
                            randomBoolean = random1.nextBoolean();
                            if (randomBoolean) {
                                player.setMoney(money - ((Privacy) square).getPrice());
                                System.out.println("-" + ((Privacy) square).getPrice());
                                squaresBoughtByPlayer.put(square, player);
                                System.out.println("The square is bought by " + squaresBoughtByPlayer.get(square).colorID);
                            }
                        }
                        break;
                    case SPECIAL:
                        int bonus = bonus();
                        player.setMoney(player.getMoney() + bonus);
                        System.out.println("+"+ bonus);
                        break;

                }
                System.out.println(player.getMoney());
                System.out.print("\n");
            }
            numberOfRounds++;
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


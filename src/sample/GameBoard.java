package sample;

import java.awt.*;
import java.util.*;
import java.util.List;

public class GameBoard {
    public List<Player> players;
    public List<Counter> counters;
    // public Map<GameSquares, Player> positionOfEachPlayer;
    //public GameSquares gameSquares;
    public List<GameSquares> gameSquares;
    public Map<Integer, GameSquares> gameBoard = new HashMap<>();//не нужно
    public Player player;
    public Counter counter;
    public int numberOfPlayers;
    Scanner sc = new Scanner(System.in);

    public void addpalyer(String name, String color) {
        counter = new Counter(name, color);
        player = new Player(counter, name);
        counters.add(counter);
        players.add(player);
        player = null;
        counter = null;
    }


    public void createGameDeck() {
        GameSquares gameSquareStart = new GameSquares("Start", "Special", "Gray", true, 0);
        gameBoard.put(0, gameSquareStart);
        GameSquares gameSquareBonus = new GameSquares("Bonus", "Special", "Gray", true, 0);
        gameBoard.put(1, gameSquareBonus);
        GameSquares gameSquarePrison = new GameSquares("Prison", "Special", "Gray", true, 0);
        gameBoard.put(2, gameSquarePrison);

        GameSquares gameSquareAvenue1 = new GameSquares("Connecticut avenue", "Privacy", "Blue", false, 120);
        gameBoard.put(3, gameSquareAvenue1);
        GameSquares gameSquareAvenue2 = new GameSquares("Vermont avenue", "Privacy", "Blue", false, 100);
        gameBoard.put(4, gameSquareAvenue2);
        GameSquares gameSquareAvenue3 = new GameSquares("Oriental avenue", "Privacy", "Blue", false, 100);
        gameBoard.put(5, gameSquareAvenue3);

        GameSquares gameSquareRailRoad = new GameSquares("Reading railroad", "State", "Black", false, 200);
        gameBoard.put(6, gameSquareRailRoad);
        GameSquares gameSquareElectricCompany = new GameSquares("ElectricCompany", "State", "Black", false, 150);
        gameBoard.put(7, gameSquareElectricCompany);
    }

    public void play() {
        createGameDeck();
        counters = new ArrayList<>();
        players = new ArrayList<>();
        System.out.print("Enter count of players: ");
        numberOfPlayers = sc.nextInt();
        String name;
        String color;
        boolean answer;
        if (numberOfPlayers == 0) return;
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Enter name: ");
            name = sc.next();
            System.out.print("Enter color: ");
            color = sc.next();
            addpalyer(name, color);
        }
        while (players.get(0).getPosition() != 7 || players.get(1).getPosition() != 7) {

            if (players.get(0).getPosition() == 7) System.out.print("Player 1 is a winner");
            else if (players.get(1).getPosition() == 7) System.out.print("Player 2 is a winner");

            players.get(0).setPosition(players.get(0).rollTheDice() + players.get(0).getPosition());
            GameSquares currentSquare = gameBoard.get(players.get(0).getPosition());
            System.out.print("Player now on field:" + players.get(0).getPosition() + "\n");
            System.out.print("Name: ");
            System.out.print(currentSquare.getName() + "\n");
            System.out.print("Color: ");
            System.out.print(currentSquare.getColor() + "\n");
            System.out.print("Price: ");
            System.out.print(currentSquare.getPrice() + "\n");
            System.out.print("Is bought: ");
            System.out.print(currentSquare.isBought() + "\n");
            System.out.print("Do you want to by it?");
            answer = sc.nextBoolean();
            if (answer && !currentSquare.isBought()) {
                if (players.get(0).getMoney().money != 0 && !currentSquare.isBought()) {
                    currentSquare.setBought(true);
                    players.get(0).getMoney().setMoney((players.get(0).getMoney().money - currentSquare.getPrice()));
                }
            } else {
                players.get(0).getMoney().setMoney((players.get(0).getMoney().money - currentSquare.getPrice()));
                players.get(1).getMoney().setMoney((players.get(1).getMoney().money + currentSquare.getPrice()));
            }

            if (players.get(0).getPosition() == 7) System.out.print("Player 1 is a winner");
            else if (players.get(1).getPosition() == 7) System.out.print("Player 2 is a winner");

            players.get(1).setPosition(players.get(1).rollTheDice() + players.get(1).getPosition());
            GameSquares currentField1 = gameBoard.get(players.get(1).getPosition());
            System.out.print("Player now on field:" + players.get(1).getPosition() + "\n");
            System.out.print("Name: ");
            System.out.print(currentField1.getName() + "\n");
            System.out.print("Price: ");
            System.out.print(currentField1.getPrice() + "\n");
            System.out.print("Color: ");
            System.out.print(currentField1.getColor() + "\n");
            System.out.print("Is bought: ");
            System.out.print(currentField1.isBought() + "\n");
            System.out.print("Do you want to by it?");
            answer = sc.nextBoolean();
            if ((answer && !currentField1.isBought())) {
                if (players.get(1).getMoney().money != 0 && !currentField1.isBought()) {
                    currentField1.setBought(true);
                    players.get(1).getMoney().setMoney(players.get(1).getMoney().money - currentField1.getPrice());
                }
            } else {
                players.get(1).getMoney().setMoney(players.get(1).getMoney().money - currentField1.getPrice());
                players.get(0).getMoney().setMoney(players.get(0).getMoney().money + currentField1.getPrice());
            }
        }
    }
}

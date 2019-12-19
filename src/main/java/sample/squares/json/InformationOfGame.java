package sample.squares.json;

import sample.player.Player;
import sample.squares.square.Square;
import sample.utils.CircularList;


public class InformationOfGame {
    private CircularList<Player> players;


    private int numberOfPlayers;


    public InformationOfGame() {
    }
    private int numberRound;

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public CircularList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(CircularList<Player> players) {
        this.players = players;
    }

    public int getNumberRound() {
        return numberRound;
    }

    public void setNumberRound(int numberRound) {
        this.numberRound = numberRound;
    }



}

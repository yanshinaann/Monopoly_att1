package sample;

import sample.squares.Privacy;

import java.util.List;
import java.util.Random;

public class Player {

    public Random random;


    String colorID;
    private int money;
    private List<Privacy> boughtGameSquares;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Player(String colorID) {
        this.colorID = colorID;
        setMoney(5000);

    }

    public int rollTheDice() {

        int min = 1;
        int max = 3;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }

    public String getColorID() {
        return colorID;
    }

    public void setColorID(String colorID) {
        this.colorID = colorID;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


}

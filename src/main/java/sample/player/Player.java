package sample.player;

import java.util.Random;

public class Player {

    private String colorID;
    private int money;
    //private List<Privacy> boughtGameSquares;
    private int position;
    private int countCircles;

    public Player(String colorID) {
        this.colorID = colorID;
        setMoney(5000);

    }

    public int rollTheDice() {

        int min = 1;
        int max = 9;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }


    public int getCountCircles() {
        return countCircles;
    }

    public void setCountCircles(int countCircles) {
        this.countCircles = countCircles;
    }


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
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

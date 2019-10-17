package sample;

import java.awt.*;
import java.util.Random;

public class GameSquares extends Square {

    private Random random;
    private String name;
    private int price;
    private Enum type;

    public GameSquares(String name, Enum type, int price) {
        super(name, type);
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int cost() {
        random = new Random();
        return (random.nextInt(300) + 1);
    }


    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    //private boolean isBought;



}

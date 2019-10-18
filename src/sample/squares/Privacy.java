package sample.squares;

import java.util.Random;

public class Privacy extends Square {

    private Random random;
    private String name;
    private int price;
    private Enum type;
    private int positionOnABoard;

    public Privacy(String name, Enum type, int price, int positionOnABoard) {
        super(name, type, positionOnABoard);
        this.positionOnABoard = positionOnABoard;
        this.name = name;
        this.price = price;
        this.type = type;
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

    public int getPositionOnABoard() {
        return positionOnABoard;
    }

    public void setPositionOnABoard(int positionOnABoard) {
        this.positionOnABoard = positionOnABoard;
    }

    //private boolean isBought;



}

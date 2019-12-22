package sample.squares.privacy;

import sample.squares.square.Type;
import sample.squares.square.SquareInmpliments;

import java.util.Random;

public class Privacy extends SquareInmpliments {

    private Random random;
    private String name;
    private int price;
    private Type type;
    private int positionOnABoard;

    public Privacy(String name, Type type, int price, int positionOnABoard) {
        super(name, positionOnABoard, price, type);
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
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
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

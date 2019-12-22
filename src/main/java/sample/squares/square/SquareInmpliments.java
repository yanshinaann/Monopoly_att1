package sample.squares.square;

import java.util.Random;

public class SquareInmpliments implements Square {

    private Random random;
    private String name;
    protected int price;
    private Type type;
    private int positionOnABoard;


    public SquareInmpliments() {

    }

    public SquareInmpliments(String name, int positionOnABoard) {
        this.positionOnABoard = positionOnABoard;
        this.name = name;

    }
    public SquareInmpliments(String name, int positionOnABoard, int price) {
        this.positionOnABoard = positionOnABoard;
        this.name = name;
        this.price = price;
    }

    public SquareInmpliments(String name, int positionOnABoard, int price, Type type) {
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


    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public int getPositionOnABoard() {
        return positionOnABoard;
    }

    public void setPositionOnABoard(int positionOnABoard) {
        this.positionOnABoard = positionOnABoard;
    }

    //private boolean isBought;


}

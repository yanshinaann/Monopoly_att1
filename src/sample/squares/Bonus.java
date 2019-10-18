package sample.squares;

import sample.squares.Square;

public class Bonus extends Square {
    private String name;
    private Enum type;
    private int gift;
    private int positionOnABoard;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public int getGift() {
        return gift;
    }

    public void setGift(int gift) {
        this.gift = gift;
    }

    public int getPositionOnABoard() {
        return positionOnABoard;
    }

    public void setPositionOnABoard(int positionOnABoard) {
        this.positionOnABoard = positionOnABoard;
    }

    public Bonus(String name, Enum type, int gift, int positionOnABoard) {
        super(name, type, positionOnABoard);
        this.positionOnABoard = positionOnABoard;
        this.name = name;
        this.type = type;
        this.gift = gift;
    }
}

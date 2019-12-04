package sample.squares.special;

import sample.squares.square.Type;
import sample.squares.square.SquareInmpliments;

public class Start extends SquareInmpliments {
    private String name;
    private Type type;
    private int positionOnABoard;

    public Start(String name, Type type, int bonus, int positionOnABoard) {
        super(name, positionOnABoard, bonus, type);
        this.positionOnABoard = positionOnABoard;
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPositionOnABoard() {
        return positionOnABoard;
    }

    public void setPositionOnABoard(int positionOnABoard) {
        this.positionOnABoard = positionOnABoard;
    }
}

package sample.squares;

public class Jail extends Square {
    private String name;
    private Type type;
    private int fine;
    private int positionOnABoard;

    public Jail(String name, Type type, int fine, int positionOnABoard1) {
        super(name, type, positionOnABoard1);
        this.fine = fine;
        this.positionOnABoard = positionOnABoard1;
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

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    @Override
    public int getPositionOnABoard() {
        return positionOnABoard;
    }

    @Override
    public void setPositionOnABoard(int positionOnABoard) {
        this.positionOnABoard = positionOnABoard;
    }


}

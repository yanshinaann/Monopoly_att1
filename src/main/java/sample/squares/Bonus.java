package sample.squares;

public class Bonus extends SquareInmpliments {
    private String name;
    private Type type;
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

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    public Bonus(String name, Type type, int gift, int positionOnABoard) {
        super(name, positionOnABoard, type);
        this.positionOnABoard = positionOnABoard;
        this.name = name;
        this.type = type;
        this.gift = gift;
    }
}

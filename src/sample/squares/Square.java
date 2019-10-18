package sample.squares;

public class Square {
    private String name;
    private Enum type;
    private int positionOnABoard;

    public Square(String name, Enum  type, int positionOnABoard) {
        this.positionOnABoard = positionOnABoard;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
}

package sample.squares;

public class Start extends Square {
    private String name;
    private Enum type;
    private int positionOnABoard;

    public Start(String name, Enum type, int positionOnABoard) {
        super(name, type,positionOnABoard);
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

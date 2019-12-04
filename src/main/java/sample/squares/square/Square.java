package sample.squares.square;

public interface Square {
    String getName();

    Type getType();

    int getPositionOnABoard();

    void setType(Type type);

    void setPositionOnABoard(int getPositionOnABoard);

    void setName(String getname);
}

package sample.squares.bonus;

import sample.squares.square.Square;

public interface Bonus extends Square {

    void setBonusType(BonusType bonusType);
    BonusType getBonusType();
    int getPrice();


//    private String name;
//    private Type type;
//    private int gift;
//    private int positionOnABoard;
//    private BonusType bonusType;
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//
//    public int getGift() {
//        return gift;
//    }
//
//    public void setGift(int gift) {
//        this.gift = gift;
//    }
//
//    public int getPositionOnABoard() {
//        return positionOnABoard;
//    }
//
//    public void setPositionOnABoard(int positionOnABoard) {
//        this.positionOnABoard = positionOnABoard;
//    }
//
//    @Override
//    public Type getType() {
//        return type;
//    }
//
//    @Override
//    public void setType(Type type) {
//        this.type = type;
//    }
//
//    public BonusType getBonusType() {
//        return bonusType;
//    }
//
//    public void setBonusType(BonusType bonusType) {
//        this.bonusType = bonusType;
//    }SquareFactory.java
//
//    public Bonus(String name, Type type, int gift, int positionOnABoard) {
//        super(name, positionOnABoard, gift,  type);
//        this.positionOnABoard = positionOnABoard;
//        this.name = name;
//        this.type = type;
//        this.gift = gift;
//       // this.bonusType = bonusType;
//    }
}

package sample.squares.bonus;

import sample.squares.square.Type;

public abstract class BonusDecorator extends BonusImpl implements Bonus{
  //  BonusType bonusType;
    Bonus bonus;
    public BonusDecorator(Bonus bonus) {
        super(bonus.getName(),bonus.getPositionOnABoard(), bonus.getPrice());
        this.bonus = bonus;
    }

    @Override
    public Type getType() {
        return bonus.getType();
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setBonusType(BonusType bonusType) {
        bonus.setBonusType(bonusType);
    }

    @Override
    public BonusType getBonusType() {
        return bonus.getBonusType();
    }

    @Override
    public String getName() {
        return bonus.getName();
    }

    @Override
    public void setName(String name) {
        bonus.setName(name);
    }

    @Override
    public void setType(Type type) {
        bonus.setType(type);
    }

    @Override
    public int getPositionOnABoard() {
        return bonus.getPositionOnABoard();
    }

    @Override
    public void setPositionOnABoard(int positionOnABoard) {
        bonus.setPositionOnABoard(positionOnABoard);
    }

    //    protected String name;
//    protected int positionOnABoard;
//    protected Type type;
//    protected  int price;
//    protected BonusType bonusType;
//    public BonusDecorator(String name, int positionOnABoard, int price, Type type, BonusType bonusType) {
//        super(name, type,  price,positionOnABoard,bonusType );
//        this.name = name;
//        this.positionOnABoard = positionOnABoard;
//        this.type = type;
//        this.price = price;
//        this.bonusType = bonusType;
//    }

  //  public abstract int getFee();
}

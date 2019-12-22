package sample.squares.bonus;

import sample.squares.square.Square;

public class BonusMin extends BonusDecorator {

    public BonusMin(Bonus bonus) {

        super(bonus);
        bonus.setBonusType(BonusType.MINUS);
    }


    public BonusMin(Square square) {

        super((Bonus) square);
        bonus.setBonusType(BonusType.MINUS);// bonus -- это поле декоратора
        //bonus.setType(Type.BONUS);
    }

    @Override
    public BonusType getBonusType() {
        return BonusType.MINUS;
    }

    //    public BonusMin(S) {
//        super(name, positionOnABoard, price, type);
//    }
/*
    @Override
    public int getFee() {
        return this.price - 2*price;
    }*/
}
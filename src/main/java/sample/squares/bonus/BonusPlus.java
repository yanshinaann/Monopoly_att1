package sample.squares.bonus;

import sample.squares.square.Square;

public class BonusPlus extends BonusDecorator {
    public BonusPlus(Bonus bonus) {

        super(bonus);
        bonus.setBonusType(BonusType.PLUS);
    }


    public BonusPlus(Square square) {
        super((Bonus) square);
        bonus.setBonusType(BonusType.PLUS);// bonus -- это поле декоратора
       // bonus.setType(Type.BONUS);

    }

    @Override
    public BonusType getBonusType() {
        return BonusType.PLUS;
    }
//
//    public BonusPlus(Bonus bonus, BonusType bonusType) {
//        super();
//       // price = getFee();
//    }

/*    @Override
    public int getFee() {
        return this.price+ price;
    }*/
}

package sample.squares.square;

import sample.squares.bonus.BonusImpl;
import sample.squares.bonus.BonusMin;
import sample.squares.bonus.BonusPlus;
import sample.squares.bonus.BonusType;
import sample.squares.privacy.Privacy;
import sample.squares.special.Jail;
import sample.squares.special.Start;

public class Create {
   // SquareInmpliments createPrivacy(String name, int price, int position, Type squareType) throws Exception, SquareException;
   // SquareInmpliments createBonus(Square square, BonusType bonusType) throws Exception, SquareException;
    public static SquareInmpliments createPrivacy(String name, int cost, int position, Type squareType) throws SquareException {
        switch (squareType) {
            case PRIVACY:
                return new Privacy(name, squareType, cost, position);
            case JAIL:
                return new Jail(name, squareType, cost, position);
            case BONUS:
                //return new BonusImpl(name, position, cost,  squareType);
                return new BonusImpl(name, position, cost);
            case START:
                return new Start(name, squareType, cost, position);
            default:
                throw new SquareException();
        }
    }

   // @Override
    public static SquareInmpliments createBonus(Square square, BonusType bonusType) throws SquareException {
        switch (bonusType) {
            case PLUS:
                return new BonusPlus(square);
            case MINUS:
                return new BonusMin(square);
            default:
                throw new SquareException();
        }
    }

}

package sample.squares.bonus;

import sample.squares.square.SquareInmpliments;
import sample.squares.square.Type;

public class BonusImpl extends SquareInmpliments implements Bonus {
    private BonusType bonusType;

    public BonusImpl(String name, int position, int price) {
        super(name, position, price);
        super.setType(Type.BONUS);
        // super(setBonusType(getBonusType()));
    }

    @Override
    public Type getType() {
        return Type.BONUS;
    }

    @Override
    public void setBonusType(BonusType bonusType) {
        this.bonusType = bonusType;
    }

    @Override
    public BonusType getBonusType() {
        return bonusType;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

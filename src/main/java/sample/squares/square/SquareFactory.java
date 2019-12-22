package sample.squares.square;


import sample.squares.bonus.BonusType;

public abstract class SquareFactory {

    public static Square createSquare(String name, Type squareType, int cost, int position) throws SquareException, Exception {
        Square square = Create.createPrivacy(name, cost, position, squareType);
        return square;
    }

    public static Square createSquare(String name, Type squareType, int cost, int position, BonusType bonusType) throws SquareException, Exception {
        Square square = Create.createPrivacy(name, cost, position, squareType);
        square = Create.createBonus(square, bonusType);
        return square;
    }

  // private static Create action = new Create() {


}

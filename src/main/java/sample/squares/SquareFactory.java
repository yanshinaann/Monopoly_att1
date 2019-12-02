package sample.squares;


public class SquareFactory {

    public static Square createSquare(String name, Type squareType, int cost, int position) throws SquareException, Exception {
        Square square = action.createPrivacy(name, cost, position, squareType);
       // action.createRank(employer,rank);
        return square;
    }
    private static Create action = new Create() {

        public SquareInmpliments createPrivacy(String name, int cost, int position, Type squareType) throws SquareException {
            switch (squareType) {
                case PRIVACY:
                    return new Privacy(name, squareType, cost, position);
                case JAIL:
                    return new Jail(name, squareType, cost, position);
                case BONUS:
                    return new Bonus(name, squareType, cost, position);
                case START:
                    return new Start(name, squareType, position);
                default:
                    throw new SquareException();
            }
        }
    };

}

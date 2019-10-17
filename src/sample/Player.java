package sample;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Player {

    private Counter counter;
    private Money money;
    private List<GameSquares> gameSquares;
    private int position;
    public Random random;
    private int bank;

    public Player(Counter counter, String name) {
        this.name = name;
        this.counter = counter;
        money = new Money();
        setMoney(money);
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public int rollTheDice() {
        random = new Random();
        return (random.nextInt(6)+1);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


    public void setMoney(Money money) {
        this.money = money;
    }

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

//     public void setMoney(Map<Money, Player> money) {
//        Money startCapital = new Money(10000);
//    }

    //   public GameSquares getCurrent() {
    //    return current;
    // }

//   // public void setCurrent(GameSquares current) {
//        this.current = current;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getMoney() {
        return money;
    }


    public List<GameSquares> getGameSquares() {
        return gameSquares;
    }

    public void setGameSquares(List<GameSquares> gameSquares) {
        this.gameSquares = gameSquares;
    }
    private String name;

}

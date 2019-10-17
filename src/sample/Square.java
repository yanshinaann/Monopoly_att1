package sample;

public class Square {
    private String name;
    private Enum type;

    public Square(String name, Enum  type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getType() {
        return type;
    }
}

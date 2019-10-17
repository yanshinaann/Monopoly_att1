package sample;

public class Counter {
    private String color;
    private String name;

    public Counter(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
}

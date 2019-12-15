package sample.squares.special;

public enum SpecialType {
    JAIL(10), START(1), GOTOJAIL(30), FREEPARKING(20);
    private  int position;
    SpecialType(int position) {
        this.position = position;
    }


}

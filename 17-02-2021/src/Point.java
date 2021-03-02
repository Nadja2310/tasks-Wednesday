public class Point {
    private int value;
    private Pointkind pointkind;

    public Point(int value, Pointkind pointkind) {
        this.value = value;
        this.pointkind = pointkind;
    }

    public int getValue() {
        return value;
    }

    public Pointkind getPointkind() {
        return pointkind;
    }
}

enum Pointkind {
    BEGIN, POINT, END;
}
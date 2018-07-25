public class Line implements Figure {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Line == false) return false;
        Line tmp = (Line) obj;
        if ((tmp.p1.equals(this.p1)&&tmp.p2.equals(this.p2))||
                (tmp.p1.equals(this.p2)&&tmp.p2.equals(this.p1))) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "L[" + p1.toString() + ";" + p2.toString() + "]";
    }

    @Override
    public void move(double dx, double dy) {
        p1.move(dx,dy);
        p2.move(dx,dy);
    }

    @Override
    public void flip() {
        p1.flip();
        p2.flip();
    }
}

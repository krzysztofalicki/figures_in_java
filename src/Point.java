public class Point implements Figure {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Point == false) return false;
        Point tmp = (Point) obj;
        if (tmp.x == this.x && tmp.y == this.y) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "P(" + x + "," + y + ")";
    }

    @Override
    public void move(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public void flip() {
        if (x == 0) ;
        else x = -x;
        if (y == 0) ;
        else y = -y;
    }
}

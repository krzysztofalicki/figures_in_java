import java.util.LinkedList;

public class Polygon implements Figure {

    private LinkedList<Point> points = new LinkedList<>();

    public void addPoint(Point p) {
        points.add(p);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Polygon == false) return false;
        Polygon tmp = (Polygon) obj;
        if (this.points.size() != tmp.points.size()) return false;
        for (int i = 0; i < (this.points.size()); i++) {
            if (this.points.get(i).equals(tmp.points.get(i)));
            else return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String text = "POLY[ ";
        for (Point p : points) {
            text = text + p.toString() + " ";
        }
        text = text + "]";
        return text;
    }

    @Override
    public void move(double dx, double dy) {
        for (Point p : points) {
            p.move(dx,dy);
        }
    }

    @Override
    public void flip() {
        for (Point p : points) {
            p.flip();
        }
    }
}

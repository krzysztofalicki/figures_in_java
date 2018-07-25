import java.util.LinkedList;

public class Group implements Figure {

    private LinkedList<Figure> figures = new LinkedList<>();

    public void addFigure(Figure f) {
        figures.add(f);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Group == false) return false;
        Group tmp = (Group) obj;
        if (this.figures.size() != tmp.figures.size()) return false;
        for (int i = 0; i < (this.figures.size()); i++) {
            if (this.figures.get(i).equals(tmp.figures.get(i)));
            else return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String text = "GROUP{ ";
        for (Figure f : figures) {
            text = text + f.toString() + " ";
        }
        text = text + "}";
        return text;
    }

    @Override
    public void move(double dx, double dy) {
        for (Figure f : figures) {
            f.move(dx,dy);
        }
    }

    @Override
    public void flip() {
        for (Figure f : figures) {
            f.flip();
        }
    }
}

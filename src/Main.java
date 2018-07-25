public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(0,-1);
        Point point2 = new Point(2,3);
        Point point3 = new Point(4,-5);
        Point point4 = new Point(5,0);

        System.out.println(point1);
        point1.flip();
        System.out.println(point1);
        point1.move(2,-4);
        System.out.println(point1);

        System.out.println();
        System.out.println();

        Line line1 = new Line(point1,point2);
        Line line2 = new Line(point2,point1);
        Line line3 = new Line(point2,point3);

        System.out.println(line1.equals(line2));
        System.out.println(line3);
        line3.flip();
        System.out.println(line3);

        System.out.println();
        System.out.println();

        Polygon polygon1 = new Polygon();
        polygon1.addPoint(point1);
        polygon1.addPoint(point2);
        polygon1.addPoint(point3);
        Polygon polygon2 = new Polygon();
        polygon2.addPoint(point1);
        polygon2.addPoint(point2);
        polygon2.addPoint(point4);

        System.out.println(polygon1);
        polygon1.move(1,1);
        System.out.println(polygon1);
        System.out.println(polygon1.equals(line1));

        System.out.println();
        System.out.println();

        Group group1 = new Group();
        Group group2 = new Group();
        group1.addFigure(point1);
        group1.addFigure(line1);
        group1.addFigure(polygon1);
        group2.addFigure(point1);
        group2.addFigure(line2);
        group2.addFigure(polygon2);

        System.out.println(group1);
        System.out.println(group1.equals(group2));
        group1.flip();
        System.out.println(group1);

    }
}

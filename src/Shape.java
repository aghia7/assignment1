import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<>();

    public Shape() {
    }

    public void addPoint(Point point) {
        points.add(point);
    }
}

import java.awt.geom.*; // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*; // for DrawingTool

public class IrregularPolygon {
    private ArrayList<Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();

    // constructor
    public IrregularPolygon() {}

    // Add a point to the polygon
    public void add(Point2D.Double aPoint) {
        myPolygon.add(aPoint);
    }

    // Calculate the perimeter of the polygon
    public double perimeter() {
        double perimeter = 0.0;
        int numPoints = myPolygon.size();

        for (int i = 0; i < numPoints; i++) {
            Point2D.Double currentPoint = myPolygon.get(i);
            Point2D.Double nextPoint = myPolygon.get((i + 1) % numPoints); // Wrap around to the first point
            perimeter += currentPoint.distance(nextPoint);
        }

        return perimeter;
    }

    // Calculate the area of the polygon using the Shoelace formula
    public double area() {
        double area = 0.0;
        int numPoints = myPolygon.size();

        for (int i = 0; i < numPoints; i++) {
            Point2D.Double currentPoint = myPolygon.get(i);
            Point2D.Double nextPoint = myPolygon.get((i + 1) % numPoints); // Wrap around to the first point
            area += (currentPoint.getX() * nextPoint.getY()) - (nextPoint.getX() * currentPoint.getY());
        }

        return Math.abs(area) / 2.0;
    }

    // Draw the polygon using DrawingTool
    public void draw() {
        try {
            DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
            int numPoints = myPolygon.size();

            if (numPoints > 0) {
                Point2D.Double firstPoint = myPolygon.get(0);
                pen.move(firstPoint.getX(), firstPoint.getY());

                for (int i = 1; i < numPoints; i++) {
                    Point2D.Double currentPoint = myPolygon.get(i);
                    pen.move(currentPoint.getX(), currentPoint.getY());
                }

                // Close the polygon by returning to the first point
                pen.move(firstPoint.getX(), firstPoint.getY());
            }
        } catch (java.awt.HeadlessException e) {
            System.out.println("Exception: No graphics support available.");
        }
    }
}
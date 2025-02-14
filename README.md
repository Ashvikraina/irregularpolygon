# Irregular Polygon Lab

Polygons are closed two-dimensional shapes bounded by line segments. The segments meet in pairs at corners called vertices. A polygon is irregular if not all its sides are equal in length. The figure below shows examples of irregular polygons.
(From: https://brilliant.org/wiki/irregular-polygons/)

## Representing Points
The class Point2D.Double can be used to represent an x,y point, where each x or y value is a Double. For example, Point2D.Double(2.5, 3.1) constructs and initializes a point at coordinates (2.5, 3.1). Hint: reference Java documentation to learn more about this class. 

## Area of a Polygon
Use the Shoelace formula to calculate the area of a polygon. The area is one half of the sum of the products of each x coordinate with the y coordinate shifted by one index. 

## Assignment
 - Implement a class IrregularPolygon that contains an array list of Point2D.Double objects. Start with the template provided in the resources below.
 - Complete the draw() method, which uses DrawingTool to draw a polygon.
 - Complete the perimeter() method which should compute the perimeter of the polygon.
 - Complete the area() method which should compute the area of the polygon.
 - Ensure the test suite passes all tests.

## Resources
Template: https://github.com/mengjiaocyr/irregular-polygon-template
Shoelace formula: https://en.wikipedia.org/wiki/Shoelace_formula
Point2D docs: https://docs.oracle.com/javase/8/docs/api/java/awt/geom/Point2D.html
DrawingTool docs: https://pavao.org/compsci/gpdraw/html/gpdraw/DrawingTool.html

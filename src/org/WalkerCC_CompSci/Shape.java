package org.WalkerCC_CompSci;

public abstract class Shape {

    protected Point[] listOfPoints;

    public double GetSideLength(int sideLengthNumber){
        if(sideLengthNumber >= listOfPoints.length - 1){
            return CalculateSideLength(listOfPoints[listOfPoints.length - 1], listOfPoints[0]);
        }
        else if(sideLengthNumber < 0){
            return CalculateSideLength(listOfPoints[0], listOfPoints[1]);
        }
        else{
            return CalculateSideLength(listOfPoints[sideLengthNumber], listOfPoints[sideLengthNumber + 1]);
        }
    }

    private double CalculateSideLength(Point point0, Point point1){
        //Does the GetSideLength math work stuff
        //distance
        //sqrt( (x1 - x2)^2 + (y1 - y2)^2 )
        double x0 = point0.getX();
        double y0 = point0.getY();
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x = x1 - x0;
        double y = y1 - y0;
        double distance;
        distance = Math.pow(x, 2) + Math.pow(y, 2);
        return Math.sqrt(distance);
    }

    public double GetPerimeter(){
        //Does the Perimeter Math Work Stuff
        double perimeter = 0;
        for (int i =  0; i < listOfPoints.length; i = i + 1){
            perimeter += GetSideLength(i);
        }
        return perimeter;
    }
}

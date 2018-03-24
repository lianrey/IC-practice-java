package com.liana.examples;

/**
 * Created by liana on 3/24/18.
 */
public class Question6 {
    public static RangeOverlap FindRangeOverlap(int point1, int length1, int point2, int length2)
    {
        int highestStartPoint = Math.max(point1, point2);
        int lowestEndPoint = Math.min(point1 + length1, point2 + length2);

        if (highestStartPoint >= lowestEndPoint)
        {
            return new RangeOverlap(0, 0);
        }

        int overlapLength = lowestEndPoint - highestStartPoint;

        return new RangeOverlap(highestStartPoint, overlapLength);
    }

    public static Rectangle FindRectangularOverlap(Rectangle rect1, Rectangle rect2)
    {
        RangeOverlap xOverlap = FindRangeOverlap(rect1.LeftX, rect1.Width, rect2.LeftX, rect2.Width);
        RangeOverlap yOverlap = FindRangeOverlap(rect1.BottomY, rect1.Height, rect2.BottomY, rect2.Height);

        // Return null rectangle if there is no overlap
        if (xOverlap.Length == 0 || yOverlap.Length == 0)
        {
            return new Rectangle();
        }

        return new Rectangle(
                xOverlap.StartPoint,
                yOverlap.StartPoint,
                xOverlap.Length,
                yOverlap.Length
        );
    }
}

import java.awt.Point;

class Rectangle
{
    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;

    private Point upperLeft;
    private Point lowerRight;

    Rectangle(Point uL)
    {
        upperLeft = uL;
        lowerRight = new Point((int)(upperLeft.getX() + WIDTH), (int)(upperLeft.getY() + HEIGHT));
    }

    Rectangle(Point uL, Point lR)
    {
        upperLeft = uL;
        lowerRight = lR;
    }

    void translate(int x, int y)
    {
        upperLeft.translate(x, y);
        lowerRight.translate(x, y);
    }

    public String toString()
    {
        return "UL : " + upperLeft + ", LR : " + lowerRight;
    }
}
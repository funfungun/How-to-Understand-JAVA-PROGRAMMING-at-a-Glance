import java.awt.Point;

class Block2
{
    private Rectangle[] rectangles = new Rectangle[4];

    Block2(Point p)
    {
        Point p0 = new Point(p);
        Point p1 = new Point(p.x, p.y + Rectangle.HEIGHT);
        Point p2 = new Point(p.x, p.y + 2 * Rectangle.HEIGHT);
        Point p3 = new Point(p.x, p.y + 3 * Rectangle.HEIGHT);

        rectangles[0] = new Rectangle(p0);
        rectangles[1] = new Rectangle(p1);
        rectangles[2] = new Rectangle(p2);
        rectangles[3] = new Rectangle(p3);
    }

    Block2(int x, int y)
    {
        Point p0 = new Point(x, y);
        Point p1 = new Point(x, y + Rectangle.HEIGHT);
        Point p2 = new Point(x, y + 2 * Rectangle.HEIGHT);
        Point p3 = new Point(x, y + 3 * Rectangle.HEIGHT);

        rectangles[0] = new Rectangle(p0);
        rectangles[1] = new Rectangle(p1);
        rectangles[2] = new Rectangle(p2);
        rectangles[3] = new Rectangle(p3);
    }

    void translate(int x, int y)
    {
        for(int i = 0; i < 4; i++)
        {
            rectangles[i].translate(x, y);
        }
    }

    public String toString()
    {
        return String.format("%s\n%s\n%s\n%s", rectangles[0], rectangles[1], rectangles[2], rectangles[3]);
    }
}
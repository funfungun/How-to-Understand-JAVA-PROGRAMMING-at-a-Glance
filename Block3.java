import java.awt.Point;

class Block3
{
    private Rectangle[] rectangles = new Rectangle[4];

    Block3(Point p)
    {
        Point p0 = new Point(p);
        Point p1 = new Point(p.x, p.y + Rectangle.HEIGHT);
        Point p2 = new Point(p.x + Rectangle.WIDTH, p.y + Rectangle.HEIGHT);
        Point p3 = new Point(p.x + 2 * Rectangle.WIDTH, p.y + Rectangle.HEIGHT);

        rectangles[0] = new Rectangle(p0);
        rectangles[1] = new Rectangle(p1);
        rectangles[2] = new Rectangle(p2);
        rectangles[3] = new Rectangle(p3);
    }

    Block3(int x, int y)
    {
        Point p0 = new Point(x, y);
        Point p1 = new Point(x, y + Rectangle.HEIGHT);
        Point p2 = new Point(x + Rectangle.WIDTH, y + Rectangle.HEIGHT);
        Point p3 = new Point(x + 2 * Rectangle.WIDTH, y + Rectangle.HEIGHT);

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
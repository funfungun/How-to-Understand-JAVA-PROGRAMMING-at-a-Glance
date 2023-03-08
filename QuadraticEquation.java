import java.util.Scanner;
public class QuadraticEquation
{
    public static void main(String[] args)
    {
        int a;
        int b;
        int c;
        double det;
        double x1;
        double x2;

        Scanner sc = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0의 해 구하기(단, b^2 – 4*a*c >= 0)");

        System.out.print("a: ");
        a = sc.nextInt();

        System.out.print("b: " );
        b = sc.nextInt();

        System.out.print("c: " );
        c = sc.nextInt();

        det = b*b - (4*a*c);
        x1 = (b*(-1) + Math.sqrt(det)) / (2*a);
        x2 = (b*(-1) - Math.sqrt(det)) / (2*a);

        System.out.println("result1 :" + x1);
        System.out.println("result2 : " + x2);
    }
}

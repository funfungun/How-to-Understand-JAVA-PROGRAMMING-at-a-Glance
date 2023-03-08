import java.util.Scanner;
public class VolumeOfTruncatedCone
{
    public static void main(String[] args)
    {
        double pi = 3.14;
        double R1;
        double R2;
        double Height;
        double V;

        Scanner sc = new Scanner(System.in);

        System.out.println("R1 : ");
        R1 = sc.nextDouble();

        System.out.println("R2 : ");
        R2 = sc.nextDouble();

        System.out.println("Height : ");
        Height = sc.nextDouble();

        V = (pi * ((R1*R1) + R1 * R2 + (R2*R2)) * Height / 3);

        System.out.printf("result : %f", V);
    }
}

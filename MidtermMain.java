/**** editer :          ****
 **** 201910774         ****
 **** Kim Geon          ****/

class MidtermMain
{
    public static void main(String[] args)
    {
        int num3;
        int sum = 0;

        System.out.printf("case 1 : fine : %d\n", Violation.OVER2040.getAUTO());
        System.out.printf("case 2 : fine : %d\n", Violation.LIGHT.getVAN() + Violation.YELLOW.getVAN());
        System.out.printf("case 3 : fine : %d\n", Violation.BUSONLYHIGHWAY.getCAR() + Violation.OVER60.getCAR());

        CalculateFine C = new CalculateFine();

        for(int i = 0; i<=9; i++)
        {
            num3 = C.CalculateFineTest();
            System.out.printf("car : %s, violation : %s, fine : %d\n", C.getCarName(), C.getViolationName(), num3);
            sum += num3;
        }

        System.out.printf("Total fine : %d", sum);
    }
}

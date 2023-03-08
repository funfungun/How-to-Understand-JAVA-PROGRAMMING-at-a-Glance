import java.util.Scanner;

class Dice
{
    int num = 0;

    void roll()
    {
        num = (int) Math.floor(Math.random() * 6) + 1; //1~6사이 숫자 구하는 코드
    }

    int Check_roll()
    {
        return num;
    }
}


class DiceTest
{
    public static void main(String[] args)
    {
        int sum = 0;

        System.out.println("횟수: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Dice D = new Dice();

        for (int i = 0; i < n; i++)
        {
            D.roll();
            sum += D.Check_roll();
        }

        System.out.println("합계: " + sum);

        if (sum % 2 == 0) {
            System.out.println("짝수가 나왔으므로 버스를 탑니다.");
        }
        else {
            System.out.println("홀수가 나왔으므로 지하철을 탑니다.");
        }
    }
}

import java.util.Scanner;

public class Hash
{
    public static void main(String[] args)
    {
        char[] s = new char[5];
        int n = s.length;
        double result;

        Scanner sc = new Scanner(System.in);

        System.out.println("문자 다섯 개를 한 줄에 한 개씩 입력하십시오 : ");
        for (int i=0; i<=4; i++) {
            s[i] = sc.next().charAt(0);
        }

        result = s[0] * Math.pow(31, n-1) + s[1] * Math.pow(31, n-2) + s[2] * Math.pow(31, n-3) + s[3] * Math.pow(31, n-4) + s[4] * Math.pow(31, n-5);

        System.out.printf("문자열 %s%s%s%s%s의 해시 값은 %.2f 입니다.",s[0], s[1], s[2], s[3], s[4] , result);

    }
}

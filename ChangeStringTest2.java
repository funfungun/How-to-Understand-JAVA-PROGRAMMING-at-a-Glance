import java.util.Scanner;

class ChangeString2
{
    void change()
    {
        StringBuffer sb = new StringBuffer("Let's meet in my office at 10");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        System.out.println("새로운 문자열을 입력하세요:");
        String s2 = sc.nextLine();

        String newStr = sb.toString().replaceAll(s1, s2);

        System.out.printf("새로운 문장: %s", newStr);
    }
}

public class ChangeStringTest2
{
    public static void main(String[] args)
    {
        System.out.println("다음 문장에서 문자열을 바꾸는 프로그램입니다.\n원본 문장: Let's meet in my office at 10\n문장에서 바꾸고 싶은 문자열을 입력하세요:");
        ChangeString2 c1 = new ChangeString2();
        c1.change();
    }
}
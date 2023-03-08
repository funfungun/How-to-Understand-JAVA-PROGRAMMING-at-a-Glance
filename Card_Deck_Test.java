
class Card_Deck
{
    int[] Deck = new int[3]; //덱 생성
    int remain_Card = 3; //남은 카드 (초기값 : 3)

    public int remain_Card_Check() //남은 카드 수
    {
        return remain_Card;
    }

    public void minus_Card() // 카드 줄어듬
    {
        --remain_Card;
    }

    public void Made_Card() // 랜덤 카드 생성
    {
        Deck[0] = (int) Math.floor(Math.random() * 9) + 2;
        Deck[1] = (int) Math.floor(Math.random() * 9) + 2;
        Deck[2] = (int) Math.floor(Math.random() * 9) + 2;
    }

    void deal1() //카드 배부1
    {
        System.out.printf("Shape : Diamonds, Number : %d \n", Deck[0]);
    }

    void deal2() //카드 배부2
    {
        System.out.printf("Shape : Diamonds, Number : %d \n", Deck[1]);
    }
    /*
    void deal3() //카드 배부3
    {
        System.out.printf("Shape : Diamonds, Number : %d \n", Deck[2]);
    }
    */
}


class Card_Deck_Test
{
    public static void main(String[] args)
    {
        Card_Deck D = new Card_Deck();
        D.Made_Card();

        System.out.printf("남은 카드 수 : %d \n", D.remain_Card_Check());
        D.deal1();
        D.minus_Card();

        System.out.printf("남은 카드 수 : %d \n", D.remain_Card_Check());
        D.deal2();
        D.minus_Card();

        System.out.printf("남은 카드 수 : %d \n", D.remain_Card_Check());
    }
}

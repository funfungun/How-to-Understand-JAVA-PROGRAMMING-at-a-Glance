import java.util.Scanner;

enum Card
{
    CJONE_SAMSUNG(30, 1), CJONE_SHINHAN(30, 1), THE_CJ(20, 2), SAMSUNG_6_V4(20, 0), SHINHAN_LADY(20, 0), KB_STAR(20, 0), EMART_KB(15, 0);

    int Discount_rate;
    int Saving_rate;

    Card(int Discount_rate, int Saving_rate)
    {
        this.Discount_rate = Discount_rate;
        this.Saving_rate = Saving_rate;
    }

    int getDiscount_rate()
    {
        return Discount_rate;
    }

    int getSaving_rate()
    {
        return Saving_rate;
    }
}

class VIPS
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Card :\n-CJONE_SAMSUNG\n-CJONE_SHINHAN\n-THE_CJ\n-SAMSUNG_6_V4\n-SHINHAN_LADY\n-KB_STAR\n-EMART_KB\n");

        String CardString = sc.next();
        Card card = Card.valueOf(CardString);

        switch(card)
        {
            case CJONE_SAMSUNG:
            case CJONE_SHINHAN:
            case THE_CJ:
            case SAMSUNG_6_V4:
            case SHINHAN_LADY:
            case KB_STAR:
            case EMART_KB:
                System.out.printf("Discount_rate : %d \nSaving_rate: %d\n", card.getDiscount_rate(), card.getSaving_rate());
                break;

            default:
                System.out.println("[WARNING] Wrong Input!\n");
                break;
        }
    }
}

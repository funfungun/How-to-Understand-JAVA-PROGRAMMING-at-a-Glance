/**** editer :          ****
 **** 201910774         ****
 **** Kim Geon          ****/

enum Violation
{
    LIGHT/*(8, 7, 5)*/(9, 8, 4), PEDESTRIAN(8, 7, 5), YELLOW(10, 9, 0), BUSONLYHIGHWAY(10, 9, 0), LANE(4, 4, 3), OVER60(14, 13, 9), OVER4060(11, 10, 7), OVER2040/*(8, 7, 5)*/(12, 11, 8), OVER20(4, 4, 3);

    int VAN;
    int CAR;
    int AUTO;

    Violation(int VAN, int CAR, int AUTO)
    {
        this.VAN = VAN;
        this.CAR = CAR;
        this.AUTO = AUTO;
    }

    int getVAN()
    {
        return VAN;
    }

    int getCAR()
    {
        return CAR;
    }

    int getAUTO()
    {
        return AUTO;
    }
}
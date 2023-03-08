/**** editer :          ****
 **** 201910774         ****
 **** Kim Geon          ****/
 
 class CalculateFine
{
    int num1;
    int num2;

    int CalculateFineTest()
    {
        num1 = (int) Math.floor(Math.random() * 9) + 1;
        num2 = (int) Math.floor(Math.random() * 3) + 1;

        if(num1 == 1 && num2 == 1)
        {
            return Violation.LIGHT.getVAN();
        }

        else if(num1 == 1 && num2 == 2)
        {
            return Violation.LIGHT.getCAR();
        }

        else if(num1 == 1 && num2 == 3)
        {
            return Violation.LIGHT.getAUTO();
        }

        else if(num1 == 2 && num2 == 1)
        {
            return Violation.PEDESTRIAN.getVAN();
        }

        else if(num1 == 2 && num2 == 2)
        {
            return Violation.PEDESTRIAN.getCAR();
        }

        else if(num1 == 2 && num2 == 3)
        {
            return Violation.PEDESTRIAN.getAUTO();
        }

        else if(num1 == 3 && num2 == 1)
        {
            return Violation.YELLOW.getVAN();
        }

        else if(num1 == 3 && num2 == 2)
        {
            return Violation.YELLOW.getCAR();
        }

        else if(num1 == 3 && num2 == 3)
        {
            return Violation.YELLOW.getAUTO();
        }

        else if(num1 == 4 && num2 == 1)
        {
            return Violation.BUSONLYHIGHWAY.getVAN();
        }

        else if(num1 == 4 && num2 == 2)
        {
            return Violation.BUSONLYHIGHWAY.getCAR();
        }

        else if(num1 == 4 && num2 == 3)
        {
            return Violation.BUSONLYHIGHWAY.getAUTO();
        }

        else if(num1 == 5 && num2 == 1)
        {
            return Violation.LANE.getVAN();
        }

        else if(num1 == 5 && num2 == 2)
        {
            return Violation.LANE.getCAR();
        }

        else if(num1 == 5 && num2 == 3)
        {
            return Violation.LANE.getAUTO();
        }

        else if(num1 == 6 && num2 == 1)
        {
            return Violation.OVER60.getVAN();
        }

        else if(num1 == 6 && num2 == 2)
        {
            return Violation.OVER60.getCAR();
        }

        else if(num1 == 6 && num2 == 3)
        {
            return Violation.OVER60.getAUTO();
        }

        else if(num1 == 7 && num2 == 1)
        {
            return Violation.OVER4060.getVAN();
        }

        else if(num1 == 7 && num2 == 2)
        {
            return Violation.OVER4060.getCAR();
        }

        else if(num1 == 7 && num2 == 3)
        {
            return Violation.OVER4060.getAUTO();
        }

        else if(num1 == 8 && num2 == 1)
        {
            return Violation.OVER2040.getVAN();
        }

        else if(num1 == 8 && num2 == 2)
        {
            return Violation.OVER2040.getCAR();
        }

        else if(num1 == 8 && num2 == 3)
        {
            return Violation.OVER2040.getAUTO();
        }

        else if(num1 == 9 && num2 == 1)
        {
            return Violation.OVER20.getVAN();
        }

        else if(num1 == 9 && num2 == 2)
        {
            return Violation.OVER20.getCAR();
        }

        else
        {
            return Violation.OVER20.getAUTO();
        }
    }

    String getCarName()
    {
        if(num2 == 1)
        {
             return "VAN";
        }

        else if(num2 == 2)
        {
            return "CAR";
        }

        else
        {
            return "AUTO";
        }
    }

    String getViolationName()
    {
        if(num1 == 1)
        {
            return "LIGHT";
        }

        else if(num1 == 2)
        {
            return "PEDESTRIAN";
        }

        else if(num1 == 3)
        {
            return "YELLOW";
        }

        else if(num1 == 4)
        {
            return "BUSONLYHIGHWAY";
        }

        else if(num1 == 5)
        {
            return "LANE";
        }

        else if(num1 == 6)
        {
            return "OVER60";
        }

        else if(num1 == 7)
        {
            return "OVER4060";
        }

        else if(num1 == 8)
        {
            return "OVER2040";
        }

        else
        {
            return "OVER20";
        }
    }
}
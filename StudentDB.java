class StudentDB
{
    Student[] student = {};

    int index;
    Student inf;

    enum FindGPAParam
    {
        LOWER_THAN, HIGHER_THAN;
    }

    StudentDB()
    {
        this.student = new Student[3];
    }

    void add(Student student)
    {
        this.student[index++] = student;
    }

    void add(String name, int number, double gpa)
    {
        this.student[index++] = new Student(name, number, gpa);
    }


    Student findBy(String name)
    {
        for(int i = 0; i < 3; i++)
        {
            if(name == student[i].getName())
            {
                inf = student[i];
                break;
            }
        }
        return inf;
    }

    Student findBy(int number)
    {
        for(int i = 0; i < 3; i++)
        {
            if(number == student[i].getNumber())
            {
                inf = student[i];
                break;
            }
        }
        return inf;
    }

    Student findBy(double gpa)
    {
        for(int i = 0; i < 3; i++)
        {
            if(gpa == student[i].getGPA())
            {
                inf = student[i];
                break;
            }
        }
        return inf;
    }

    Student findBy(FindGPAParam param, double gpa)
    {
        if(param == FindGPAParam.LOWER_THAN)
        {
            for(int i = 0; i < 3; i++)
            {
                if(gpa > student[i].getGPA())
                {
                    inf = student[i];
                    break;
                }
            }
        }

        else
        {
            for(int i = 0; i < 3; i++)
            {
                if(gpa < student[i].getGPA())
                {
                    inf = student[i];
                    break;
                }
            }
        }

        return inf;
    }
}
class Student
{
    String Name;
    int Number;
    double GPA;

    Student(String Name, int Number, double GPA)
    {
        this.Name = Name;
        this.Number = Number;
        this.GPA = GPA;
    }

    String getName()
    {
        return Name;
    }

    int getNumber()
    {
        return Number;
    }

    double getGPA()
    {
        return GPA;
    }

    public String toString()
    {
        return "Name : " + Name + ", Number : " + Number + ", GPA :" + GPA;
    }
}
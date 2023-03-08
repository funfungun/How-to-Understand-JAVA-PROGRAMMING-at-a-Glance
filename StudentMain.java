class StudentMain
{
    public static void main(String[] args)
    {
        StudentDB SDB = new StudentDB();

        Student S = new Student("Kim Ji-woo",2019111111,4.01);
        SDB.add(S);

        SDB.add("Lee Min Joon",201922222,3.85);
        SDB.add("Park Seo Yoon",201933333,3.90);

        System.out.println(SDB.findBy("Kim Ji-woo"));
        System.out.println(SDB.findBy(201922222));
        System.out.println(SDB.findBy(3.90));
        System.out.println(SDB.findBy(StudentDB.FindGPAParam.LOWER_THAN, 3.95));
        System.out.println(SDB.findBy(StudentDB.FindGPAParam.HIGHER_THAN, 3.95));
    }
}
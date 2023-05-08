class Student
{
    int rollNo;
    int sem;

    public Student(int rollNo,int sem)
    {
        this.rollNo=rollNo;
        this.sem=sem;
    }

    void printDetails()
    {
        System.out.println("Roll No: "+rollNo);
        System.out.println("Sem: "+sem);
    }
}
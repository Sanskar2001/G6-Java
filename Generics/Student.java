class Student implements Comparable<Student> {

    String name;
    int marks;
    int rollNo;

    public Student(String name,int marks,int rollNo)
    {
        this.name=name;
        this.marks=marks;
        this.rollNo=rollNo;
    }

    @Override
    public int compareTo(Student o) {
    

        return -(this.marks-o.marks);
    }

}

import java.util.Arrays;
import java.util.Comparator;


class MyComparator implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        
        if(o1.marks==o2.marks)
        return -(o1.rollNo-o2.rollNo);

        return -(o1.marks-o2.marks);
    }
    
}



class Demo {
    

    public static void main(String[] args) {
    

        int[] arr=new int[3];
        arr[0]=101;
        arr[1]=50;
        arr[2]=500;
        Arrays.sort(arr);

        for(int ele:arr)
        System.out.println(ele);


        Student[] stArr=new Student[4];
        stArr[0]=new Student("Yogesh", 39, 10);
        stArr[1]=new Student("Akshay", 38, 11);
        stArr[2]=new Student("Yaadwinder", 37, 12);
        stArr[3]=new Student("Aditi", 39, 5);



    //    Arrays.sort(stArr);

        MyComparator myComparator=new MyComparator();
          Arrays.sort(stArr,myComparator);

       for(Student st:stArr)
       System.out.println(st.name+" "+st.rollNo+" "+st.marks);



    //    stArr[0].compareTo(stArr[1]);
    }
}

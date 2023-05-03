import java.util.Scanner;
// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
class Car
{
    int noOfWheels;
    int hp;
    public Car(int noOfWheels,int hp)
    {
        this.noOfWheels=noOfWheels;
        this.hp=hp;
    }

    public String toString()
    {
        return "no of wheels= "+noOfWheels+"\n HP= "+hp;
    }
}

class stringDemo
{
    public static void main(String[] args) {
        

        String str="Hello";

        // String str2="G6";

        // str=str+str2;
        String str2="Hello";

        String str3=new String("Hello");
        System.out.println(str==str3);

        System.out.println(str2.equals(str3));



        // String myStr;
        // Scanner sc=new Scanner(System.in);

        // myStr=sc.nextLine();
        // System.out.println("You have entered: "+myStr);
        // String str=str2+str3

        // String str2=new String("Hi");

        Car car=new Car(4, 700);

        System.out.println(car);

        String str4="world";

        System.out.println(str4.toUpperCase());
        System.out.println(str4);
        
        


    }
}
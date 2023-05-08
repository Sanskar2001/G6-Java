class TerrestialAnimal
{
    void move()
    {
        System.out.println( "Moving on land");
    }
}

class AquaticAnimal
{
    void move()
    {
        System.out.println("Swimming in Water");
    }
}



/* This is not allowed in Java, lead to diamond problem
class Turtle extends TerrestialAnimal,AquaticAnimal
{

}
*/


interface ITerrestialAnimal
{
    void move();
}
interface IAquaticAnimal
{
    void move();
}

class Turtle implements ITerrestialAnimal,IAquaticAnimal
{
    public void move()
    {
        System.out.println("Turtle can move on land and swim in water");
    }
}

public class MultipleInheritance {
public static void main(String[] args) {
    
    Turtle turtle=new Turtle();

    turtle.move();
}

    
}

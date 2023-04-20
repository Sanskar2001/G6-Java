public class incredibleHulk {

    static int minSteps(int no)
    {
        int steps=0;

        while(no!=0)
        {
                if((no&1)==1)
                steps++;
                no=no>>1;
            
        }
        return steps;
    }


    public static void main(String[] args) {
        int n=5;

        System.out.println("Min jumps="+ minSteps(n));

    }
    
}

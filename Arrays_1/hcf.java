import java.util.Scanner;

class hcf {
    
    public static void main(String[] args) {
        int a=12,b=16;

        // Scanner sc=new Scanner(System.in);

        // int no=sc.nextInt();
        
        int minNo= (a<b) ? a : b;
        int hcf=1;
        for(int i=1;i<=minNo;i++)
        {
                if(a%i==0 && b%i==0)
                hcf=i;
        }

        System.out.println(hcf);
    }
}

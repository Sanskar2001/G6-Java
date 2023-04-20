public class magicNo {
   
    static int getMagicNo(int n)
    {
        int ans=0;
        int factor=5;

        while (n!=0) {
            
            if((n&1)==1)
            ans+=factor;

            factor=factor*5;
            n=n>>1;
        }

        return ans;
    }


    public static void main(String[] args) {
        int n=2;
        System.out.println(n+"th magic no="+getMagicNo(n));
    }
}

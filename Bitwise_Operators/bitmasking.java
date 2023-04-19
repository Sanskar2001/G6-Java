class bitmasking {

    static int getIthBit(int n,int i)
    {
        n=n>>(i-1);

        return (n&1);
    }
    static int cntBits(int n)
    {
        int cnt=0;

        while (n!=0) {
            n=n>>1;
            cnt++;
        }

        return cnt;
    }

   static void printInBinary(int n)
    {
        int totalBits=cntBits(n);

        for(int i=totalBits;i>=1;i--)
        System.out.print(getIthBit(n, i));
    }
    public static void main(String[] args) {
        

        int n=12;
        // 1100

        // System.out.println(getIthBit(n, 2));

        // System.out.println(cntBits(n));


        // for(int i=4;i>=1;i--)
        // {
        //     System.out.print(getIthBit(n, i));
        // }

        // 15-> 1111

        printInBinary(3);


    }
    
}

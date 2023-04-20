class singleNo2
{

    static int getIthBit(int no,int i)
    {
            no=no>>i;
            return no&1;
    }

    static int setIthBit(int no,int i)
    {
        int mask=1<<i;
        return no|mask;
    }

    static int findUnique(int[] arr)
    {
        int ans=0;

        for(int i=0;i<32;i++)
        {
            int cnt=0;
            for(int no:arr)
            {
                if(getIthBit(no, i)==1)
                cnt++;
            }

            if(cnt%3!=0)
            ans=setIthBit(ans, i);

        }
        return ans;
    }


    public static void main(String[] args) {
        int []arr={1,1,2,2,1,2,3};

        System.out.println("Unique no="+findUnique(arr));
    
    }
}
class CBNos
{



    static int cntCBNos(String str)
    {
        int n=str.length();
        int cnt=0;

        int [] visited=new int[n];

        for(int st=n-1;st>=0;st--)
        {
            for(int en=st+1;en<=n;en++)
            {
              String currString=str.substring(st, en);

              Long currNo=Long.valueOf(currString);
        
              if(isCBNos(currNo) && isValid(st, en, visited))
              {
                cnt++;
                for(int i=st;i<en;i++)
                {
                    visited[i]=1;
                }
              }

            }
        }
        
        return cnt;
    }

    static boolean isCBNos(Long no)
    {
        if(no==0 || no==1)
        return false;

        int [] cbNos={2,3,5,7,11,13,17,19,23,29};

        for(int ele:cbNos)
        {
            if(no==ele)
            return true;

            if(no%ele==0)
            return false;
        }

        return true;
    }

    static boolean isValid(int st,int en,int[]visited)
    {
        for(int i=st;i<en;i++)
        {
            if(visited[i]==1)
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String str="81615";

       System.out.println( cntCBNos(str));
    }
}
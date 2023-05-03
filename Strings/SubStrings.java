class SubStrings {
    

    static void printAllSubstring(String str)
    {
        for(int st=0;st<str.length();st++)
        {
            for(int en=st+1;en<=str.length();en++)
            {
                System.out.println(str.substring(st, en));
            }
        }
    }

    static void printAllSubstringReverse(String str)
    {
        int n=str.length();
        for(int st=n-1;st>=0;st--)
        {
            for(int en=st+1;en<=str.length();en++)
            {
                System.out.println(str.substring(st, en));
            }
        }
    }


    public static void main(String[] args) {
        
        String str="abc";
        // printAllSubstring(str);
        printAllSubstringReverse(str);
    }
}

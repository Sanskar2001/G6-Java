 class reverseWords {

    static String reverse(String str)
    {
        String ans="";

        for(int i=str.length()-1;i>=0;i--)
        ans+=str.charAt(i);

        return ans;
    }


    static String reverseWords(String str)
    {

        int n=str.length();

        int i=n-1;
        String ans="";

        while (i>=0) {
         
            
            while (i>=0 && str.charAt(i)==' ') 
            {
                i--;
            }

            String word="";
            while(i>=0 && str.charAt(i)!=' ')
            {
                word+=str.charAt(i);
                i--;
            }
            
            if(word.isEmpty())
            ans+=reverse(word)+" ";

            // 
        }
        return ans.substring(0, ans.length()-1);
    }


    public static void main(String[] args) {
    
        String str="a good    example   ";

        System.out.println(reverseWords(str));
    }


}

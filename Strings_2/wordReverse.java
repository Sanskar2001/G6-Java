public class wordReverse {
    
    static String reverseWord(String str)
    {
        String ans="";
        for(int i=str.length()-1;i>=0;i--)
        {
            ans+=str.charAt(i);
        }
        return ans;
    }


   static String reverse(String str)
    {
        int n=str.length();
        int i=n-1;
        StringBuilder ans=new StringBuilder("");


        while (i>=0) {

            while (i>=0 && str.charAt(i)==' ') {
                i--;
            }

            StringBuilder word=new StringBuilder("");

            while(i>=0 && str.charAt(i)!=' ')
            {
                word.append(str.charAt(i));
                i--;
            }

            ans.append(word.reverse());
            
            if(!word.isEmpty())
            ans.append(" ");
            
        }

        return ans.substring(0, ans.length()-1);
    }


    public static void main(String[] args) {
        
        String str="   Hello   World   ";
        System.out.println(reverse(str));
    }
}

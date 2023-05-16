 import java.util.Stack;;
 class BalancedParenthesis {
    

    static boolean isBalanced(String str)
    {

        Stack<Character>st=new Stack<Character>();
        int n=str.length();

        for(int i=0;i<n;i++)
        {

            if(str.charAt(i)=='(')
            st.push('(');

            else if(st.empty() && str.charAt(i)==')')
            {
                return false;
            }

            else if(str.charAt(i)==')')
            {
                st.pop();
            }
        }

        return st.empty();


    }

    public static void main(String[] args) {
        String str="(()()";

        if(isBalanced(str))
        System.out.println("given expression is balanced");

        else
        System.out.println("given expression is unbalanced");
    }
}

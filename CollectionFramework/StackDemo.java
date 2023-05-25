import java.util.Stack;

class StackDemo {
    
    public static void main(String[] args) {
        
        Stack<Integer>st=new Stack<Integer>();

        st.push(10);
        st.push(20);
        st.pop();

        System.out.println(st.peek());
        
    }
    
}

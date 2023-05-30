



import java.util.Stack;
class MinStack {

    Stack<Integer>st;
    Stack<Integer>minSt;

    public MinStack()
    {
        st=new Stack<Integer>();
        minSt=new Stack<Integer>();
    }


    void push(int ele)
    {
        st.push(ele);

        if(minSt.empty())
        {
            minSt.push(ele);
        }
        else if(ele<minSt.peek())
        minSt.push(ele);
        else
        minSt.push(minSt.peek());
    }

    int pop()
    {
        if(st.empty())
        {
            System.out.println("Stack Empty!!");
            return -1;
        }

        minSt.pop();
        return st.pop();
    }

    int getMin()
    {
        if(st.empty())
        {
            System.out.println("Stack Empty!!");
            return -1;   
        }

        return minSt.peek();
    }
}

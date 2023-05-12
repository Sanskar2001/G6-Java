class StackClient {
    
    public static void main(String[] args) {
        
        // int x=12;

        Stack st=new Stack(4);
        try{
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        }
        catch(StackOverflowException e)
        {
            System.out.println(e);
        }

        // while (!st.isEmpty()) {
            
        //     try {
        //         System.out.println(st.peek());
        //     } catch (StackEmptyException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }

        //     try {
        //         st.pop();
        //     } catch (StackEmptyException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        // }
        // st.display();

        // Stack st2=new Stack(3);

        //     try{
        //     st2.push(1);
        //     st2.push(2);
        //     }
        //     catch(Exception e)
        //     {
        //         System.out.println(e);
        //     }

        // try {
        //     st2.display();
        // } catch (StackEmptyException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }



        Stack st3=new Stack(2);
        

        try {
            st3.push(1);
            st3.push(2);
            st3.push(3);
            
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
       

        DynamicStack dynamicStack=new DynamicStack(2);

        dynamicStack.push(1);
        dynamicStack.push(2);
        dynamicStack.push(3);
        dynamicStack.push(4);
        dynamicStack.push(5);

        try {
            dynamicStack.display();
        } catch (StackEmptyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }
}

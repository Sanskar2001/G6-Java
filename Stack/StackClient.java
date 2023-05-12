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

        Stack st2=new Stack(3);

            try{
            st2.push(1);
            st2.push(2);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        st2.display();
    }
}

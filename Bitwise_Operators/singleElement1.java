public class singleElement1 {
    
    static int uniqueNo(int[] arr)
    {
        int xor=0;

        for(int ele:arr)
        {
            xor=xor^ele;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr={1,2,1,2,4,3,3};
        System.out.println(uniqueNo(arr));
    }
}

class DynamicArrayDemo
{
    public static void main(String[] args) {
        

        // int[] arr=new int[3];

        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;
        // arr[3]=4;

        // for (int ele : arr) {
        //     System.out.print(ele+" ");
        // }

        DynamicArray dynamicArray=new DynamicArray(3);

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);

        dynamicArray.display();

    }
}
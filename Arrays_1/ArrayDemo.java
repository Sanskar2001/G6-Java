class ArrayDemo {

    public static void main(String[] args) {
        

        //initialistation

        int arr[]={1,2,3,4};
        int [] arr2={24,56,78};

        int arr3[]=new int[10];


        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }


        System.out.println("");



        for (int i : arr) {
            System.out.print(i);
        }

        System.out.println("");

        for (int i : arr3) {
            System.out.print(i);
        }
    }
    
}

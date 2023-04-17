 class binarySearch2DMatrix1 {
    

    static boolean search(int [][] arr,int target)
    {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {

                if(target==arr[i][j])
                return true;

            }
        }


        return false;
    }

    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};

        int target=5;

        boolean ans=search(arr, target);

        if(ans)
        System.out.println("Element found");
        else 
        System.out.println("Not found");
    }
}

class rowWiseSum {
    

    static void colSum(int[][] arr)
    {
        for(int col=0;col<arr[0].length;col++)
        {
            int sum=0;
            for(int row=0;row<arr.length;row++)
            sum+=arr[row][col];

            System.out.println(sum);

        }


    }
    public static void main(String[] args) {
        
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};


        // rowWise Sum
        for(int i=0;i<arr.length;i++)
        {

            int sum=0;
            for(int j=0;j<arr[0].length;j++)
            {
                sum+=arr[i][j];
            }
            System.out.println(sum);
        }
        System.out.println("");
        colSum(arr);

        1 2 3
        4 5 6
        7 8 9
        
    }
}

class transpose
{

   static void printMatrix(int [][] arr)
    {
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(arr[i][j]);

            System.out.println("");
        }
    }

    static void transposeMatrix(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int tmp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=tmp;
            }
        }
    }

    public static void main(String[] args) {
        /* 

            1 2 3
            4 5 6
            7 8 9

            1 4 7
            2 5 8
            3 6 9

            */


            int [][] arr={{1,2,3},{4,5,6},{7,8,9}};

            transposeMatrix(arr);
            printMatrix(arr);
    }
}
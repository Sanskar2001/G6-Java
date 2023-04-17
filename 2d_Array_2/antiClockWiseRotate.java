 class antiClockWiseRotate {
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

    static void reverseRow(int [][]arr)
    {
        /*
         * GO TO EACH ROW
         * REVERSE EVERY ROW  JUST LIKE AN ARRAY
         */
        

         for(int i=0;i<arr.length;i++)
         {
            int s=0,e=arr.length-1;
        
            while (s<=e) {

                // replace starting & ending element
                int tmp=arr[i][s];
                arr[i][s]=arr[i][e];
                arr[i][e]=tmp;

                s++;
                e--;
                
            }



         }

    }

    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};


        reverseRow(arr);
        transposeMatrix(arr);
        printMatrix(arr);


    }
}

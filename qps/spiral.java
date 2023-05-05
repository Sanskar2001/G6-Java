class spiral
{


    static void spiralPrint(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;

        int cnt=0;

        int stRow=0,stCol=0,enRow=n-1,enCol=m-1;

        while (stRow<=enRow && stCol<=enCol) {
            
            // 1. Print strow

            for(int i=stCol;i<=enCol;i++){
                System.out.print(arr[stRow][i]+" ");
                cnt++;

                if(cnt==m*n)
                return;
            }
        

            stRow++;

            // 2. Print encol

            for(int i=stRow;i<=enRow;i++)
            {
                System.out.print(arr[i][enCol]+" ");
                cnt++;
                if(cnt==m*n)
                return;
            }


            enCol--;

            // 3 Print enRow

            for(int i=enCol;i>=stCol;i--)
            {
                System.out.print(arr[enRow][i]+" ");
                cnt++;
                if(cnt==m*n)
                return;
                
            }
       
            enRow--;


            // 4 Print stcol
            for(int i=enRow;i>=stRow;i--)
            {
                System.out.print(arr[i][stCol]+" ");
                cnt++;
                if(cnt==m*n)
                return;
          
            }

            stCol++;


        }
    }
    public static void main(String[] args) {
        
        int[][] arr={{1,2,3,4},{5,6,7,8},{8,9,10,11}};

        /*
         *  1 2 3 
         *  4 5 6
         *  7 8 9 
         * 
         *  1 2 3 4
         *  5 6 7 8
         *  9 10 11 12
         * 
         */

        spiralPrint(arr);
    }
}
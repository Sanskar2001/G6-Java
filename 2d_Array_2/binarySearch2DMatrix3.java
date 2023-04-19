class binarySearch2DMatrix3 {


    static boolean search(int[][]arr,int target)
    {

        int n=arr.length;
        int m=arr[0].length;
        int strow=0,enrow=arr.length-1,midrow;

        while (strow<=enrow) {
            

            midrow=(strow+enrow)/2;

            if(target==arr[midrow][m-1])
            return true;



            if(target>arr[midrow][m-1])
            strow=midrow+1;

            else
            {
                int stcol=0,encol=m-1,midcol;
                while(stcol<=encol)
                {
                    midcol=(stcol+encol)/2;

                    if(target==arr[midrow][midcol])
                    return true;
                    else if( target>arr[midrow][midcol])
                    stcol=midcol+1;
                    else
                    encol=midcol-1;
                }
                enrow=midrow-1;

            } 
            
        }
        return false;

    }
    public static void main(String[] args) {
        int [][] arr={ {1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=16;

        boolean ans=search(arr, target);

        if(ans==true)
        System.out.println("Element found");
        else 
        System.out.println("Not found");
    }
    
}

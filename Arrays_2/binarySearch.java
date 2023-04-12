class binarySearch
{

    static int bSearch(int[] arr,int target)
    {
        int s=0,e=arr.length-1,mid;

        while (s<=e) {
            
            mid=(s+e)/2;


            if(target==arr[mid])
            return mid;

            else if( target>arr[mid])
            s=mid+1;

            else
            e=mid-1;
        }

       return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

        int target=3;

        int idx=bSearch(arr, target);

        System.out.println("Element found at "+idx);
    }
}
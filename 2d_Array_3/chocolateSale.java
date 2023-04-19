/**
 * chocalateSale
 */
import java.util.Arrays;
class chocolateSale {

    static int  minCost(int[]arr,int k)
    {
        Arrays.sort(arr,0,arr.length);
        int cost=0;
        int varities=0;
        for(int ele:arr)
        {
            cost+=ele;
            varities+=k;

            if(varities==arr.length)
            break;
        }

        return cost;
    }

    public static void main(String[] args) {
        int []arr={3,2,1,4};
        int n=4,k=2;

        System.out.println(minCost(arr, k));
    }
    
}
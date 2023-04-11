import java.util.Arrays;

class nextPermutation {


    static void nextPermutation(int[] arr)
    {


        int n=arr.length;

        int pos1=0,pos2=0;
        for(int i=n-2;i>=0;i--)
        {   
            if(arr[i]<arr[i+1])
            {
                pos1=i;
                break;
            }

        }


        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>arr[pos1])
            {
                pos2=i;
                break;
            }
        }

        int tmp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=tmp;

        Arrays.sort(arr,pos1+1,n);

    }

    public static void main(String[] args) {

        int arr[]={3,2,1};

        nextPermutation(arr);


        for(int ele:arr)
        System.out.print(ele+" ");


        
    }
    
}

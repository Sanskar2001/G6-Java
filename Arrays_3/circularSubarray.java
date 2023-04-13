class circularSubarray{

    public static void main(String[] args) {
        int []arr={1,2,3,4};
    
      printAllSubarrays(arr);
    }

    static void printAllSubarrays(int []arr)
    {
        int n=arr.length;

        for(int i=0;i<n;i++)
        {

            for(int size=0;size<=n;size++)
            {

                for(int j=0;j<size;j++)
                System.out.print(arr[(i+j)%n]);

                System.out.println("");

            }

        }
    }
    
    

    static void printSubarrays(int [] arr)
    {
        int n=arr.length;

        for(int i=0;i<n;i++)
        {

            for(int j=0;j<3;j++)
            {

                System.out.print(arr[(i+j)%n]);
            }

            System.out.println("");
        }
    }
}
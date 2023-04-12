/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
    
    
            int ans=0;
            
            int s=1,e=n,mid;
    
            while(s<=e)
            {
                mid=(e-s)/2+s;
    
                if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)
                {
                       ans=mid;
                        break;
                }
                else if(isBadVersion(mid)==true)
                e=mid-1;
    
                else if(isBadVersion(mid)==false)
                s=mid+1;
    
            }
          return ans;
            
        }
    }
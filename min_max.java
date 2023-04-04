//min and max element
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        int ans=0,max=A[0],min=A[0];
        for(int i=0;i<N;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
            if(A[i]<min)
            {
                min=A[i];
            }
        }
        ans=min+max;
        return ans;
    }
    
}
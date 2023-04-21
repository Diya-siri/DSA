class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    int maxx(int[] arr,int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }
    public int countOccurence(int[] arr, int n, int k) 
    {
        int count=0;
        int j=n/k;
        int m=maxx(arr,n);
        int h[]=new int[m+1];
        for(int s=0;s<m+1;s++)
        {
            h[s]=0;
        }
        for(int r=0;r<n;r++)
        {
            if(h[arr[r]]!=-1){
            h[arr[r]]++;
            if(h[arr[r]]>j)
            {
                h[arr[r]]=-1;
                count+=1;
            }
        }
        }
        return count;
    }
}
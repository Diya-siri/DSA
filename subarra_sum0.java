//subarray with sum 0
class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        int cursum=0;
        HashSet<Integer> list=new HashSet<>();
        list.add(0);
        for(int i=0;i<n;i++)
        {
            cursum+=arr[i];
            if(list.contains(cursum))
            return true;
            else
            list.add(cursum);
        }
        return false;
    }
}
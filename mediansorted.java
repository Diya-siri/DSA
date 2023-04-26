//User function Template for Java

class Solution
{
    public int find_median(int[] v)
    {
        int x,ans;
        int n=v.length;
        Arrays.sort(v);
        if(n%2!=0)
        {
        return v[(n-1)/2];
        }
        else if(n%2==0&&n==2)
        {
            return (v[0]+v[1])/2;
        }
        else if(n%2==0){
        x=n/2;
        ans=(v[x]+v[x-1])/2;
        return ans;
            
        }
        else
        return 0;
    }
}

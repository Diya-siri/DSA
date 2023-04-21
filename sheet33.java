class Solution {
    int minmax(int[] price ,int n)
    {
        int max=price[2],min=price[2];
        for(int i=2;i<n;i++)
        {
            if(price[i]>max)
            max=price[i];
            if(price[i]<min)
            min=price[i];
        }
        return (max-min);
    }
    public int maxProfit(int n, int[] price) {
        int diff=price[1]-price[0];
        int diff1=minmax(price,n);
        return diff+diff1;
        
    }
}
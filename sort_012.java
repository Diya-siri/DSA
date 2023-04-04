//sort 0,1,2 without sort algo
class Solution
{
    public static void sort012(int a[], int n)
    {
        int count1=0,count2=0,count3=0;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            count1++;
            else if(a[i]==1)
            count2++;
            else if(a[i]==2)
            count3++;
        }
        
        for(int j=0;j<count1;j++)
        {
            a[j]=0;
        }
        for(int k=count1;k<count1+count2;k++)
        {
            a[k]=1;
        }
        for(int h=count1+count2;h<n;h++)
        {
            a[h]=2;
        }
        
    }
}
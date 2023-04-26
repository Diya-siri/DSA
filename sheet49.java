class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int i=0,ans=0,count;
        int max=0;
        while(i!=n)
        {
            count=0;
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1){
                count++;
                }
            }
            if(count>max){
            max=count;
            ans=i;
            }
            i++;
        }
        if(max!=0){
        return ans;}
        else
        return -1;
        
    }
}

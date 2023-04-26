class Solution {
    int median(int matrix[][], int R, int C) {
        ArrayList <Integer> list=new ArrayList<>();
        int i=0;
        while(i<R){
        for(int j=0;j<C;j++)
        {
            list.add(matrix[i][j]);
        }
        i++;
        }
        int x,ans;
        int n=list.size();
        Collections.sort(list);
        if(n%2!=0)
        {
        return list.get((n-1)/2);
        }
        else if(n%2==0&&n==2)
        {
            return (list.get(0)+list.get(1))/2;
        }
        else if(n%2==0){
        x=n/2;
        ans=(list.get(x)+list.get(x-1))/2;
        return ans;
            
        }
        else
        return 0;
    }
}

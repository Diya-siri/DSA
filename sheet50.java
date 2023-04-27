class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        int[] sample=new int[N*N];
        int k=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                sample[k++]=Mat[i][j];
            }
        }
        Arrays.sort(sample);
        int[][] ans=new int[N][N];
        int p=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                ans[i][j]=sample[p++];
            }
        }
        return ans;
    }
};

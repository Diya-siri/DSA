class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        ArrayList <Integer> list=new ArrayList<>();
        int j=0;
        while(j!=n){
        for(int i=0;i<n;i++)
        {
            list.add(mat[j][i]);
        }
        j++;
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
      Set<Integer>set=new HashSet<>();
      
      for(int i:A){
      set.add(i);}
      for(int j=0;j<n;j++)
      {
          int sum=A[j];
          for(int k=j+1;k<n;k++)
          {
              int tempsum=sum+A[k];
              int p=X-tempsum;
              if(set.contains(p)&&p!=A[j]&&p!=A[k])
              return true;
          }
      }
      return false;
    
    }
}
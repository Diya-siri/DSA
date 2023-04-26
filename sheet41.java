class GfG
{
    static int palindrome(int a[],int n,int k)
    {
            String s=Integer.toString(a[k]);
            for(int i=0,j=s.length()-1;i<j;i++,j--)
            {
                if(s.charAt(i)!=s.charAt(j))
                return 0;
            }
            return 1;
        
    }
	public static int palinArray(int[] a, int n)
           {
                  for(int i=0;i<n;i++)
                  {
                      if(palindrome(a,n,i)==0)
                      return 0;
                  }
                  return 1;
                  
           }
}
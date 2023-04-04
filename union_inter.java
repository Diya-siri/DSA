
//union using hashset
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet <Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add(a[i]);
        }
        for(int j=0;j<m;j++)
        {
            s.add(b[j]);
        }
        return (s.size());//union count
        System.out.println(s);//print union elements
        
    }
}


//intersection using hashset
class Solution{
    public static int doInter(int a[], int n, int b[], int m) 
    {
        HashSet <Integer> s1=new HashSet<>();
        HashSet <Integer> s2=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s1.add(a[i]);
        }
        for(int j=0;j<m;j++)
        {
            s2.add(b[j]);
        
        }
        s1.retainAll(s2);
        System.out.println(s1);
        return (s1.size());
    }
}
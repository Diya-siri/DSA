//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int c[]=new int[n+m];
        int i=0,j=0,k=0,x;
        double ans;
        while(i<n&&j<m)
        {
            if(a[i]<=b[j]){
            c[k]=a[i];
            i++;
            k++;
            }
            else
            if(b[j]<a[i]){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<n)
        {
            c[k]=a[i];
            i++;k++;
        }
        while(j<m)
        {
            c[k]=b[j];
            j++;k++;
            
        }
        int ni=c.length;
        if(ni%2!=0)
        {
            ans=(double)c[(ni-1)/2];
            return ans;
        }
        else if(ni%2==0&&ni==2)
        {
            ans=(double)(c[0]+c[1])/(double)2;
            return ans;
        }
        else if(ni%2==0){
        x=ni/2;
        //System.out.println(x);
        ans=(double)(c[x]+c[x-1])/(double)2;
        return ans;
            
        }
        else
        return 0;
            
    }
}

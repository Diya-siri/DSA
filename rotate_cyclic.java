//cyclically rotate by one element

class Compute {
    
    public void rotate(int arr[], int n)
    {
        int temp=arr[n-1];
        
        int j=1;
        int a[]=new int[n+1];
        a[0]=temp;
        for(int i=0;i<n;i++)
        {
            a[j]=arr[i];
            j++;
        }
        for(int k=0;k<n;k++)
        {
            arr[k]=a[k];
        }
        
    }
}
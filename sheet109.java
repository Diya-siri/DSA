//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int max(int a[],int size)
    {
        int m=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>m)
            m=a[i];
        }
        return m;
    }
    static int majorityElement(int a[], int size)
    {
        int p=(int)size/2;
        int m1=max(a,size);
        int arr[]=new int[m1+1];
        for(int l=0;l<m1+1;l++)
        {
            arr[l]=0;
        }
        for(int i=0;i<a.length;i++)
        {
            arr[a[i]]++;
        }
        for(int j=0;j<m1+1;j++)
        {
            if(arr[j]>p)
            {
                return j;
                
            }
        }
        return -1;
        
    }
}

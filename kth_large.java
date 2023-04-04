//smallest
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=l;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(int j=k;j<=r;j++)
        {
            pq.add(arr[j]);
            if(pq.size()>k)
            {
                pq.remove();
                
            }
        }
        return pq.peek();
    } 
}

//largest
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=l;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(int j=k;j<=r;j++)
        {
            pq.add(arr[j]);
            if(pq.size()<k)
            {
                pq.remove();
                
            }
        }
        return pq.peek();
    } 
}
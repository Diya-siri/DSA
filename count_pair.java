//count pairs with given sum
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int b=k-arr[i];
            if(m.containsKey(b)){
                m.put(arr[i],m.get(arr[i])+1);
            }
            m[arr[i]]++;
        }
        return ans;
        
    }
    
}

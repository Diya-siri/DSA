class Solution {
    int isPalindrome(String S) {
        for(int i=0,j=S.length()-1;i<j;i++,j--)
        {
            if(S.charAt(i)!=S.charAt(j))
            return 0;
        }
        return 1;
    }
};
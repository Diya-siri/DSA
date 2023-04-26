//brute force
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
        {
            return false;
        }
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0,h=(n*m)-1;
        while(l<=h)
        {
            int mid=(l+(h-l))/2;
            if(matrix[mid/m][mid%m]==target)
            return true;
            else if(matrix[mid/m][mid%m]<target)
            l=mid+1;
            else
            h=mid-1;
        }
        return false;
    }
}




//optimal
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length&&j>=0)
        {
            if(matrix[i][j]==target)
            return true;
            if(matrix[i][j]>target)
            j--;
            else
            i++;

        }
        return false;
    }
}

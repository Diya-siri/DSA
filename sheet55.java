import java.util.HashMap;
import java.util.Map;

public class sheet55 {
    static int M = 4;
    static int N =5;
   
public static void main(String args[])
{
    int mat[][] =
    {
        {1, 2, 1, 4, 8},
        {3, 7, 8, 5, 1},
        {8, 7, 7, 3, 1},
        {8, 1, 2, 7, 9},
    };
  
    printCommonElements(mat);
}


static void printCommonElements(int mat[][])
{
    Map <Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<N;i++)
    {
        mp.put(mat[0][i],1);
    }
    for(int j=1;j<M;j++)
    {
        for(int k=0;k<N;k++)
        {
            if(mp.get(mat[j][k])!=null && mp.get(mat[j][k])==j)
            {
                mp.put(mat[j][k],j+1);
                if(j==M-1)
                System.out.println(mat[j][k]+" ");
            }
        }
    }
}
}

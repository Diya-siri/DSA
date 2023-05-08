
//find common elements among three arrays
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int x=0,y=0,z=0;
        int xv,yv,zv;
        ArrayList<Integer> list=new ArrayList<>();
        while(x!=n1&&y!=n2&&z!=n3)
        {
            xv=A[x];
            yv=B[y];
            zv=C[z];
            if(xv==yv && yv==zv)
            {
                if(!list.contains(xv))
                list.add(xv);
                x++;
                y++;
                z++;
            }
            else if(xv<=yv && xv<=zv)
            x++;
            else if(yv<=xv && yv<=zv)
            y++;
            else
            z++;
            
        }
        return list;
        
    }
}

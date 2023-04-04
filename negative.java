//all negatives to the front and positive later
import java.io.*;

class GFG {
	public static void main (String[] args) {
		int a[]={-2,1,2,-5,6,8,3,-6,-1,7};
		int i=0,j=10-1,temp;
		while(i<j){
		while(a[i]<0){i++;}
		while(a[j]>0){j--;}
		if(i<j)
		{
		    temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
		}}
		for(int k=0;k<10;k++)
		System.out.print(a[k]+" ");
	}
}
import java.util.*;
class Mergesort
{
	void merge(int a[],int l,int m,int r)
	{
		//Finding the sizes of two sub arrays to be merged
		int n1=m-l+1;
		int n2=r-m;
		int b[]=new int[100];
		int c[]=new int [100];
		for(int j=0;j<n1;j++)
		{
			b[j]=a[l+j];
		}
		for(int j=0;j<n1;j++)
		{
			c[j]=a[m+1+j];
		}
		//Condition checking to merge the 2 sub arrays
		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
			if(b[i]<=c[j])
			{
				a[k]=b[i];
				i++;
			}
			else
			{
				a[k]=c[j];
				j++;
			}
			k++;
		}
		//storing the left over elements 
		while(i<n1)
		{
			a[k]=b[i];
			i++;
			k++;
		}
		while(j<n1)
		{
			a[k]=c[j];
			j++;
			k++;
		}
		
	}
	//Function to sort the elements using merge sort techniques using a function
	void sort(int a[],int l,int r)
	{
		if(l<r)
		{
			//calculating the mid point
			int m=(l+r)/2;
			//recursive calls
			sort(a,l,m);
			sort(a,m+1,r);
			
			//Function calling to merge the two sorted arrays
			merge(a,l,m,r);
			
		}
	}
	
	//Function to print the merged and sorted array
	void printarray(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
			
	}
     //Main function
	public static void main(String args[])
	{
		/*Scanner input=new Scanner(System.in);
		int a[]=new int[100];
		int n;
		System.out.println(" Enter the number of array elements");
		n=input.nextInt();
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}*/
		int a[]= {10, 3, 24, 4,11,18, 89};
		Mergesort obj=new Mergesort();
		obj.sort(a,0,a.length-1);
		System.out.println(" Sorted array:- ");
		printarray(a);
		
	}
}

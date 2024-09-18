public class Main
{
	public static void main(String[] args) {
	    //example1
	    //find missing number from sorted array 
		int a[]={1,2,4,5};
		int n=5;
		int sum=n*(n+1)/2;
		int summ=0;
		for(int i=0;i<a.length;i++)
		{
		    summ=summ+a[i];
		}
		int c=sum-summ;
		System.out.println("missing element is: "+c);
		//example2
		//sorting array elements using loops
		int b[]={1,4,2,3};
		int t;
		for(int i=0;i<b.length;i++)
		{
		    for(int j=i+1;j<b.length;j++)
		    {
		        if(b[i]>b[j])
		        {
		            t=b[i];
		            b[i]=b[j];
		            b[j]=t;
		        }
		    }
		}
		for(int k=0;k<b.length;k++)
		{
		    System.out.println(b[k]);
		}
	}
}

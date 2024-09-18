public class Prime 
{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,9,11};
		int count =0;
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]==1)
		    {
		        System.out.println(a[i]+" not prime");
		    }
		    else if(a[i]>1)
		    {
		        for(int j=1;j<=a[i];j++)
		        {
		            if(a[i]%j==0)
		            {
		                count++;
		            }
		        }
		        if(count>2)
		        {
		            System.out.println(a[i]+" not prime");
		            count=0;
		        }
		        else
		        {
		            System.out.println(a[i]+" prime");
		            count=0;
		        }
		    }
		    else
		    {
		        System.out.println(a[i]+" not prime");
		    }
		}
	}
}

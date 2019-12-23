package lab1_3;

public class TestMaths {

	int base,index,power=1,number,fact=1,primeflag=0;
	
	
	public void power(int base, int index) {
		for(int i=index;i>0;i--) 
		{
			power*=base;
		}
	}
	
	public void findFactorial(int n) {
		for(int i=1;i<=n;i++)
		{
			fact*=(i);
		}
	}
	
	public void findTable(int n) {
		for(int i=1;i<=10;i++)
		{
			int table = n*i;
			System.out.println(n+"*"+i+"="+table);
		}
		System.out.println();
	}
	
	public void findPrime(int n)
	{
		if(n==1) System.out.println(n+" is neither prime nor composite");
		else
			{
				for(int i=2;i<=n/2;i++)
				{
					if(n%i==0) {
						primeflag=1;
						break;
					}
				}
				if(primeflag==0) System.out.println(n+" is a prime number");
				else System.out.println(n+" is NOT a prime number");
			}
	}
	
	void print() {
		System.out.println("power= " +power);
		System.out.println("factorial = " +fact);
	}
}

package Scripts;

public class Mainclass1 {
	
	public static void main(String[] args) { 
		int m=145,count=0;
		int n=m;
		String s="";
		while(n!=0)
		{
			int d=n%10;
			count = count+1;
			s=s+d;
			n=n/10;
						
		}
		
		
		System.out.println(n)
		System.out.println(s);
		System.out.println(count);
			
	}

}

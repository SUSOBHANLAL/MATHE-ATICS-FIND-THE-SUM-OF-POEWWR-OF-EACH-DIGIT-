package ethenus123;

public class susobhan {
	
	static int totalno(int n ) {
		int count =0;
		while(n>0) {
			int last = n%10;
			count++;
			n = n/10;
		}
		return count;
		}

	static int powwer(int n) {
		int len = totalno( n );//3  //n= 153;
		
		int num = n;
		
		int max = 0;
		int sum =0;
		int dig =0;
		
		while(num>0) {
		 dig = num%10;
			num= num/10;
			
			 sum = dig;
			 
		
			for(int i =1;i<len;i++) {
				sum=sum*dig;
			
		}
			max= max+sum;
		
	}
		return max;
		
	}
	
	public static void main(String args[]) {
		
		int n= 153;
		
		if(powwer(n)==n) {
			System.out.print("yes");
		}else {
			System.out.print("No");
		}
		
		
		
	}


}

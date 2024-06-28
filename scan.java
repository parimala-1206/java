import java.util.Scanner;
class number{
public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start,num1,num2  and lcf");
	        int start=sc.nextInt();
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int lcf=sc.nextInt();
		if(num1<=num2)
		{
			while(start>=2)
			{
		 		if (num1%start==0 && num2%start==0)
		 	
					lcf=start;

		 		start--;
		 }	}
		System.out.println("lcf is "+lcf);
}
}
		
	
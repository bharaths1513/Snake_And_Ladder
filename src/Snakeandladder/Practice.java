package Snakeandladder;

import java.util.Scanner;



public class Practice {


		
		void palindrome() {
			int a,b,c,d=0;
			System.out.println("Enter any number");
			Scanner o=new Scanner(System.in);
			a=o.nextInt();
			b=a;
			
			while(a>0)
			{
				c=a%10;//1/10==0.1 0
				d=(d*10)+c;
				a=a/10;
				
			}
			System.out.println(d);
			if(d==b)
			{
				System.out.println("The given num "+d+" is Palindrome ");
				
			}
			else
			{
				System.out.println("The given num "+d+" is not a Palindrome ");
				
			}
		}
			int factorial() {
			int a,factorial=1;
			System.out.println("Enter the factorial value");
			Scanner o=new Scanner(System.in);
			a=o.nextInt();
			
			for(int i=1; i<=a; i++)
			{
				factorial=factorial*i;
			}
			System.out.println("The factorial of " +a+ " is " +factorial);
			return factorial;
		}

		void fibonacci() {
			int term,a=0,b=1,c;
			System.out.println("Enter term");
			Scanner o=new Scanner(System.in);
			term=o.nextInt();
			for(int i=1; i<=term; i++){
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			}
		}

	 
		

		public static void main(String[] args) {
			
				Practice o=new Practice();
				o.palindrome();
				System.out.println("\n");
				o.factorial();
				System.out.println("\n");
				o.fibonacci();
	}

}

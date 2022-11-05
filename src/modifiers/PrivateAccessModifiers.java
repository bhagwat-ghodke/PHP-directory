package modifiers;

import java.util.Scanner;


public class PrivateAccessModifiers {

	private void addition() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of addition");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("The addition is "+c);
		}
		
		public static void main(String args[]) {
			PrivateAccessModifiers p1 = new PrivateAccessModifiers();
			p1.addition();
			
		}
	}


package publicaccessmodifiers;

import java.util.Scanner;

public class addition {
	public void addition() {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number for addition");
	
	int a= sc.nextInt();
	int b=sc.nextInt();
	int c=a+b;
	System.out.println("The addition is "+c);
	}
	
	public static void main(String args[]) {
		addition a = new addition();
		a.addition();
	}
	
}

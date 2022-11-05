package protectadaccessmodifier2;

import java.util.Scanner;

import protectedaccessmodifiers.protctedaccessmodifiers2;

public class addition extends protctedaccessmodifiers2  {
	
	
	protected void addition() {
		
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
		a.division();
		
		//protacted calling
	
	}

}

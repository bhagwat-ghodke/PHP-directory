package protectedaccessmodifiers;

import java.util.Scanner;

public class proctectedaccessmodifiers1 {

	protected void multiplaction() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number for multiplaction");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*b;
		
		System.out.println("The multiplaction is "+c);
	}
	
	public static void main(String args[]) {
		
		proctectedaccessmodifiers1 A = new proctectedaccessmodifiers1();
		A.multiplaction();
		
		protctedaccessmodifiers2 B = new protctedaccessmodifiers2();
		B.division();
		
	}
}

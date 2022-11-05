package protectedaccessmodifiers;

import java.util.Scanner;

public class protctedaccessmodifiers2 {
 
	protected void division() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number for division");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		
		System.out.println("The division is "+c);
	}
	
	public static void main(String args[]) {
		
		protctedaccessmodifiers2 A = new protctedaccessmodifiers2();
		A.division();
		
		proctectedaccessmodifiers1 B = new proctectedaccessmodifiers1();
		B.multiplaction();
	}
}

package publicaccessmodifier2;

import java.util.Scanner;

import publicaccessmodifiers.addition;
import publicaccessmodifiers.substraction;

public class multiplaction {

	public void multiplaction() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for multiplaction");
		
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("The multiplaction is "+c);
	}
	
	public static void main(String args[]) {
		
		multiplaction m = new multiplaction();
		m.multiplaction();
		
		addition a = new addition();
		a.addition();
		
		substraction s = new substraction();
		s.substraction();
		
	}
}

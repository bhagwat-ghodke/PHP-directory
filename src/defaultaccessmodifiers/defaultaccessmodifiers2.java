package defaultaccessmodifiers;

import java.util.Scanner;

public class defaultaccessmodifiers2 {
  
	void substraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from substraction");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a-b;
		
		System.out.println("The substraction is "+c);
	}
	
	public static void main(String args[]) {
		
		defaultaccessmodifiers2 sub = new defaultaccessmodifiers2();
		sub.substraction();
		
		//access another class
		
		defaultaccessmodifier1 add = new defaultaccessmodifier1();
		add.addition();
		
	}
}

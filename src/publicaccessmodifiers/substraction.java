package publicaccessmodifiers;

import java.util.Scanner;

public class substraction {
	
 public void substraction() {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for substraction");
		
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=a-b;
		System.out.println("The substraction is "+c);
 }
 
 public static void main(String args[]) {
	 
	 substraction sub = new substraction();
	 sub.substraction();
	 
	 addition a = new addition();
	 a.addition();
 }
}

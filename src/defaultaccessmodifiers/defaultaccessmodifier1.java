package defaultaccessmodifiers;

import java.util.Scanner;

public class defaultaccessmodifier1 {
   void addition() {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter number for addition");
	   int a = sc.nextInt();
	   int b=sc.nextInt();
	   int c=a+b;
	   System.out.println("The two number addition is "+c);
   }
   
   public static void main(String args[]) {
	   
	   defaultaccessmodifier1 add = new defaultaccessmodifier1();
	   add.addition();
	   
   }
}

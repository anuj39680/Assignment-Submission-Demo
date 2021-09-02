//Take 2 values from command line argument and print sum of the two values.

import java.util.*;
class Sum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two value");
		int i=sc.nextInt();
		int i1=sc.nextInt();
		System.out.println("Sum of two no. is = "+(i+i1));
	}
}
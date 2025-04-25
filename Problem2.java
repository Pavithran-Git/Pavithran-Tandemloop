package problem2;

import java.util.Scanner;

//Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
//		 
//		  Output: (examples)
//		    1) input a = 1, then output : 1
//		    2) input a = 2, then output : 1, 3
//		    3) input a = 3, then output : 1, 3, 5
//		    4) input a = 4, then output : 1, 3, 5, 7

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			int oddNumber = 2*i+1;
			if(i<a -1) {
				System.out.print(oddNumber+",");
			} else {
				System.out.println(oddNumber);
			}
		}
		sc.close();
	}
}

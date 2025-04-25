package problem3;

import java.util.Scanner;

//Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
//		 
//		  Output: (examples)
//		    1) input a = 1, then output : 1
//		    2) input a = 2, then output : 1
//		    3) input a = 3, then output : 1, 3, 5
//		    4) input a = 4, then output : 1, 3, 5
//		    5) input a = 5, then output : 1, 3, 5, 7, 9
//		    6) input a = 6, then output : 1, 3, 5, 7, 9
public class Problem3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = sc.nextInt();
		int count;
		if(a%2 ==0) {
			count = a-1;
		} else {
			count = a;
		}
		
		for(int i=0; i<count; i++) {
			int oddNum = 2*i+1;
			if(i<count-1) {
				System.out.print(oddNum+",");
			} else {
				System.out.println(oddNum);
			}
		}
		sc.close();
	}

}

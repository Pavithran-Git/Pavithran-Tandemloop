package problem4;

import java.util.HashMap;
import java.util.Map;

//Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
//		  (examples)
//		  input: [1,2,8,9,12,46,76,82,15,20,30]
//		  Output: 
//		    {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
public class Problem4 {

	public static void main(String[] args) {
		
		int a[] = {1,2,8,9,12,46,76,82,15,20,30};
		int b[] = {1,2,3,4,5,6,7,8,9};
		
		Map<Integer, Integer> countNum = new HashMap<Integer, Integer>();
		
		for(int down : b) {
			int count = 0;
			for(int top : a) {
				if(top%down == 0) {
					count++;
				}
			}
			countNum.put(down, count);
		}
		System.out.println(countNum);
	}
}

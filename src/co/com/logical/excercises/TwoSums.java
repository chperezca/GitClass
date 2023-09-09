package co.com.logical.excercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TwoSums {
	public static void main(String[] args) {
		
		int[] test=twoSums(new int[] {9,1,2,7,5,9,1},10);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
	}
	
	public static int[] twoSums(int[] nums, int target) {
		int[] rs= new int[2];
		Map<Integer,Integer>map= new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if (map.containsKey(target-nums[i])) {
				rs[1]=i;
				rs[0]=map.get(target-nums[i]);
				return rs;
			}
			map.put(nums[i], i);
		}
		return rs;
	}
}

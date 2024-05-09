package test;

import java.util.HashMap;
import java.util.Map;


//5. Longest Substring Without Repeating Characters:
//Merge Two Sorted Arrays:
public class TestA {

    public  int addNumber(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int[] inputs = {2,3,4,5,67,98,234};
        int target =9;

        TestA testA = new TestA();
       int[] output=  testA.twoSum(inputs,target);

        System.out.println(String.format(" Value is %d and %d ",output[0],output[1]));
    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }



}

package testc;

import java.util.ArrayList;

public class MainC {



//    Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
//
//    Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
//    Output: Sum found between indexes 2 and 4
//    Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
    public static void main(String[] args) {

        System.out.println("testc.Test");

        int[] input = {1, 4, 20, 3, 10, 5};
        int sum = 33;


        findSum(input,33);


    }

    public static void findSum(int[] input, int sum){

        int tempSum =0;
        ArrayList<Integer> list = new ArrayList<>();

        int start =0;
        int lastIndex =0;
        int end = input.length;

        while (start< end){

            if(tempSum == sum){
                break;
            }
            else if(tempSum < sum){
                tempSum = tempSum+input[start];
                list.add(input[start]);
                start++;
            }
            else if (tempSum > sum){
                lastIndex = lastIndex+1;
                tempSum =0;
                start = lastIndex;
                list = new ArrayList<>();

            }

        }

        System.out.println(list);
    }




}
package test;

import java.util.ArrayList;

public class TestOne {

    //input array of integers, duplicates
    //output with removing duplicate

    public static void main(String[] args){

        int[] inputArray = {2,3,4,1,2,4,6,7,7,8};
        int duplicateCount =0;

        int[] outputArray = new int[inputArray.length];
        int count =0;


        for(int i =0;i< inputArray.length-1;i++){
            for(int j = i+1; j<inputArray.length;j++){

                if(inputArray[i] == inputArray[j]){

                    count++;
                    inputArray[i] = Integer.MIN_VALUE;
                }

            }
        }

        int[] finalArray = new int[inputArray.length-count];
         int index =0;
        for(int i =0;i< inputArray.length;i++){

            if(inputArray[i] != -Integer.MIN_VALUE){
                finalArray[index] = inputArray[i];
                System.out.print(inputArray[i] + ",");
                index++;
            }
        }


    }



}

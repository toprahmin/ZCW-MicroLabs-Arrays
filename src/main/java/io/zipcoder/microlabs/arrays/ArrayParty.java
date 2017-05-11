package io.zipcoder.microlabs.arrays;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayParty {

    public String printArray(String[] inputArray) {
        String arr = "*** Output ***";
        for (int i = 0; i < inputArray.length; i++) {
            arr += "\n" + inputArray[i];
        }
        return arr;
    }

    public String lastElement(String[] inputArray) {
        String arr = "*** Output ***";
        arr += "\n" + inputArray[inputArray.length - 1];
        return arr;
    }

    //TODO Define the method lastButOne

    public String lastButOne(String[] inputArray) {
        String arr = "*** Output ***";
        arr += "\n" + inputArray[inputArray.length - 2];
        return arr;
    }

    //TODO Define the method reverse
    public String reverse(String[] inputArray) {
        String reversedArr = "*** Output ***";
        for (int i = inputArray.length - 1; -1 < i && i < inputArray.length; i--) {
            reversedArr += "\n" + inputArray[i];
        }
        return reversedArr;
    }

    //TODO Define the method isPalindrome
    public boolean isPalindrome(String[] inputArray) {
        String[] arr = new String[inputArray.length];
        boolean isPalindromatic = false;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; -1 < j && j < inputArray.length; j--) {
                arr[i] = inputArray[j];
                if (arr[i] == inputArray[i]) {
                    isPalindromatic = true;
                } else {
                    isPalindromatic = false;
                }
            }
        }
        return isPalindromatic;
    }

    //TODO Define the method compress
    public String consecutiveDuplicates(int[] numArr) {
        String consecutive = "compress(numsArr)\n*** Output ***\n" + numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] != numArr[i - 1]) {
                consecutive += "\n" + numArr[i];
            }
        }
        return consecutive;
    }

    //TODO Define the method pack
    public String pack(char[] nums) {
        String packed = "pack(nums)\n*** Output ***\n" + nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if(nums[i] == nums[i - 1]){
                packed += nums[i];
            }
            else {
                packed += "," + nums[i];
            }
        }
        if (nums[nums.length - 1] == nums[nums.length-2]){
            packed += nums[nums.length-1];
        } else {
            packed += "," + nums[nums.length-1];
        }
        return packed;
    }
}


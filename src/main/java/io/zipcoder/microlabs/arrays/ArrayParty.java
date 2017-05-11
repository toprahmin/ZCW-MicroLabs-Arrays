package io.zipcoder.microlabs.arrays;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayParty {

    public String printArray(String[] inputArray){
        String arr = "*** Output ***";
        for(int i = 0; i<inputArray.length; i++){
            arr += "\n" + inputArray[i];
        }
        return arr;
    }

    public String lastElement(String[] inputArray){
        String arr = "*** Output ***";
        arr += "\n" + inputArray[inputArray.length - 1];
        return arr;
    }

    //TODO Define the method lastButOne

    public String lastButOne(String[] inputArray){
        String arr = "*** Output ***";
        arr += "\n" + inputArray[inputArray.length - 2];
        return arr;
    }
    //TODO Define the method reverse
    public String reverse(String[] inputArray){
        String reversedArr = "*** Output ***";
        for(int i = inputArray.length - 1; -1 < i && i < inputArray.length; i--){
            reversedArr += "\n" + inputArray[i];
        }
        return reversedArr;
    }

    //TODO Define the method isPalindrome
    public boolean isPalindrome(String[] inputArray) {
        String[] arr = new String[inputArray.length];
        boolean ispalindromatic = false;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; -1< j && j < inputArray.length; j--) {
                arr[i] = inputArray[j];
                if (arr[i] == inputArray[i]) {
                    ispalindromatic = true;
                } else {
                    ispalindromatic = false;
                }
            }
        }
        return ispalindromatic;
    }

        //TODO Define the method compress
    public String consecutiveDuplicates(int[] numArr){
        String consecutive = ""
        return "";
    }
        //TODO Define the method pack
    }

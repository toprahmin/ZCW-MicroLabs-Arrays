package io.zipcoder.microlabs.arrays;


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

    //TODO Define the method isPalindrome

    //TODO Define the method compress

    //TODO Define the method pack



}

package io.zipcoder.microlabs.arrays;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nMushrooms";

        //: When
        String actual = arrayParty.lastElement(breakfast);

        //: Then
        assertEquals("The two string outputs are equal", expected, actual);
    }

    //TODO Define the method lastButOneTest
    @Test
    public void lastButOneTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nTomatoes";

        //: When
        String actual = arrayParty.lastButOne(breakfast);

        //: Then
        assertEquals("The two string outputs are equal", expected, actual);
    }
    //TODO Define the method reverseTest
    @Test
    public void reverseTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";
        //: When
        String actual = arrayParty.reverse(breakfast);

        //: Then
        assertEquals("The two string outputs are equal", expected, actual);
    }

    //TODO Define the method isPalindromeTest
    @Test
    public void isPalindromeTrueTest() {
        //: Given
        ArrayParty arrayParty = new ArrayParty();
        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        boolean expected1 = true;
        boolean expected2 = false;
        //: When
        boolean actual1 = arrayParty.isPalindrome(palindromic);
        boolean actual2 = arrayParty.isPalindrome(breakfast);
        //: Then
        assertTrue( actual1);
        assertFalse(actual2);
    }


    //TODO Define the method compressTest
    @Test
    public void consecutiveDuplicates(){
        //: Given
        ArrayParty arrayParty = new ArrayParty();
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String expected ="compress(numsArr)\n*** Output ***\n1\n3\n2\n1\n4";
        //: When
        String actual = arrayParty.consecutiveDuplicates(nums);
        //: Then
        assertEquals("the two strings are equal", expected, actual);
    }


    //TODO Define the method packTest
    @Test
    public void testPack(){
        //: Given
        ArrayParty arrayParty = new ArrayParty();
        char[] nums = {'a','a','a','a','b','c','c','a','a','d','e','e','e','e' };
        String expected = "pack(nums)\n*** Output ***\naaaa,b,cc,aa,d,eeee";
        //: When
        String actual = arrayParty.pack(nums);
        //: Then
        assertEquals(expected,actual);
    }

}

package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        String test = "bookkepper";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("b", "o", "k", "e", "p", "r"));
        ArrayList<String> actual = task3.removeDuplicates(test);

        assertNotNull(actual);
        Collections.sort(expected); // Sort the expected ArrayList
        Collections.sort(actual);
        assertEquals("string should be zero", expected, actual);

        // Student should write tests here
       /* String test = "bookkeper";
        ArrayList<String> check = task3.removeDuplicates(test);

        assertNotNull(check);
        assertEquals("Test should come as br", "bokper", check);
*/
    }

    @Test
    public void test_removeDuplicates_average(){
        // Student should write tests here
        String test= null;
        ArrayList<String> check=task3.removeDuplicates(test);

        assertNotNull(check);
        assertEquals("string should be zero", new ArrayList<>(), check);


    }

    @Test
    public void test_removeDuplicates_worst(){
        // Student should write tests here
        String test= "";
        ArrayList<String> check=task3.removeDuplicates(test);

        assertNotNull(check);
        assertEquals("string should be zero", new ArrayList<>(), check);


    }

    @Test
    public void test_areTheseAnagrams_best(){
        // Student should write tests here
        String test = "I am True";
        String test2 = "am I True";
        boolean check = task3.areTheseAnagrams(test,test2);

        assertNotNull(check);
        assertTrue("answer should be true", check );

    }

    @Test
    public void test_areTheseAnagrams_average(){
        // Student should write tests here
        String test1= null;
        String test2= null;
        boolean check = task3.areTheseAnagrams(test2,test1);

        assertFalse("IT SHOULD BE FALSE", check);

    }

    @Test
    public void test_areTheseAnagrams_worst(){
        // Student should write tests here
        String test1= "I am";
        String test2= "I am True";
        boolean check = task3.areTheseAnagrams(test2,test1);

        assertFalse("IT SHOULD BE FALSE", check);

    }

}

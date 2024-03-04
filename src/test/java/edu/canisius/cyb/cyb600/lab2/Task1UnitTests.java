package edu.canisius.cyb.cyb600.lab2;

import edu.canisius.cyb.cyb600.lab2.exceptions.NotADogException;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Contains the Unit Tests for Task1.java
 * STUDENTS SHOULD NOT BE CHANGING THIS FILE.
 */
// I should finish this today//
public class Task1UnitTests {
    protected Task1 task1;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task1 = new Task1();
    }

    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_listAllCharacters_average(){
        String baseString = "";

        List<Character> testableArray = task1.listAllCharacters(baseString);

        assertNotNull(testableArray);
        assertEquals("Incorrect Number of elements in array", 0, testableArray.size());
    }

    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_listAllCharacters_best(){
        String baseString = "example";

        List<Character> testableArray = task1.listAllCharacters(baseString);

        assertNotNull(testableArray);
        assertEquals("Incorrect Number of elements in array", 7, testableArray.size());
    }

    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_listAllCharacters_worst(){
        String baseString = null;

        List<Character> testableArray = task1.listAllCharacters(baseString);

        assertNotNull(testableArray);
        assertEquals("Incorrect Number of elements in array", 0, testableArray.size());
    }

    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_concatenateToFrontAndEnd_average(){
        String baseString = "example";
        String somethingToTest = "";
        String testableStr = task1.concatenateToFrontAndEnd(baseString, somethingToTest);

        assertNotNull(testableStr);
        assertEquals("String for concatenateToFrontAndEnd is not right", "example", testableStr);
    }

    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_concatenateToFrontAndEnd_best(){
        String baseString = "base";
        String somethingToTest = "++";
        String testableStr = task1.concatenateToFrontAndEnd(baseString, somethingToTest);

        assertNotNull(testableStr);
        assertEquals("String for concatenateToFrontAndEnd is not right", "++base++", testableStr);
    }

    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_concatenateToFrontAndEnd_worst(){
        String baseString = "";
        String somethingToTest = null;
        String testableStr = task1.concatenateToFrontAndEnd(baseString, somethingToTest);

        assertNotNull(testableStr);
        assertEquals("String for concatenateToFrontAndEnd is not right", "", testableStr);

    }

    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_concatenateToFrontAndEnd_worst_2nulls(){
        String baseString = null;
        String somethingToTest = null;
        String testableStr = task1.concatenateToFrontAndEnd(baseString, somethingToTest);

        assertNotNull(testableStr);
        assertEquals("String for concatenateToFrontAndEnd is not right", "", testableStr);
    }

    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_throwExceptionIfNotADog_average(){
        String baseString = "Dog";

        try {
            task1.throwExceptionIfNotADog(baseString);
        } catch (NotADogException e) {
            fail("Unexpected Exception Threw. They are wrong. This is totally a dog.");
        }
    }

    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_throwExceptionIfNotADog_best(){
        String baseString = "dog";

        try {
            task1.throwExceptionIfNotADog(baseString);
        } catch (NotADogException e) {
           fail("Unexpected Exception Threw. They are wrong. This is totally a dog.");
        }
    }

    @Test(expected = NotADogException.class)
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_throwExceptionIfNotADog_worst() throws NotADogException {
        String baseString = "cat";
        task1.throwExceptionIfNotADog(baseString);

    }

    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_returnsTheSameStringTenTimes_average(){
        String baseString = "";

        List<String> testableArray = task1.returnsTheSameStringTenTimes(baseString);

        assertNotNull(testableArray);
        assertEquals("Incorrect Number of elements in array", 10, testableArray.size());
        for (String str : testableArray){
            assertEquals("Contains string thats not \"\"","",str);
        }
    }

    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_returnsTheSameStringTenTimes_best(){
        String baseString = "test";

        List<String> testableArray = task1.returnsTheSameStringTenTimes(baseString);

        assertNotNull(testableArray);
        assertEquals("Incorrect Number of elements in array", 10, testableArray.size());
        for (String str : testableArray) {
            assertEquals("Contains string thats not test", "test", str);
        }
    }


    @Test
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void test_returnsTheSameStringTenTimes_worst(){
        String baseString = null;

        List<String> testableArray = task1.returnsTheSameStringTenTimes(baseString);

        assertNotNull(testableArray);
        assertEquals("Incorrect Number of elements in array", 0, testableArray.size());
    }

}

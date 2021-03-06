package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("The test is about to begin. First we will see how does the empty arraylist acts");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("The test has ended. Good job.");
        System.out.println("Awaiting for Simons grade. Good luck.");
    }

    @Before
    public void before() {
        System.out.println("\nTest is about to start");
    }

    @After
    public void after() {
        System.out.println("Test completed. Proceeding.\n");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //arrange
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //act
        OddNumbersExterminator.exterminate(numbers);
        int result = numbers.size();
        //assert
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //arrange
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        //act
        OddNumbersExterminator.exterminate(numbers);
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        //assert
        for (int h = 0; h < numbers.size(); h++) {
            Assert.assertEquals(evenNumbers.get(h), numbers.get(h));
        }
    }
}
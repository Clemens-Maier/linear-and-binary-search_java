package de.jkgweil.informatik;

import junit.framework.TestCase;

public class SearchAlgorithmsTest extends TestCase {

    static final int[] TEST_ARRAY_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static final int[] TEST_ARRAY_2 = {1};
    static final int[] TEST_ARRAY_3 = {-32454567, -234, 8797653, 1337, 99};
    static final int[] TEST_ARRAY_4 = null;
    static final int[] TEST_ARRAY_5 = {};


    public void testLinearSearch() {
        int position1 = SearchAlgorithms.linearSearch(TEST_ARRAY_1, 7);
        assertEquals(6, position1);
        int position2 = SearchAlgorithms.linearSearch(TEST_ARRAY_2, 1);
        assertEquals(0, position2);
        int position3 = SearchAlgorithms.linearSearch(TEST_ARRAY_3, 99);
        assertEquals(4, position3);
    }

    public void testLinearSearchSpecialCases() {
        int position4 = SearchAlgorithms.linearSearch(TEST_ARRAY_4, 5);
        assertEquals(-1, position4);
        int position5 = SearchAlgorithms.linearSearch(TEST_ARRAY_5, 5);
        assertEquals(-1, position5);
    }

    public void testBinarySearch() {
        int position1 = SearchAlgorithms.binarySearch(TEST_ARRAY_1, 7);
        assertEquals(6, position1);
        int position2 = SearchAlgorithms.binarySearch(TEST_ARRAY_2, 1);
        assertEquals(0, position2);
    }

    public void testBinarySearchSpecialCases() {
        int position3 = SearchAlgorithms.binarySearch(TEST_ARRAY_3, 99);
        assertEquals(-1, position3);
        int position4 = SearchAlgorithms.binarySearch(TEST_ARRAY_4, 5);
        assertEquals(-1, position4);
        int position5 = SearchAlgorithms.binarySearch(TEST_ARRAY_5, 5);
        assertEquals(-1, position5);
    }
}
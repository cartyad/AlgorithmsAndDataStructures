import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author
 *  @version HT 2020
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
	private static final double DELTA = 1e-15;
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
    	double [] a = null;
    	assertTrue(SortComparison.isEmpty(a));
    }
    @Test
    public void testInsertionSortIsEmpty()
    {
    	double [] a = null;
    	assertNull(SortComparison.insertionSort(a));
    }
    @Test
    public void testSelectionSortIsEmpty()
    {
    	double [] a = null;
    	assertNull(SortComparison.selectionSort(a));
    }
    @Test
    public void testQuickSortIsEmpty()
    {
    	double [] a = null;
    	assertNull(SortComparison.quickSort(a));
    }
    @Test
    public void testMergeSortIterativeIsEmpty()
    {
    	double [] a = null;
    	assertNull(SortComparison.mergeSortIterative(a));
    }
    @Test
    public void testMergeSortRecursiveIsEmpty()
    {
    	double [] a = null;
    	assertNull(SortComparison.mergeSortRecursive(a));
    }
    
    
    @Test
    public void testInsertionSort()
    {
    	double [] array1 = {0.5, 3.0, 0.1, 6.0, 2.0};
    	double [] array1Sorted = {0.1, 0.5, 2.0, 3.0, 6.0};
    	double [] array2 = {-0.28, -0.65, -0.32, 0.3, -0.18, -1.0, -0.05};
    	double [] array2Sorted = {-1.0, -0.65, -0.32,-0.28, -0.18, -0.05, 0.3};
    	double [] array3 = {0.1};
    	double [] array3Sorted = {0.1};
    	assertArrayEquals(SortComparison.insertionSort(array1), array1Sorted, DELTA);
    	assertArrayEquals(SortComparison.insertionSort(array2), array2Sorted, DELTA);
    	assertArrayEquals(SortComparison.insertionSort(array3), array3Sorted, DELTA);
    }
    @Test
    public void testQuickSort()
    {
    	double [] array1 = {0.5, 3.0, 0.1, 6.0, 2.0};
    	double [] array1Sorted = {0.1, 0.5, 2.0, 3.0, 6.0};
    	double [] array2 = {-0.28, -0.65, -0.32, 0.3, -0.18, -1.0, -0.05};
    	double [] array2Sorted = {-1.0, -0.65, -0.32,-0.28, -0.18, -0.05, 0.3};
    	double [] array3 = {0.1};
    	double [] array3Sorted = {0.1};
    	assertArrayEquals(SortComparison.quickSort(array1), array1Sorted, DELTA);
    	assertArrayEquals(SortComparison.quickSort(array2), array2Sorted, DELTA);
    	assertArrayEquals(SortComparison.quickSort(array3), array3Sorted, DELTA);
    }
    @Test
    public void testMergeSortIterative()
    {
    	double [] array1 = {0.5, 3.0, 0.1, 6.0, 2.0};
    	double [] array1Sorted = {0.1, 0.5, 2.0, 3.0, 6.0};
    	double [] array2 = {-0.28, -0.65, -0.32, 0.3, -0.18, -1.0, -0.05};
    	double [] array2Sorted = {-1.0, -0.65, -0.32,-0.28, -0.18, -0.05, 0.3};
    	double [] array3 = {0.1};
    	double [] array3Sorted = {0.1};
    	assertArrayEquals(SortComparison.mergeSortIterative(array1), array1Sorted, DELTA);
    	assertArrayEquals(SortComparison.mergeSortIterative(array2), array2Sorted, DELTA);
    	assertArrayEquals(SortComparison.mergeSortIterative(array3), array3Sorted, DELTA);
    }
    @Test
    public void testMergeSortRecursive()
    {
    	double [] array1 = {0.5, 3.0, 0.1, 6.0, 2.0};
    	double [] array1Sorted = {0.1, 0.5, 2.0, 3.0, 6.0};
    	double [] array2 = {-0.28, -0.65, -0.32, 0.3, -0.18, -1.0, -0.05};
    	double [] array2Sorted = {-1.0, -0.65, -0.32,-0.28, -0.18, -0.05, 0.3};
    	double [] array3 = {0.1};
    	double [] array3Sorted = {0.1};
    	assertArrayEquals(SortComparison.mergeSortRecursive(array1), array1Sorted, DELTA);
    	assertArrayEquals(SortComparison.mergeSortRecursive(array2), array2Sorted, DELTA);
    	assertArrayEquals(SortComparison.mergeSortRecursive(array3), array3Sorted, DELTA);
    }
    @Test
    public void testSelectionSort()
    {
    	double [] array1 = {0.5, 3.0, 0.1, 6.0, 2.0};
    	double [] array1Sorted = {0.1, 0.5, 2.0, 3.0, 6.0};
    	double [] array2 = {-0.28, -0.65, -0.32, 0.3, -0.18, -1.0, -0.05};
    	double [] array2Sorted = {-1.0, -0.65, -0.32,-0.28, -0.18, -0.05, 0.3};
    	double [] array3 = {0.1};
    	double [] array3Sorted = {0.1};
    	assertArrayEquals(SortComparison.selectionSort(array1), array1Sorted, DELTA);
    	assertArrayEquals(SortComparison.selectionSort(array2), array2Sorted, DELTA);
    	assertArrayEquals(SortComparison.selectionSort(array3), array3Sorted, DELTA);
    }
    



    // TODO: add more tests here. Each line of code and ech decision in Collinear.java should
    // be executed at least once from at least one test.

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args)
    {
        //TODO: implement this method
    }

}


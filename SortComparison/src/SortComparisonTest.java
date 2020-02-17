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
    	double [] a = {0.5, 3.0, 0.1, 6.0, 2.0};
    	double [] aSorted = {0.1, 0.5, 2.0, 3.0, 6.0};
    	double [] aNegative = {-0.28, -0.65, -0.32, 0.3, -0.18, -1.0, -0.05};
    	double [] aNegativeSorted = {-1.0, -0.65, -0.32,-0.28, -0.18, -0.05, 0.3};
    	double [] aSingle = {0.1};
    	double [] aSingleSorted = {0.1};
    	double [] b = SortComparison.insertionSort(a);
    	double [] bNegative = SortComparison.insertionSort(aNegative);
    	double [] bSingle = SortComparison.insertionSort(aSingle);
    	assertArrayEquals(b, aSorted, DELTA);
    	assertArrayEquals(bNegative, aNegativeSorted, DELTA);
    	assertArrayEquals(bSingle, aSingleSorted, DELTA);
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


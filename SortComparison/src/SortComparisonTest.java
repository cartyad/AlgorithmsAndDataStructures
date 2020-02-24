import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.Stopwatch;
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
    



    // TODO: add more tests here. Each line of code and each decision in Collinear.java should
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
    	double [] a10 = new double[10]; double [] a100 = new double[100]; double [] a1000 = new double[1000];
    	double [] a1000Duplicate = new double[1000]; double [] a1000Nearly = new double[1000];
    	double []  a1000Reverse = new double[1000]; double [] a1000Sorted = new double[1000];
    	
    	double [] b10 = new double[10]; double [] b100 = new double[100]; double [] b1000 = new double[1000];
    	double [] b1000Duplicate = new double[1000]; double [] b1000Nearly = new double[1000];
    	double []  b1000Reverse = new double[1000]; double [] b1000Sorted = new double[1000];
    	
    	double [] c10 = new double[10]; double [] c100 = new double[100]; double [] c1000 = new double[1000];
    	double [] c1000Duplicate = new double[1000]; double [] c1000Nearly = new double[1000];
    	double []  c1000Reverse = new double[1000]; double [] c1000Sorted = new double[1000];
    	
    	double [] d10 = new double[10]; double [] d100 = new double[100]; double [] d1000 = new double[1000];
    	double [] d1000Duplicate = new double[1000]; double [] d1000Nearly = new double[1000];
    	double []  d1000Reverse = new double[1000]; double [] d1000Sorted = new double[1000];
    	
    	double [] e10 = new double[10]; double [] e100 = new double[100]; double [] e1000 = new double[1000];
    	double [] e1000Duplicate = new double[1000]; double [] e1000Nearly = new double[1000];
    	double []  e1000Reverse = new double[1000]; double [] e1000Sorted = new double[1000];
    	
    	double [] f10 = new double[10]; double [] f100 = new double[100]; double [] f1000 = new double[1000];
    	double [] f1000Duplicate = new double[1000]; double [] f1000Nearly = new double[1000];
    	double []  f1000Reverse = new double[1000]; double [] f1000Sorted = new double[1000];
    	
    	int i=0;
    	try
    	{
    		File file1 = new File("numbers10.txt");
    		BufferedReader BF1 = new BufferedReader(new FileReader(file1));
    		String currentLine;
    		double doubleCurrentLine;
    		while((currentLine=BF1.readLine())!=null)
    		{
    			doubleCurrentLine=Double.parseDouble(currentLine);
    			a10[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}
    	b10=a10;
    	c10=a10;
    	d10=a10;
    	e10=a10;
    	f10=a10;
    	
        
    	try
    	{
    		File file1 = new File("numbers100.txt");
    		BufferedReader BF2 = new BufferedReader(new FileReader(file1));
    		String currentLine;
    		double doubleCurrentLine;
    		while((currentLine=BF2.readLine())!=null)
    		{
    			doubleCurrentLine=Double.parseDouble(currentLine);
    			a100[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}
    	b100=a100;
    	c100=a100;
    	d100=a100;
    	e100=a100;
    	f100=a100;
    	
    	try
    	{
    		File file1 = new File("numbers1000.txt");
    		BufferedReader BF2 = new BufferedReader(new FileReader(file1));
    		String currentLine;
    		double doubleCurrentLine;
    		while((currentLine=BF2.readLine())!=null)
    		{
    			doubleCurrentLine=Double.parseDouble(currentLine);
    			a1000[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}
    	
    	b1000=a1000;
    	c1000=a1000;
    	d1000=a1000;
    	e1000=a1000;
    	f1000=a1000;
    	
    	try
    	{
    		File file1 = new File("numbers1000Duplicates.txt");
    		BufferedReader BF3 = new BufferedReader(new FileReader(file1));
    		String currentLine;
    		double doubleCurrentLine;
    		while((currentLine=BF3.readLine())!=null)
    		{
    			doubleCurrentLine=Double.parseDouble(currentLine);
    			a1000Duplicate[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}
    	
    	b1000Duplicate=a1000Duplicate;
    	c1000Duplicate=a1000Duplicate;
    	d1000Duplicate=a1000Duplicate;
    	e1000Duplicate=a1000Duplicate;
    	f1000Duplicate=a1000Duplicate;
    	
    	try
    	{
    		File file1 = new File("numbersNearlyOrdered1000.txt");
    		BufferedReader BF4 = new BufferedReader(new FileReader(file1));
    		String currentLine;
    		double doubleCurrentLine;
    		while((currentLine=BF4.readLine())!=null)
    		{
    			doubleCurrentLine=Double.parseDouble(currentLine);
    			a1000Nearly[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}
    	
    	b1000Nearly=a1000Nearly;
    	c1000Nearly=a1000Nearly;
    	d1000Nearly=a1000Nearly;
    	e1000Nearly=a1000Nearly;
    	f1000Nearly=a1000Nearly;
    	
    	try
    	{
    		File file1 = new File("numbersReverse1000.txt");
    		BufferedReader BF5 = new BufferedReader(new FileReader(file1));
    		String currentLine;
    		double doubleCurrentLine;
    		while((currentLine=BF5.readLine())!=null)
    		{
    			doubleCurrentLine=Double.parseDouble(currentLine);
    			a1000Reverse[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}
    	
    	b1000Reverse=a1000Reverse;
    	c1000Reverse=a1000Reverse;
    	d1000Reverse=a1000Reverse;
    	e1000Reverse=a1000Reverse;
    	f1000Reverse=a1000Reverse;
    	
    	try
    	{
    		File file1 = new File("numbersSorted1000.txt");
    		BufferedReader BF6 = new BufferedReader(new FileReader(file1));
    		String currentLine;
    		double doubleCurrentLine;
    		while((currentLine=BF6.readLine())!=null)
    		{
    			doubleCurrentLine=Double.parseDouble(currentLine);
    			a1000Sorted[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}
    	
    	b1000Sorted=a1000Sorted;
    	c1000Sorted=a1000Sorted;
    	d1000Sorted=a1000Sorted;
    	e1000Sorted=a1000Sorted;
    	f1000Sorted=a1000Sorted;
    	   
    }

}


/*
Algorithm       Insertion      Selection     Quick         Merge Rec.     Merge It.    

10 Numbers      7300.0         5800.0        9300.0        12200.0        254400.0

100 Numbers     113600.0       112800.0      162600.0      57300.0        174600.0

1000Numbers     3556800.0      3911200.0     2539400.0     659200.0       168600.0

1000Duplicate   363100.0       589000.0      2976300.0     57400.0        83300.0

1000Reverse     287300.0       2722700.0     262700.0      60300.0        83800.0

1000Nearly      257700.0       522800.0      323700.0      72000.0        140800.0

1000Sorted      432900.0       638800.0      253700.0      51500.0        80500.0


1. Which of the sorting algorithms does the order of input have an impact on? Why?

	Insert sort and merge sort recursive is affected by the order of impact. Insert's worst case
	is when it is in reverse order. Merge sort Recursive is worst when randomly sorted and significantly
	better when nearly/sorted or in reverse. While our runtimes don't show this for reverse
	you can see that they are affected by order of input.

2. Which algorithm has the biggest difference between the best and worst performance, based
   on the type of input, for the input of size 1000? Why?
   
	Selection Sort. Difference of 3,388,400 nanoseconds. The worst case is 1000 Numbers randomly sorted and the
	best case is the 1000 numbers nearly sorted.
	
3. Which algorithm has the best/worst scalability, ie, the difference in performance time based
   on the input size? Please consider only input files with random order for this answer.
   
	QuickSort has the best scalability. Merge Sort Iterative had worst scalability.
	
4. Did you observe any difference between iterative and recursive implementations of merge
   sort?
   
   Merge Sort Recursive was better for smaller inputs and the non-Randomly sorted 1000 arrays. Iterative
   was better for the 1000 randomly sorted array.
	
5. Which algorithm is the fastest for each of the 7 input files?
	Merge Sort Recursive was overall the fastest for each file.
 
 */
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
    			b10[i]=doubleCurrentLine;
    			c10[i]=doubleCurrentLine;
    			d10[i]=doubleCurrentLine;
    			e10[i]=doubleCurrentLine;
    			f10[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}

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
    			b100[i]=doubleCurrentLine;
    			c100[i]=doubleCurrentLine;
    			d100[i]=doubleCurrentLine;
    			e100[i]=doubleCurrentLine;
    			f100[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}

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
    			b1000[i]=doubleCurrentLine;
    			c1000[i]=doubleCurrentLine;
    			d1000[i]=doubleCurrentLine;
    			e1000[i]=doubleCurrentLine;
    			f1000[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}

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
    			b1000Duplicate[i]=doubleCurrentLine;
    			c1000Duplicate[i]=doubleCurrentLine;
    			d1000Duplicate[i]=doubleCurrentLine;
    			e1000Duplicate[i]=doubleCurrentLine;
    			f1000Duplicate[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}
    	
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
    			b1000Nearly[i]=doubleCurrentLine;
    			c1000Nearly[i]=doubleCurrentLine;
    			d1000Nearly[i]=doubleCurrentLine;
    			e1000Nearly[i]=doubleCurrentLine;
    			f1000Nearly[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}

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
    			b1000Reverse[i]=doubleCurrentLine;
    			c1000Reverse[i]=doubleCurrentLine;
    			d1000Reverse[i]=doubleCurrentLine;
    			e1000Reverse[i]=doubleCurrentLine;
    			f1000Reverse[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}

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
    			b1000Sorted[i]=doubleCurrentLine;
    			c1000Sorted[i]=doubleCurrentLine;
    			d1000Sorted[i]=doubleCurrentLine;
    			e1000Sorted[i]=doubleCurrentLine;
    			f1000Sorted[i]=doubleCurrentLine;
    			i++;
    		}
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}

    	double start=0;
    	double end=0;
    	double difference=0;

    	System.out.print("Array Size 10 For Insertion Sort:");
    	start =System.nanoTime();
    	SortComparison.insertionSort(a10);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 10 For Selection Sort:");
    	start =System.nanoTime();
    	SortComparison.selectionSort(b10);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 10 For Quick Sort:");
    	start =System.nanoTime();
    	SortComparison.quickSort(c10);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 10 For Merge Sort Recursive:");
    	start =System.nanoTime();
    	SortComparison.mergeSortRecursive(d10);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 10 For Merge Sort Iterative:");
    	start =System.nanoTime();
    	SortComparison.mergeSortIterative(e10);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);


    	System.out.print("Array Size 100 For Insertion Sort:");
    	start =System.nanoTime();
    	SortComparison.insertionSort(a100);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 100 For Selection Sort:");
    	start =System.nanoTime();
    	SortComparison.selectionSort(b100);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 100 For Quick Sort:");
    	start =System.nanoTime();
    	SortComparison.quickSort(c100);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 100 For Merge Sort Recursive:");
    	start =System.nanoTime();
    	SortComparison.mergeSortRecursive(d100);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 100 For Merge Sort Iterative:");
    	start =System.nanoTime();
    	SortComparison.mergeSortIterative(e100);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);


    	System.out.print("Array Size 1000 For Insertion Sort:");
    	start =System.nanoTime();
    	SortComparison.insertionSort(a1000);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 For Selection Sort:");
    	start =System.nanoTime();
    	SortComparison.selectionSort(b1000);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 For Quick Sort:");
    	start =System.nanoTime();
    	SortComparison.quickSort(c1000);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 For Merge Sort Recursive:");
    	start =System.nanoTime();
    	SortComparison.mergeSortRecursive(d1000);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 For Merge Sort Iterative:");
    	start =System.nanoTime();
    	SortComparison.mergeSortIterative(e1000);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);


    	System.out.print("Array Size 1000 Duplicate For Insertion Sort:");
    	start =System.nanoTime();
    	SortComparison.insertionSort(a1000Duplicate);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Duplicate For Selection Sort:");
    	start =System.nanoTime();
    	SortComparison.selectionSort(b1000Duplicate);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Duplicate For Quick Sort:");
    	start =System.nanoTime();
    	SortComparison.quickSort(c1000Duplicate);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Duplicate For Merge Sort Recursive:");
    	start =System.nanoTime();
    	SortComparison.mergeSortRecursive(d1000Duplicate);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Duplicate For Merge Sort Iterative:");
    	start =System.nanoTime();
    	SortComparison.mergeSortIterative(e1000Duplicate);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);


    	System.out.print("Array Size 1000 Reverse For Insertion Sort:");
    	start =System.nanoTime();
    	SortComparison.insertionSort(a1000Reverse);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Reverse For Selection Sort:");
    	start =System.nanoTime();
    	SortComparison.selectionSort(b1000Reverse);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Reverse For Quick Sort:");
    	start =System.nanoTime();
    	SortComparison.quickSort(c1000Reverse);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Reverse For Merge Sort Recursive:");
    	start =System.nanoTime();
    	SortComparison.mergeSortRecursive(d1000Reverse);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Reverse For Merge Sort Iterative:");
    	start =System.nanoTime();
    	SortComparison.mergeSortIterative(e1000Reverse);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);


    	System.out.print("Array Size 1000 Nearly For Insertion Sort:");
    	start =System.nanoTime();
    	SortComparison.insertionSort(a1000Nearly);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Nearly For Selection Sort:");
    	start =System.nanoTime();
    	SortComparison.selectionSort(b1000Nearly);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Nearly For Quick Sort:");
    	start =System.nanoTime();
    	SortComparison.quickSort(c1000Nearly);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Nearly For Merge Sort Recursive:");
    	start =System.nanoTime();
    	SortComparison.mergeSortRecursive(d1000Nearly);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Nearly For Merge Sort Iterative:");
    	start =System.nanoTime();
    	SortComparison.mergeSortIterative(e1000Nearly);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);


    	System.out.print("Array Size 1000 Sorted For Insertion Sort:");
    	start =System.nanoTime();
    	SortComparison.insertionSort(a1000Sorted);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Sorted For Selection Sort:");
    	start =System.nanoTime();
    	SortComparison.selectionSort(b1000Sorted);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Sorted For Quick Sort:");
    	start =System.nanoTime();
    	SortComparison.quickSort(c1000Sorted);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Sorted For Merge Sort Recursive:");
    	start =System.nanoTime();
    	SortComparison.mergeSortRecursive(d1000Sorted);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    	System.out.print("Array Size 1000 Sorted For Merge Sort Iterative:");
    	start =System.nanoTime();
    	SortComparison.mergeSortIterative(e1000Sorted);
    	end=System.nanoTime();
    	difference=end-start;
    	System.out.println(difference);

    }

}


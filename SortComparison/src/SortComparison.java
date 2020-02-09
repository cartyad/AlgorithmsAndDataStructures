// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2020
 */

 class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
	 static double [] insertionSort (double a[]){
		 double temp;
		 for (int i = 1; i < a.length; i++) {
			 for(int j = i ; j > 0 ; j--){
				 if(a[j] < a[j-1]){
					 temp = a[j];
					 a[j] = a[j-1];
					 a[j-1] = temp;
				 }
			 }
		 }
		 return a;

		 //todo: implement the sort
	 }//end insertionsort
	
	    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){

    	double n = a.length;
    	for (int i = 0; i < n-1; i++)
    	{
    	int min_idx = i;
    	for (int j = i+1; j < n; j++)
    	if (a[j] < a[min_idx])
    	min_idx = j;
    	double temp = a[min_idx];
    	a[min_idx] = a[i];
    	a[i] = temp;
    	}
    	return a;

    }//end selectionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double a[]){
    	int low=0;
    	int high=a.length-1;
    	sort(a,low,high);
    	return a;
    	}
    static int partition(double arr[], int low, int high) 
    { 
        double pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                double temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        double temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    static void sort(double arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
    //end quicksort

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSortIterative (double a[]) {
    	int N = a.length;
    	double[] aux = new double[a.length];
    	for(int sz=1;sz<N; sz=sz+sz)
    	{
    		for(int lo=0;lo<N-sz; lo+=sz+sz)
    		{
    			merge(a,aux,lo,lo+sz-1,Math.min(lo+sz+sz-1, N-1));
    		}
    	}
    	return a;
    }//end mergesortIterative
    
    
    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) { //Top-Down
    	double [] aux = new double[a.length];
    	sort(a,aux,0,a.length-1);
    	return a;
    }  
    private static void sort(double[]a, double[]aux, int lo, int hi)
    {
    	if(hi<=lo) return;
    	int mid = lo + (hi-lo)/2;
    	sort(a,aux,lo,mid);
    	sort(a,aux,mid+1,hi);
    	merge(a,aux,lo,mid,hi);
    }
    private static void merge(double[]a,double[]aux,int lo,int mid, int hi )
    {
    	for(int k = lo; k<=hi; k++)
    	{
    		aux[k]=a[k];
    	}
    	int i=lo,j=mid+1;
    	for(int k=lo;k<=hi; k++)
    	{
    		if(i>mid) a[k]=aux[j++];
    		else if(j>hi) a[k] = aux[i++];
    		else if(less(aux[j],aux[i])) a[k]=aux[j++];
    		else a[k]=aux[i++];
    	}	
    }
    public static boolean less(double a, double b)
	{
		boolean isLess=false;
		if(a<b) isLess=true;
		return isLess;
	}
    //end mergeSortRecursive
    	
    public static void main(String[] args) {

        //todo: do experiments as per assignment instructions
    }

 }//end class


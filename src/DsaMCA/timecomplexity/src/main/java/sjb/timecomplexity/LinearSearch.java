package sjb.timecomplexity;

public class LinearSearch {

	    public int linearSearch(int array[], int element) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] = = element) {
	                return i;  
	            }
	        }
	        return -1;  
	    }

	    public static void main(String[] args) {
	        LinearSearch search = new LinearSearch();
	        int[] array = {5, 3, 8, 4, 2, 9};
	        int element = 8;

	        int result = search.linearSearch(array, element);
  
	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found");
	        }
	    }
	}

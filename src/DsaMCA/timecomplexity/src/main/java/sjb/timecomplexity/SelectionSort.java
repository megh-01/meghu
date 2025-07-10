package sjb.timecomplexity;

public class SelectionSort {
	public void selectionSort(int[] arr) {
		int n=arr.length;
				for(int i=0;i<n-1;i++) {
					int minindex=i;
					for(int j=i+1;j<n;j++) {
						if(arr[j]<arr[minindex])
							minindex=j;
					}
					int temp=arr[i];
					arr[i]=arr[minindex];
					arr[minindex]=temp;
				}
	}
	public static void main(String[]args) {
		SelectionSort sorter=new SelectionSort();
		int[]arr= {34,56,34,66,77};
		
		System.out.println("Before sorting");
		for(int num:arr) {
			System.out.println(num+" ");
		}
		sorter.SelectionSort(arr);
		
		System.out.println("\nAfter sorting");
		for(int num:arr) {
			System.out.println(num+" ");
		}
	}

}

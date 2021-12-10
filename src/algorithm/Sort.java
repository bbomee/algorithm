package algorithm;

public class Sort {

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1,6};
		int[] scan = new int[arr.length];
		//bubbleSort(arr);
		//selectionSort(arr);
		//insertionSort(arr);
		//mergeSort(arr, scan, 0, arr.length-1);
		quickSort(arr,0,arr.length-1);
	}
	
	//버블정렬
	public static void bubbleSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	//선택정렬
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int min = arr[i];
			int idx = i;
			for(int j = i+1; j < arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					idx = j;
				}
			}
			arr[idx] = arr[i];
			arr[i] = min;
			
			
		}
	}
	
	//삽입정렬
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int num = arr[i];
			for(int j = i-1; j >= 0; j--) {
				if(arr[j] > num) {
					arr[j+1] = arr[j];
					arr[j] = num;
				} else break;
				
			} 
			printArr(arr);
		}
	}
	
	//병합정렬
	public static void mergeSort(int[] arr, int[] scan, int start, int end) {
		if(start < end) {
			int mid = (start+end)/2;
			mergeSort(arr, scan, start, mid);
			mergeSort(arr, scan, mid+1, end);
			
			int front = start;
			int back = mid+1;
			int idx = front;
			
			while(front <= mid || back <= end) {
				if(front > mid) {
					scan[idx++] = arr[back++];
				} else if(back > end) {
					scan[idx++] = arr[front++];
				} else {
					if(arr[front] < arr[back]) {
						scan[idx++] = arr[front++];
					} else {
						scan[idx++] = arr[back++];
					}
				}
			}
			
			for(int i = start; i <= end; i++) {
				arr[i] = scan[i];
			}

		}
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		int pivot = start;
		int front = start;
		int back = end;
		
		while(front < back) {
			int min = 0;
			int max = 0;
			for(int i = pivot+1; i < end; i++) {
				if(arr[pivot] < arr[i]) {
					max = i;
					break;
				}
			}
			
			for(int i = end; i > start; i--) {
				if(arr[i] < arr[pivot]) {
					min = i;
					break;
				}
			}
			if(max < min) {
				int temp = arr[max];
				arr[max] = arr[min];
				arr[min] = temp;
			} else {
				int temp = arr[min];
				arr[min] = arr[pivot];
				arr[pivot] = temp;
				
				quickSort(arr, 0, min-1);
				quickSort(arr,min+1, end);
			}
		}
		
		
	}
	
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

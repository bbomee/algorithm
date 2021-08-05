package algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int target = 3;
		
		System.out.println(forBnSearch(arr, target));
		//System.out.println(RecursionBnSearch(arr, target, 0, arr.length-1));
	} 
	
	public static boolean forBnSearch(int[] arr, int target) {
		int length = arr.length;
		for(int i = 0; i < length; i++) {
			int middle = (i+arr.length)/2;
			if(middle == target) return true;
			else {
				if(middle < target) {
					i = middle+1;
				} else {
					length = middle-1;
				}
			}
		}
		return false;
	}
	
	/*public static boolean RecursionBnSearch(int[] arr, int target, int begin, int end) {
		boolean result = false;
		if(begin > end) {
			return result;
		} else {
			int middle = (begin + end)/2;
			if(target == arr[middle]) {
				result = true;
			} else if(target < arr[middle]) {
				result = RecursionBnSearch(arr, target, begin, middle-1);
			} else {
				result = RecursionBnSearch(arr, target, middle+1, end);
			}
		}
		return result;
	}*/
	
	   public static boolean RecursionBnSearch(int[] arr, int target, int begin, int end) {
		      if(begin > end) {
		         return false;
		      } else {
		         int middle = (begin + end)/2;
		         if(target == arr[middle]) {
		            return true;
		         } else if(target < arr[middle]) {
		              return RecursionBnSearch(arr, target, begin, middle-1);
		         } else {
		            return RecursionBnSearch(arr, target, middle+1, end);
		         }
		      }
		   }

}

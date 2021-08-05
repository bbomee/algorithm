package leetCode;

import java.util.Arrays;

public class MergeSorteArray {

	public static void main(String[] args) {
		int[] nums1 = {0};
		int m = 0;
		int[] nums2 = {1};
		int n = 1;
		merge(nums1, m, nums2, n);
		for(int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
	}
	
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i = m ; i < nums1.length ; i++){
            nums1[i] = nums2[i-m]; 
        }
        Arrays.sort(nums1);
    }

}

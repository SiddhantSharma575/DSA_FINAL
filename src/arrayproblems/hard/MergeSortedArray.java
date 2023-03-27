package arrayproblems.hard;

import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] nums1  = new int[n];
        for (int i=0; i<nums1.length; i++) {
            nums1[i] = scn.nextInt();
        }
        int[] num2 = new int[m];
        for (int i=0; i<num2.length; i++){
            num2[i] = scn.nextInt();
        }
        sortArray(nums1, num2, n,m);
    }

    private static void sortArray(int[] nums1, int[] nums2, int n, int m) {

        int ans[] = new int[m + n]; // Create an array to store the merged elements of nums1 and nums2.
        int i = 0; // Initialize pointer i to the start of nums1.
        int j = 0; // Initialize pointer j to the start of nums2.
        int k = 0; // Initialize pointer k to the start of ans.

        // Merge nums1 and nums2 into ans.
        while (i < m && j < n) { // While both nums1 and nums2 have unprocessed elements

            if (nums1[i] <= nums2[j]) { // If the current element of nums1 is less than or equal to the current element of nums2,
                ans[k] = nums1[i]; // Add the current element of nums1 to ans.
                i++; // Move the pointer i to the next element of nums1.

            } else { // Otherwise (if the current element of nums2 is less than the current element of nums1),
                ans[k] = nums2[j]; // Add the current element of nums2 to ans.
                j++; // Move the pointer j to the next element of nums2.
            }
            k++; // Move the pointer k to the next empty slot in ans.
        }

        // If there are any remaining elements in nums1 that haven't been merged yet, add them to ans.
        while (i < m) {
            ans[k] = nums1[i]; // Add the current element of nums1 to ans.
            i++; // Move the pointer i to the next element of nums1.
            k++; // Move the pointer k to the next empty slot in ans.
        }

        // If there are any remaining elements in nums2 that haven't been merged yet, add them to ans.
        while (j < n) {
            ans[k] = nums2[j]; // Add the current element of nums2 to ans.
            j++; // Move the pointer j to the next element of nums2.
            k++; // Move the pointer k to the next empty slot in ans.
        }

        // Copy the merged elements from ans back to nums1.
        for (int h = 0; h < ans.length; h++) {
            nums1[h] = ans[h];
        }
        }
    }


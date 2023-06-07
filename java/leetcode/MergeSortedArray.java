package algorithm.java.leetcode;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;


//88. 合并两个有序数组
public class MergeSortedArray {
    //快排
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0; j < n; i++, j++){
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }

    //顺序双指针遍历+创建新数组
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int r = 0;
        for(int i = 0, j = 0; i < m || j < n;){
            if(i == m){
                result[r] = nums2[j];
                j++;
            } else if (j == n) {
                result[r] = nums1[i];
                i++;
            }else if(nums1[i] <= nums2[j]){
                result[r] = nums1[i];
                i++;
            }else if(nums1[i] > nums2[j]){
                result[r] = nums2[j];
                j++;
            }
            r++;
        }
        for(int i = 0; i < result.length; i++){
            nums1[i] = result[i];
        }
    }

    //逆序双指针遍历
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m + n - 1; i >= 0; i--){
            if(m == 0){
                nums1[i] = nums2[n-1];
                n--;
            }else if(n == 0){
                nums1[i] = nums1[m-1];
                m--;
            }else if(nums1[m-1] >= nums2[n-1]){
                nums1[i] = nums1[m-1];
                m--;
            }else {
                nums1[i] = nums2[n-1];
                n--;
            }
        }
    }
}

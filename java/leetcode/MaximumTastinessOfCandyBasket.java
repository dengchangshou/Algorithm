package algorithm.java.leetcode;

//2517. 礼盒的最大甜蜜度
public class MaximumTastinessOfCandyBasket {
    public int maximumTastiness(int[] price, int k) {
        if(price.length <= 1){
            return price[0];
        }
        price = quickSort(price, 0, price.length - 1);
        int left = 0, right = price[price.length - 1] - price[0];
        while(left < right){
            int mid = (left + right + 1) / 2;
            if(check(price, k, mid)){
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }

    public boolean check(int[] price, int k, int tastiness) {
        int prev = Integer.MIN_VALUE / 2;
        int cnt = 0;
        for (int p : price) {
            if (p - prev >= tastiness) {
                cnt++;
                prev = p;
            }
        }
        return cnt >= k;
    }

    //快速排序
    public int[] quickSort(int[] arr, int left, int right){
        if(left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
        return arr;
    }

    public int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        while(left < right){
            while(left < right && arr[right] >= pivot){
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] <= pivot){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }
}

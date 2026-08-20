class Solution {
    static int mergesort(int[] arr, int s, int e) {
        if (s >= e) return 0;
        int mid = s + (e - s) / 2;
        int leftinversion = mergesort(arr, s, mid);
        int rightinversion = mergesort(arr, mid + 1, e);
        int mergeinversion = merge(arr, s, e, mid);
        return leftinversion + rightinversion + mergeinversion;
    }
    static int merge(int[] arr, int s, int e, int mid) {
        int leftlen = mid - s + 1;
        int rightlen = e - mid;
        int[] leftarr = new int[leftlen];
        int[] rightarr = new int[rightlen];
        int k = s;
        for (int i = 0; i < leftlen; i++) leftarr[i] = arr[k++];
        for (int j = 0; j < rightlen; j++) rightarr[j] = arr[k++];
        
        int i = 0, j = 0;
        k = s;
        int count = 0;
        while (i < leftlen && j < rightlen) {
            if (leftarr[i] <= rightarr[j]) {
                arr[k++] = leftarr[i++];
            } 
            else {
                arr[k++] = rightarr[j++];
                // All remaining elements in leftarr
                // form an inversion with rightarr[j-1]
                count += leftlen - i;
            }
        }
        while (i < leftlen) arr[k++] = leftarr[i++];
        while (j < rightlen) arr[k++] = rightarr[j++];
        return count;
    }
    public int inversionCount(int arr[]) {
        int s = 0;
        int e = arr.length - 1;

        return mergesort(arr, s, e);
    }
}
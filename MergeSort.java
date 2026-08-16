class Solution {
    static void merge(int[] arr , int s , int e , int mid){
        int leftlen = mid-s+1;
        int rightlen = e-mid;
        int[] leftarr = new int[leftlen];
        int[] rightarr = new int[rightlen];
        //copy the left half of arr
        int k = s;
        for(int i=0;i<leftlen;i++){
            leftarr[i] = arr[k];
            k++;
        }
        //copy the right half of arr
        k = mid+1;
        for(int j=0;j<rightlen;j++){
            rightarr[j] = arr[k];
            k++;
        }
        int i=0,j=0;
        k=s;
        while(i<leftlen&&j<rightlen){
            if(leftarr[i] < rightarr[j]){
                arr[k] = leftarr[i];
                i++;k++;
            }
            else{
                arr[k] = rightarr[j];
                j++;
                k++;
            }
        }
        //left array is full
        while(j<rightlen){
            arr[k] = rightarr[j];
                j++;k++;
        } 
        while(i<leftlen){
            arr[k] = leftarr[i];
            i++;k++;
        }
    }
    public void mergeSort(int arr[], int l, int r) {
        // divide and conquer O(nlogn)
        int s = l ; int e = r;
        if(s>=e) return;
        //break 2 halves
        int mid = (s+e)/2;
        //left part sort
        mergeSort(arr,s,mid);
        //right part sort
        mergeSort(arr,mid+1,e);
        // merge both halves
        merge(arr,s,e,mid);
    }
}
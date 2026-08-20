class Solution { 
    static int mergesort(int[] arr , int s , int e){
        if(s>=e) return 0;
        int mid = (s+e)/2;
        int leftinversion = mergesort(arr,s,mid);
        int rightinversion = mergesort(arr,mid+1,e);
        int mergeinversion = merge(arr,s,e,mid);
        return leftinversion+rightinversion+mergeinversion;
    }
    static int merge(int[] arr, int s , int e , int mid){
        // leftarray and right array create
        int leftlen = mid-s+1;
        int rightlen = e-mid;
        int leftarr = new int[leftlen];
        int rightarr = new int[rightlen];
        int k = s; // main array index
        for(int i=0;i<leftlen;i++){
            leftarr[i] = arr[k];
            k++;
        }
        // k = mid+1;
        for(int j=0;j<rightlen;j++){
            rightarr[j] = arr[k];
            k++;
        }
        int i = 0 , j = 0 ;
        k = s;
        while(i<leftlen && j < rightlen){
            if(leftarr[i] <= rightarr[j]){
                arr[k] = leftarr[i];
                k++;i++;
            }
            else{
                // leftarr[i] > rightarr[j]
                // merge logic 
                arr[k] = rightarr[j];
                j++;k++;
                //inversion logic
                int inversion = leftlen-i;
            }
        }
    }
    public int inversionCount(int arr[]) {
        // code here
        int s = 0;
        int e = arr.length-1;
        return mergesort(arr,s,e);
    }
}
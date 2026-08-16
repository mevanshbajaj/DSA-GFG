class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        int s = low ; int e = high;
        if(s>=e) return;
        //partitioning
        int pivot = partition(arr,s,e);
        //left part
        quickSort(arr,s,pivot-1);
        quickSort(arr,pivot+1,e);
        
    }
    private int partition(int[] arr, int low, int high) {
        int s = low ; int e = high;
        // choose pivot element -> starting element
        int pivotele = arr[s];
        //iss pivot ele ko sahi jagah rkhdo
        int count = 0;
        for(int i=s+1;i<=e;i++){
            if(pivotele >= arr[i]) count++;
        }
        // place pivotele 
        int corrpos = s + count;
        //swap pivot element with curr element
        int temp = arr[corrpos];
        arr[corrpos] = arr[s];
        arr[s] = temp;
        // ab bs left and right me sahi place krna h
        int i = low,j = high;
        while(i<corrpos && j>corrpos){
            // left part me check kiaa
            while(arr[i]<=pivotele) i++;
            while(arr[j]>pivotele) j--;
            // swap
            if(i<corrpos && j>corrpos){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            }
        }
        return corrpos;
    }
}
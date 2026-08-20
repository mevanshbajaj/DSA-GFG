class Solution {
    public int inversionCount(int arr[]) {
        // code here
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                    if(arr[i] > arr[j]) count++;
            }
        }
        return count;
    }
}
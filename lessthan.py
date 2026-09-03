class Solution:

    def lessThan(self, arr, k):
    #code here
        ans = []
        for i in arr:
            if i < k:
                ans.append(i);
        return ans

class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        for(int i=0;i<n-1;i++) {
            int small=Math.min(arr[0]+k,arr[i+1]-k);
            int large=Math.max(arr[n-1]-k,arr[i]+k);
            if(small<0) {
                continue;
            }
            ans=Math.min(ans,large-small);
        }
        return ans;
    }
}

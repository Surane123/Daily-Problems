class Solution {
    int maxIndexDiff(int[] arr) {
        // code here
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=arr[0];
        right[n-1]=arr[n-1];
        for(int i=1;i<n;i++) {
            left[i]=Math.min(left[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--) {
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int i=0;
        int j=0;
        int max=-1;
        while(i<n && j<n) {
                if(left[i]<=right[j]) {
                max=Math.max(max,j-i);
                    j++;}
                else {
                    i++;
                }    
        }
        return max;
    }
}

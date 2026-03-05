class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int match=0;
        for(int i=0;i<n;i++)
        {
            int digit=s.charAt(i)-'0';
            if(digit==i%2)
            {
                match++;
            }
        }
        return Math.min(match,n-match);
    }
}

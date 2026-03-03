class Solution {
    public String maximumXor(String s, String t) {
        
        int n = s.length();
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (count1 > 0) {
                    result.append('1');
                    count1--;
                } else {
                    result.append('0');
                    count0--;
                }
            } else {
                if (count0 > 0) {
                    result.append('1');
                    count0--;
                } else {
                    result.append('0');
                    count1--;
                }
            }
        }
        return result.toString();
    }
}

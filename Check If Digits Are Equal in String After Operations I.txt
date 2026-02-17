
class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2)
        {
            String nextstr="";
       for(int i=0;i<s.length()-1;i++)
       {
          int k=(s.charAt(i)-'0')+(s.charAt(i+1)-'0');
          k=Math.floorMod(k,10);
          nextstr+=k;
       }
       s=nextstr;
        }
          int d1=s.charAt(0)-'0';
          int d2=s.charAt(1)-'0';
          if(d1==d2)
          {
            return true;
          }
          return false;
    }
}

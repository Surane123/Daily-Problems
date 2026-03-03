class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result=new ArrayList<>();
        for(int h=0;h<12;h++)
        {
            for(int m=0;m<60;m++)
            {
              int hourbit=Integer.bitCount(h);
              int minbit=Integer.bitCount(m);
              if(hourbit+minbit==turnedOn)
              {
                 String time = String.format("%d:%02d", h, m);
                 result.add(time);
              }
            }
        }
        return result;
    }
}

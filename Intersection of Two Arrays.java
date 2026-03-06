class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int index=0;
        HashSet<Integer> result=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);}
        for(int i=0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i]))
            result.add(nums2[i]);
        }
        int[] res=new int[result.size()];
        for(int val:result)
        {
          res[index]=val;
          index++;
        }
        return res;
    }
}

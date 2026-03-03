class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);}
        private int dfs(TreeNode root,int currentValue)
        {
          if(root==null) return 0;
          currentValue=currentValue*2+root.val;
        if(root.left==null&&root.right==null)
        {
            return currentValue;
        }
        int leftSum=dfs(root.left,currentValue);
        int rightSum=dfs(root.right,currentValue);
        return leftSum + rightSum;
        }
}

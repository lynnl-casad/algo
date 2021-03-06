package study.interview.jiuzhang;

import LeetCode.CommonUtils.BuildTreeFromArrayUtil;
import LeetCode.round1.common.TreeNode;

/**
 * 170608
 * https://mp.weixin.qq.com/s?__biz=MzA5MzE4MjgyMw==&mid=2649456518&idx=1&sn=1357066e1910ce736804fef716511af1&chksm=887e118ebf0998986ff9455c00e7dd76a2f20ddb76719f5787da1958938cc53cd5cde0838c97&mpshare=1&scene=1&srcid=03176Lr2wNzzdXnbczqd5Rt5&key=5657e61c2ec7753dd17978d58491302bd6abe854dfb2438ad09c292e55b6717bd174d5bb9f49aab3eb7edfb7b1fbcd1383bd01894017b5da7563d754126cecdd8ffbcc02c72c99607f8f7e342bd15cc7&ascene=0&uin=MTUyMzg3NjAwMA%3D%3D&devicetype=iMac+MacBookAir7%2C1+OSX+OSX+10.12.3+build(16D32)&version=12020010&nettype=WIFI&fontScale=100&pass_ticket=0AiIToHJN8yqpuqRAsA5PaaQMJr8KtvlnZ2EqkX0zx%2BEZweRvHKyF%2ByjmycpUbVn
 * http://www.cnblogs.com/zcy-backend/p/6734304.html
Given a binary tree, find the subtree with maximum sum. Return the root of the subtree.
Example:
    1
   / \
  9   6
     / \
   -15  7
Return Node 9.
 */
public class Ama9Ti_MaximumSubtree {
	private int max = 0;
	private TreeNode res = null;
	public TreeNode find(TreeNode root){
		helper(root);
		return res;
	}
	
	public int helper(TreeNode root){
		if(root == null)
			return 0;
		int left = helper(root.left);
		int right = helper(root.right);
		int sum =root.val + left + right;
		if(sum > max){
			res = root;
			max = sum;
		}
		return root.val + left + right;
	}
	
	public static void main(String[] args) {
		TreeNode root1 = BuildTreeFromArrayUtil.build(new Integer[]{1,9,6,null,null,-15,7,null,null,null,null});
		Ama9Ti_MaximumSubtree a = new Ama9Ti_MaximumSubtree();
		System.out.println(a.find(root1).val);
	}
}

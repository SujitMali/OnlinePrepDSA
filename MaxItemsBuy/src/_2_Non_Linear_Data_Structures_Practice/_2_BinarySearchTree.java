package _2_Non_Linear_Data_Structures_Practice;

public class _2_BinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(3);
        root.left = leftChild;
        root.right = rightChild;

    }
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
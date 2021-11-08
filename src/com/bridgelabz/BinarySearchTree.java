package com.bridgelabz;

/**
 * Binary search tree is to insert the new node where it stores to the left side if its lesser
 * or else it will go to the right side
 */
public class BinarySearchTree {
    TreeNode root;
    public void insert(int data) {
        root = insertIntoTheTree(root , data);
    }

    /**
     * Inserts node in to the tree
     * @param node
     * @param data
     * @return node
     */
    private TreeNode insertIntoTheTree(TreeNode node, int data) {
        if(node == null){
            return new TreeNode(data);
        }else if(data < node.data){
            //goes left to the root
            node.left = insertIntoTheTree(node.left , data);
        }else{
            //goes right side to the root
            node.right = insertIntoTheTree(node.right , data);
        }
        return node;
    }

    /**
     * Create a TreeNode
     */
    class TreeNode{
        //class level variables
        int data;
        TreeNode left,right;

        /**
         * Parameterised constructor to create a new node
         * @param data
         */
        TreeNode(int data){
            this.data = data;
        }
    }
}

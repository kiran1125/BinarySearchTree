package com.bridgelabz;

public class binarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(56);
        binarySearchTree.insert(30);
        binarySearchTree.insert(70);
        binarySearchTree.insert(40);
        binarySearchTree.insert(22);
        binarySearchTree.insert(11);
        binarySearchTree.insert(16);
        binarySearchTree.insert(3);
        binarySearchTree.insert(90);
        binarySearchTree.insert(65);
        binarySearchTree.insert(65);
        binarySearchTree.insert(63);
        binarySearchTree.insert(67);
        System.out.println(binarySearchTree.search(63));
    }
}

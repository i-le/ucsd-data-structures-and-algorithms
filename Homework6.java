package cse41321.homework;

import cse41321.containers.BinaryTree;

public class Homework6 {
    // a)
    public static int countLeaves(BinaryTree tree) {
        // possible outcome of no tree
        if (tree == null) {
            return 0;
        }
        else if (tree.getRoot().getLeft() == null && tree.getRoot().getRight() == null) {
            // count node if theres one
            return 1;
        }
        else {
            return countLeaves(tree.getRoot().getLeft()) + countLeaves(tree.getRoot().getRight());
        }
    }

    // b)
    public static int countNonLeaves(BinaryTree tree) {
        if (tree == null) {
            // base case
            return 0;
        }
        else (tree.getRoot().getLeft() == null && tree.getRoot().getRight() == null) {
            // if root is not null and its one of its child is also not null
            return 1 + countNonLeaves(tree.getRoot().getLeft()) + countNonLeaves(tree.getRoot().getRight());
        }
    }

    // c)
    public static int getHeight(BinaryTree tree) {
        if (tree == null) {
            return 0; // base case
        }
        else {
            // if tree is not null, return the max of the left and right heights
            return (Math.max(getHeight(tree.getRoot().getLeft()), getHeight(tree.getRoot().getRight())));
        }

    }

    // d)
    public static void printPreOrder(BinaryTree tree) {
            // printout data of root node
            System.out.println(tree.getRoot().getData());
            //printout the left sub tree
            printPreOrder(tree.getRoot().getLeft());
            //print out the right sub tree
            printPreOrder(tree.getRoot().getRight());
        }

    // e)(1 point)public static void printInOrder(BinaryTree tree)

    public static void printInOrder(BinaryTree tree) {
        // print out left nodes
        printInOrder(tree.getRoot().getLeft());
        // print out nodes in order
        System.out.println(tree.getRoot().getData());
        // print out right nodes
        printInOrder(tree.getRoot().getRight());
    }

    // f)(1 point)public static void printPostOrder(BinaryTree tree)
    public static void printPostOrder(BinaryTree tree){
        // print out left nodes
        printInOrder(tree.getRoot().getLeft());
        // print out right nodes
        printInOrder(tree.getRoot().getRight());
        // print out nodes in post order
        System.out.println(tree.getRoot().getData());
    }

    // g)(3points)public static voidremoveLeaves(BinaryTree tree)
    public static void removeLeaves(BinaryTree tree) {
        if (tree.getRoot().getLeft() != null) {
                removeLeaves(tree.getRoot().getLeft());
            }
        if (tree.getRoot().getRight() != null) {
            removeLeaves(tree.getRoot().getRight());
        }
    }
}

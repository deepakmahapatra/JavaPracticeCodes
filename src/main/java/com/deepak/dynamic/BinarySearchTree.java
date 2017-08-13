//package com.deepak.dynamic;
//
//import javax.xml.soap.Node;
//
//public class BinarySearchTree {
//
//
//    NodeTree root;
//    public BinarySearchTree() {
//        root = null;
//    }
//    public void insert(int key) {
//        root = insertRec(root, key);
//    }
//
//    public NodeTree insertRec(NodeTree root, int key){
//
//
//    /* A recursive function to insert a new key in BST */
//
//        /* If the tree is empty, return a new node */
//            if (root == null) {
//                root = new NodeTree(key);
//                return root;
//            }
//
//        /* Otherwise, recur down the tree */
//            if (key < root.value)
//                root.leftchild = insertRec(root.leftchild, key);
//            else if (key > root.value)
//                root.rightchild = insertRec(root.rightchild, key);
//
//        /* return the (unchanged) node pointer */
//            return root;
//        }
//
//    public void inorder()  {
//        inorderRec(root);
//    }
//    public void inorderRec(NodeTree root) {
//            if (root!=null) {
//                inorderRec(root.leftchild);
//                System.out.println(root.value);
//                inorderRec(root.rightchild);
//            }
//        }
//
//
//
//    public static void main(String[] args){
//
//        BinarySearchTree tree1=new BinarySearchTree();
//
//        tree1.insert(50);
//        tree1.insert(45);
//        tree1.insert(90);
//        tree1.insert(48);
//        tree1.insert(55);
//        tree1.insert(65);
//        tree1.insert(10);
//        tree1.inorder();
//
//    }
//}

package com.deepak.dynamic;

public class AVT {

    private NodeTree root;

    /* Constructor */
    public AVT() {
        root = null;
    }

    /* Function to check if tree is empty */
    public boolean isEmpty() {
        return root == null;
    }

    /* Make the tree logically empty */
    public void makeEmpty() {
        root = null;
    }

    /* Function to insert data */
    public void insert(int data) {
        root = insert(data,root);
    }

    private int height(NodeTree t) {
        return t == null ? -1 : t.height;
    }

    /* Function to max of left/right node */
    private int max(int lhs, int rhs) {
        return lhs > rhs ? lhs : rhs;
    }


    private NodeTree insert(int data, NodeTree root){
        if(root==null){
            root.key=data;

        }

        if (data<root.key){
            root=insert(data,root.left);
            if(height(root.left)-height(root.right)>=2){
                if(data<root.left.key){
                    root=rotateleftchild(root);
                }
                else{
                    root=doubleleftchild(root);
                }
            }
        if(data>root.key){
                root=insert(data,root.right);
                if(height(root.left)-height(root.right)>=2){
                    if(data>root.left.key){
                        root=rotaterightchild(root);
                    }
                    else{
                        root=doublerightchild(root);
                    }
                }
            }

        }
        root.height=max(root.left.height,root.right.height)+1;
        return root;
    }


    private NodeTree rotateleftchild(NodeTree node){

        NodeTree left= root.left;
        root.left=root.right;
        left.right=root;

        node.height=max(height(node.left),height(node.right))+1;
        left.height=max(height(left.left),height(left.right))+1;
        return left;


    }
    private NodeTree rotaterightchild(NodeTree node){
        NodeTree right= root.right;
        root.left=right.left;
        right.left=root;

        node.height=max(height(node.left),height(node.right))+1;
        right.height=max(height(right.left),height(right.right))+1;
        return right;


    }
    private NodeTree doubleleftchild(NodeTree node){

        node.left = rotaterightchild( node.left );
        return rotateleftchild( node );

    }
    private NodeTree doublerightchild(NodeTree node){
    return  node;
    }

}

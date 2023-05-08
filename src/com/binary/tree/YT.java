package com.binary.tree;

public class YT {
    static  class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left= null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx = -1;

        //Build Tree
        public static Node buildTree(int[] node){
            ++idx;
            if (node[idx] == -1){
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }
    }


    //preorder traversel
    public static void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //in-order traversel
    public static void inorderTraversel(Node root){
        if (root == null){
            return;
        }
        inorderTraversel(root.left);
        System.out.print(root.data+" ");
        inorderTraversel(root.right);
    }

    public static void postOrder(Node root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int nodes[] = {2,4,5,1,3,6};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorderTraversel(root);
        System.out.println();
        postOrder(root);

    }
}

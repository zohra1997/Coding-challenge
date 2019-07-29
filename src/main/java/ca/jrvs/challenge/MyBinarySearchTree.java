package ca.jrvs.challenge;

import java.util.Stack;

import static java.lang.System.clearProperty;
import static java.lang.System.exit;

/**
 * Binary search tree implementation
 */

public class MyBinarySearchTree {
    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value= value;
            this.right= null;
            this.left = null;

        }
    }

    private Node root;
    public MyBinarySearchTree(){
        root = null;
    }
    public Node getRoot(){
      return root;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public int size (){
        Node current  = root;
        int size = 0;
        Stack<Node> stack = new Stack<>();
        while (current !=null|| !stack.isEmpty()){
            if (current!=null) {
                stack.push(current);
                current = current.left;

            }else{
                size ++;
                current= stack.pop();
                current=current.right;
            }
        }
        return size;
    }

    public void Inorder (Node node){
        if (node == null) {
           return;
        }
        Inorder(node.left);
        System.out.println(node.value+" ");
        Inorder(node.right);
    }
    public void PreOrder(Node node){
        if (node ==null)
            return;
        System.out.println(node.value+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public void postOrder(Node node){
        if (node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
    }
    void printPostorder()  {     postOrder(root);  }
    void printInorder()    {     Inorder(root);   }
    void printPreorder()   {     PreOrder(root);  }


    public static void main(String[] args)
    {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is \n ");
        tree.printPostorder();
        System.out.println(tree.size());
    }

}

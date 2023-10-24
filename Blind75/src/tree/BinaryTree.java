package tree;

import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        int value ;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }

    }

    public BinaryTree(){

    }
    private Node root;

    //insert elements
      public void populate(Scanner scanner){
          System.out.println("enter the root node value");
          int value = scanner.nextInt();
          root = new Node(value);
          populate(scanner , root);

      }

      private void populate(Scanner scanner , Node node){
          System.out.println("Do you want to enter left of "+ node.value);
          boolean left = scanner.nextBoolean();
         if(left){
            System.out.println("Enter the value of the left of "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner , node.left);
         }

          System.out.println("Do you want to enter right of "+ node.value);
          boolean right = scanner.nextBoolean();
          if(right){
              System.out.println("Enter the value of the left of "+node.value);
              int value = scanner.nextInt();
              node.right = new Node(value);
              populate(scanner , node.right);
          }


      }

     public void display(){
          display(root , "");
     }
      private static void display(Node node , String ident ){
        if(node == null){

            return;
        }
        System.out.println(ident + node.value);
        display(node.left , ident+"\t");
          display(node.right , ident+"\t");
      }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
    }
}

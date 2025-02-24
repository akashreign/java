import java.util.*;
public class tree {
     int val;
     tree left;
     tree right;

     tree(int x) {
          val = x;
     }
}

 class preorder{

     void preorder(tree root)
     {
          if(root==null)
          {
               return;
          }

          System.out.print(root.val+" ");
          preorder(root.left);
          preorder(root.right);
     }

     void inorder(tree root)
     {
         if(root==null)
         {
             return;

         }

         inorder(root.left);
         System.out.print(root.val+" ");
         inorder(root.right);
     }
     void postorder(tree root)
     {
         if(root==null)
         {
             return;
         }

         postorder(root.left);
         postorder(root.right);
         System.out.print(root.val+" ");
     }

      public static void main(String[] args) {

           tree root= new tree(1);
           root.left=new tree(2);
           root.right=new tree(3);
           root.left.left=new tree(4);
           root.left.right=new tree(5);


           preorder p=new preorder();

           System.out.println("preorder is :");
           p.preorder(root);
           System.out.println();
           System.out.println("inorder is : ");
           p.inorder(root);
           System.out.println();
           System.out.println("postorder is:");
           p.postorder(root);

      }


}

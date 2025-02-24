public class tree_traversal {
    int val;
    tree_traversal left;
    tree_traversal right;

    tree_traversal(int x)
    {
        val=x;

    }
}

class inorder{
    void inorder(tree_traversal root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.val);
        inorder(root.right);
    }

}
class preeorder{
    void preeorder(tree_traversal root)
    {
        if(root==null)
        {
            return;
        }

        System.out.print(root.val);
        preeorder(root.left);
        preeorder(root.right);


    }
}

class postorder{
    void postorder(tree_traversal root)
    {
        if(root==null)
        {
            return;
        }


        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val);

    }

    public static void main(String[] args) {
        tree_traversal root=new tree_traversal(1);
        root.left=new tree_traversal(2);
        root.right=new tree_traversal(3);
        root.left.left=new tree_traversal(4);
        root.left.right=new tree_traversal(5);

        inorder i=new inorder();
        i.inorder(root);
        System.out.println();

        preeorder p=new preeorder();
        p.preeorder(root);
        System.out.println();

        postorder po=new postorder();
        po.postorder(root);

    }

}







public class tree_search {
    int val;
    tree_search left;
    tree_search right;

    tree_search(int x)
    {
        val=x;

    }

}
class sarch{

   boolean  sarch(tree_search root,int target)
    {
        if(root==null )
        {
            System.out.println(target+ "not found");
            return false;
        }

        else if(root.val==target)
        {
            System.out.println(target+ "found");
            return true;
        }

        boolean foundLeft = sarch(root.left, target);
        if (foundLeft) {
            return true;
        }

        // Search in right subtree
        boolean foundRight = sarch(root.right, target);
        if (foundRight) {
              return true;
        }

        return false;

    }

    public static void main(String[] args) {
        tree_search root=new tree_search(1);
        root.left=new tree_search(2);
        root.right=new tree_search(3);
        root.left.left=new tree_search(4);
        root.left.right=new tree_search(5);

        sarch s=new sarch();
        s.sarch(root,3);

    }

}

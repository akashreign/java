 class search_tree {
      int val;
      search_tree left;
      search_tree right;

      search_tree(int ele)
      {
          val=ele;
      }

}

class search{
    void search(search_tree root,int target)
    {
        if(root==null)
        {

            return;
        }
        else if(root.val==target)
        {
            System.out.println("found");
            return;
        }

        search(root.left,target);
        search(root.right,target);

    }

    public static void main(String[] args) {
        search_tree root=new search_tree(1);
        root.left=new search_tree(2);
        root.right=new search_tree(3);
        root.left.left=new search_tree(4);
        root.left.right=new search_tree(5);

        search s=new search();
        s.search(root,3);
        s.search(root,6);
    }


}



public class BinaryTree
{    
    int a[]={57,78,56,92,43,75,49,87}; 
    Node root=new Node(a[0]);
    Node current=root;
    
    public BinaryTree()
    {
        for(int i=1;i<a.length;i++)
        {
            Node n=new Node(a[i]);
            add(n,current);
        }
    }
            
    private class Node
    {
        int value;
        
        Node left;
        Node right;
        
        public Node()
        {
            value=0;
            left=null;
            right=null;
        }
        public Node(int data)
        {
            value=data;
            left=null;
            right=null;
        }
        public int getValue()
        {
            return value;
        }
    }
    /*
    public void add(Node n, Node cur)
    {
      if(n.value<=cur.value)
      { 
        if(cur.left==null)      
            cur.left=new Node(n.value);
        else
            add(n,cur.left);
      }
      else
      {
          if(cur.right==null)
            cur.right=new Node(n.value);
          else
            add(n,cur.right);
      }                        
    }
    */
   
    public void add(Node n){
        if(root == null){
            root = n;
            return;
        }
        root = add(root, n);
    }
    private Node add(Node curr, Node n){
        if(curr == null)
            return n;
        if(n.value <= curr.value){
            curr = add(curr.left, n);
            return curr;
        }
        curr = add(curr.right, n);
        return curr;
    }
    
    public void printValues(Node cur)
    {
        if(cur.left==null)
        {
            System.out.print(cur.value+" ");            
            return;
        }
        else       
        {
            printValues(cur.left);
            System.out.print(cur.value+" ");
            
        }                
    }
}
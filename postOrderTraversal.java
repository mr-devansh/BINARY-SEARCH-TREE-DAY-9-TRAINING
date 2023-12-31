public class postOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }

    }

    static class BinaryTree{
        static int idx=-1;

        public static void postOrder(Node root){
            if(root==null){
                return ;    
            }
            postOrder(root.left);
            postOrder(root.right);
                        System.out.print(root.data+" ");

        }

        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }
    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,-5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        tree.postOrder(root);


    }
}



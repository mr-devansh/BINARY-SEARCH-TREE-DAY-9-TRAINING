import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {
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

        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
q.add(root);
q.add(null);
while(!q.isEmpty()){
    Node curr = q.remove();
    if(curr == null){
        System.out.println();
        if(q.isEmpty()){
            break;
        }
        else{
            q.add(null);
        }
    }
    else{
        System.out.print(curr.data+" ");
        if(curr.left!=null){
            q.add(curr.left);
        }
        if(curr.right!=null){
            q.add(curr.right);
        }
    }
}

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
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        tree.levelOrder(root);


    }
}





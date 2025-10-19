import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    Node root;

    public void display(){
        display(this.root);
    }

    private void display(Node root){
        if(root == null) return;

        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }

    public void insert(int data){
        this.root = insert(this.root, data);
    }

    private Node insert(Node root, int data){
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if(root.data > data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }

        return root;
    }

    public boolean search(int data){
        return search(this.root, data);
    }

    private boolean search(Node root, int data){
        if(root == null) return false;
        if(root.data == data) return true;

        if(root.data > data){
            return search(root.left, data);
        }else{
            return search(root.right, data);
        }
    }

    public void remove(int data){
        this.root = remove(this.root, data);
    }

    private Node remove(Node root, int data){
        if(root == null) return null;

        if(root.data > data){
            root.left = remove(root.left, data);
        } else if (root.data < data) {
            root.right = remove(root.right, data);
        }else{
            if(root.left == null && root.right == null) return null;

            if(root.right != null){
                root.data = successor(root);
                root.right = remove(root.right, root.data);
            }else{
                root.data = predecessor(root);
                root.left = remove(root.left, root.data);
            }

        }

        return root;
    }

    private int successor(Node root){
        root = root.right;
        while(root.left != null){
            root = root.left;
        }

        return root.data;
    }

    private int predecessor(Node root){
        root = root.left;
        while(root.right != null){
            root = root.right;
        }

        return root.data;
    }

    public void bfs() {
        if (this.root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

}

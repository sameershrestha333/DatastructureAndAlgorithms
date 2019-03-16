package playground.algo.praticaldatastructuresAndAlgorithms.stack.bst;

public class BST {
    private Node root;

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }

        }


    }

    public int findSmallest() {
        if (isEmpty())
            return 0;
        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            current = current.leftChild;
        }
        return parent.data;
    }

    public int findLargest() {
        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            current = current.rightChild;
        }
        return parent.data;
    }

    public void delete(int data) {
        Node current = root;
        Node parent;
        while (current != null) {
            parent = current;
            if (data < current.data) {
                current = current.leftChild;
                if (current.data == data) {
                    parent.leftChild = null;
                    return;
                }
            } else {
                current = current.rightChild;
                if (current.data == data) {
                    parent.rightChild = null;
                    return;
                }
            }
        }

    }
}


class Node {
    int data;
    Node leftChild, rightChild;

    public Node(int data) {
        this.data = data;
    }
}
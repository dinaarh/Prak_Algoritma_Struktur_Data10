package P14;

public class BinaryTree10 {
    Node10 root;
    int size;

    public BinaryTree10() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int inputData) {
        if (isEmpty()) {
            root = new Node10(inputData);
        } else {
            Node10 current = root;
            while (true) {
                if (inputData < current.data) {
                    if (current.left == null) {
                        current.left = new Node10(inputData);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (inputData > current.data) {
                    if (current.right == null) {
                        current.right = new Node10(inputData);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    System.out.println("Data is already exist");
                    break;
                }
            }
        }
    }

    boolean find(int inputData) {
        boolean result = false;
        Node10 current = root;
        while (current != null) {
            if (current.data == inputData) {
                result = true;
                break;
            } else if (inputData < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node10 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node10 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node10 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node10 getSuccessor(Node10 del) {
        Node10 successor = del.right;
        Node10 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node10 parent = root;
        Node10 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data");
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node10 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}

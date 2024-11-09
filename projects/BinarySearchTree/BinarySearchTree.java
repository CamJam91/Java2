//Cameron Murphy CIS 2217 R01


public class BinarySearchTree{
    private Node root;

        //constructors
    /**
     * constructs empty tree
     */
    public BinarySearchTree(){
        root = null;
    }

        //methods
    /**
     * adds new node into tree after comparing values
     * @param obj
     */
    public void add(Comparable obj){
        Node newNode = new Node();
        newNode.data = obj;
        newNode.left = null;
        newNode.right = null;
        if (root == null) {root = newNode;}
        else {root.addNode(newNode);}

    }

    /**
     * returns if a node value exists
     * @param obj
     * @return
     */
    public boolean find(Comparable obj){
        Node current = root;
        while (current != null){
            int d = current.data.compareTo(obj);
            if (d == 0) {return true;}
            else if (d <0) {current = current.left;}
            else {current = current.right;}
        }
        return false;
    }

    public void remove(Comparable obj){
        Node removeMe = root;
        Node parent = null;
        boolean found = false;

        //find node to be removed
        while (!found && removeMe != null){
            int d = removeMe.data.compareTo(obj);
            if (d == 0) {found = true;}
            else{
                parent = removeMe;
                if (d > 0) {removeMe = removeMe.left;}
                else {removeMe = removeMe.right;}
            }
        }

        if (!found) {return;} //node does not exist
            //node exists
            //a child  or both is empty

            if (removeMe.left == null || removeMe.right == null){
                Node newChild;
                if (removeMe.left == null){
                    newChild = removeMe.right;
                }else{
                    newChild = removeMe.left;
                }
                if (parent == null){
                    root = newChild;
                 }else if (parent.left == removeMe){
                    parent.left = newChild;
                }else{
                    parent.right = newChild;
                }
                return;
            }

            //neither subtree is empty
                //find the smallest element in the right subtree: take a right then find the leftmost node
            Node smallestParent = removeMe; 
            Node smallest = removeMe.right;
            while (smallest.left != null){
                smallestParent = smallest;
                smallest = smallest.left;
            }

            //smallest contains smallest child to the right subtree
            //move contents, unlink child

            removeMe.data = smallest.data;
            if (smallestParent.right == removeMe){
                smallestParent.right = smallest.right;
            }else{
                smallestParent.left = smallest.right;
            }
        }

        /**
         * prints the contents of the tree in sorted order
         */
        public void print(){
            print(root);
            System.out.println();
        }

        /**
         * prints a node and all of its descendants in sorted order
         * @param parent
         */
        private static void print(Node parent){
            if (parent == null) {return;}
            print(parent.left);
            System.out.print(parent.data + " ");
            print(parent.right);
        }

        protected Node getRoot(){
            return root;
        }
        

    class Node{
        public Comparable data;
        public Node left;
        public Node right;

        public void addNode(Node newNode){
            int comp = newNode.data.compareTo(data);
            if (comp < 0){
                if (left == null) {left = newNode;}
                else {left.addNode(newNode);}
            }
            else if (comp > 0){
                if (right == null) {right = newNode;}
                else {right.addNode(newNode);}
            }
        }
    }
}
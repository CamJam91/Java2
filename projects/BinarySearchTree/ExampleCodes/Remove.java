class Remove{
    public void remove(Comparable obj){
        //find node to be removed
        Node toBeRemoved = root; //start at root node
        Node parent = null; //used if node is not found
        boolean found = false;
        while (!found && toBeRemoved != null){
            int d = toBeRemoved.data.compareTo(obj); //use compareTo to compare obj data to node data
            if (d == 0) {found = true;} //if compareTo == 0, then they are the same, we've found our node
            else{ //value has not been found
                parent = toBeRemoved; //make node the parent to we can search children
                if (d > 0) {toBeRemoved = toBeRemoved.left;} //recursively search left child
                else {toBeRemoved = toBeRemoved.right;} //recusrively search right child
                }
            }
        if (!found) {return;} //the node does not exist in tree, abort method

        if (toBeRemoved.left == null || toBeRemoved.right == null){
            Node newChild;
            if (toBeRemoved.left == null){
                newChild = toBeRemoved.right;
            }else{
                newChild = toBeRemoved.left;
            }

            if (parent == null){
                root = newChild;
            }else if (parent.left == toBeRemoved){
                parent.left = newChild;
            }else{
                parent.right = newChild;
            }
            return;
        }
    }
}
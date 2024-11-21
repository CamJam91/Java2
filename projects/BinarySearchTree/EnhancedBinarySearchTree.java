import java.util.ArrayList;

public class EnhancedBinarySearchTree extends BinarySearchTree{
    
        //constructor
    EnhancedBinarySearchTree(){
        super();
    }

   @Override 
   /**
    * This helper method checks for a null root and passes data to each print method
    */
   public void print(){
    Node root = super.getRoot();
    if (root == null) {
        System.out.printf("This Enhanced Binary Tree is empty");
        return;
    }
    System.out.printf("Inorder: ");
    inorderPrint(root);
    System.out.printf("\nPreorder: ");
    preOrderPrint(root);
    System.out.printf("\nPostorder: ");
    postOrderPrint(root);
    System.out.printf("\n\n");
   } 
    /**
     * called by print helper
     * @param currentNode
     */
   private static void inorderPrint(Node currentNode){
    if (currentNode.left == null){ 
        System.out.printf("%s ", currentNode.data);
    }
    if(currentNode.left != null) {inorderPrint(currentNode.left);
    System.out.printf("%s ", currentNode.data);
    }
    if (currentNode.right != null) {inorderPrint(currentNode.right);}
    }

    /**
     * called by print helper
     * @param currentNode
     */
    private static void preOrderPrint(Node currentNode){
        System.out.printf("%s ", currentNode.data);
        if (currentNode.left != null) {preOrderPrint(currentNode.left);}
        if (currentNode.right != null) {preOrderPrint(currentNode.right);}
    }
    /**
     * called by print helper
     * @param currentNode
     */
    private static void postOrderPrint(Node currentNode){
        if (currentNode == null) {return;}
        if (currentNode.left != null) {postOrderPrint(currentNode.left);}
        if (currentNode.right != null) {postOrderPrint(currentNode.right);}
        System.out.printf("%s ", currentNode.data);
    }

    /**
     * helper for obatining binary tree height
     * @param root
     * @return
     */
    public int getHeight(Node root){
        if (root == null) {return 0;}
        else {return height(root);}
    }

    /**
     * called by height helper
     * @param currentNode
     * @return
     */
    private int height(Node currentNode){
        if (currentNode == null) {return 0;}
        return 1 + Math.max(height(currentNode.left), height(currentNode.right));
    }

    /**
     * helper checks root and calls internalPathLength
     */
    public int getInternalPathLength(Node root){
        if (root == null) {return 0;}
        else {return internalPathLength(root, 0);}
    }

    /**
     * uses recursion similar to height but keeps track of total path length
     * @param currentNode
     * @param counter
     * @return
     */
    private int internalPathLength(Node currentNode, int counter){
        if (currentNode == null) {return 0;} //node is empty
        if (currentNode.left == null && currentNode.right == null) {return 0;} //leaf
        return counter + internalPathLength(currentNode.left, counter + 1) + internalPathLength(currentNode.right, counter + 1);
    }

    /**
     * helper calls absentChildren after checking root
     * @param root
     * @return
     */
    public int getAbsentChildren(Node root){
        if (root == null) {return 0;}
        return absentChildren(root);
    }

    /**
     * recursively goes down tree marking every non full node
     * @param currentNode
     * @return
     */
    private int absentChildren(Node currentNode){
        if (currentNode == null) {return 0;}
        if (currentNode.left == null && currentNode.right == null) {return 1;}
        if (currentNode.left != null && currentNode.right != null) { 
            return absentChildren(currentNode.left) + absentChildren(currentNode.right);}
        if (currentNode.left != null) {return 1 + absentChildren(currentNode.left);}
        return 1 + absentChildren(currentNode.right); //left is empty right is occupied
    }

    /**
     * pathSum helper checks root and pathSum for null then calls pathSum
     * @param root
     * @param pathSum
     * @return
     */
    public boolean getPathSum(Node root, int pathSum){
        if (root == null || pathSum == 0) {return false;}
        return pathSum(root, pathSum, 0);
    }

    /**
     * add currentValue to checksum, checks checkSum against pathSum if node is a leaf
     * checks left path then right path otherwise
     * @param currentNode
     * @param pathSum
     * @param checkSum
     * @return
     */
    private boolean pathSum(Node currentNode, int pathSum, int checkSum){
        if (currentNode == null) {return false;}
        checkSum += (int)currentNode.data;
        if (currentNode.left == null && currentNode.right == null) {return checkSum == pathSum;}
        return pathSum(currentNode.left, pathSum, checkSum) || pathSum(currentNode.right, pathSum, checkSum); 
    }

    /**
     * checks if node is null then uses preorderList to create array to return 
     * @return
     */
    public ArrayList<Integer> getNodeData(){
        ArrayList<Integer> nodeData = new ArrayList<>();
        if (getRoot() == null) {return nodeData;}
        preOrderList(getRoot(), nodeData);
        return nodeData;
    }

    /**
     * helper saves each nodes data to an array list in preorder
     * @param currentNode
     * @param nodeData
     */
    private void preOrderList(Node currentNode, ArrayList<Integer> nodeData){
        nodeData.add((Integer)currentNode.data);
        if (currentNode.left != null) {preOrderList(currentNode.left, nodeData);}
        if (currentNode.right != null) {preOrderList(currentNode.right, nodeData);}
    }
}

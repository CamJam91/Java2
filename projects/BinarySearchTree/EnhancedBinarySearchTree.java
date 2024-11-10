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
        if (currentNode.left != null) {postOrderPrint(currentNode.left);}
        if (currentNode.right != null) {postOrderPrint(currentNode.right);}
        System.out.printf("%s ", currentNode.data);
    }



    
}

//Cameron Murphy CIS 2217 R01

import java.util.Scanner;

public class UserInterface {
    private static int userChoice;
    private static final Scanner userInput = new Scanner(System.in);
    private static EnhancedBinarySearchTree userTree;
    private static boolean filled = false;
    /**
     * Displays output to user, takes input and calls appropriate methods based on this
     */
    public static void go(){
        
        System.out.printf("Welcome to enhanced BST Tester.\n\n\n");
        do{
            System.out.printf("0) Quit \n1) Build a BST from a text file \n2) Print the Tree" +
                    "\n3) Add data \n4) Remove Data \n5) Show Tree Height \n6) Show internal path length" +
                    "7) Count Absent Children \n8) Find a path sum \n9) Export a BST to a text file\n>>");
            userChoice = userInput.nextInt();
            switch (userChoice){
                case 1: boolean success = buildTree();
                        if (success) {filled = true;}
                break;
                case 2: if (checkTree()) {userTree.print();}
                break;
                case 3: if (checkTree()) {addNode();}
                break;
                case 4: if (checkTree()) {removeNode();}
                break;
                case 5: if (checkTree()) {getHeight();}
                break;
            }

        } while(userChoice != 0);
    }

    /**
     * Helper for the fillTree method. Will take a file from user, validate and fill the EBST using fillTree 
     * @return
     */
    public static boolean buildTree(){
            //does the file exist
        FileHandler fileTester;
        System.out.printf("\nEnter the name of your file.\n>>");
        String fileName = userInput.next();
        try{
          fileTester = new FileHandler(fileName);  
        } catch (RuntimeException e){
            return false;
        }

        StringBuilder data = fileTester.fileImport(); //grab data from the fileHandler class
        userTree = fillTree(data);
        System.out.printf("Tree successfully created\n\n");
        return true;
    }
    
    /**
     * Takes our data and fills our EBST
     * @param data
     * @return
     */
    private static EnhancedBinarySearchTree fillTree(StringBuilder data){
        //convert StringBuilder to string then seperate each piece of data
       String nodeData = data.toString();
       String [] nodeNumber = nodeData.split(" ");

       EnhancedBinarySearchTree returnTree = new EnhancedBinarySearchTree();
       for (String number : nodeNumber){
        returnTree.add(Integer.valueOf(number));
       }
       return returnTree;
    }

    /**
     * add a new node to the tree
     */
    public static void addNode(){
        System.out.printf("Enter the data value for your new node\n>>");
        int nodeData = userInput.nextInt();
        if (userTree.find(Integer.valueOf(nodeData))) { System.out.printf("That value already exists in your tree");}
        else{
            userTree.add(nodeData);
            System.out.printf("Data added, here is your new tree:\n");
            userTree.print();
        }
    }

    public static void removeNode(){
        System.out.printf("Enter data to be removed from the tree:\n>>");
        int nodeData = userInput.nextInt();
        if ((userTree.find(nodeData))==false) {System.out.printf("That value does not exist in your tree");}
        else{
            userTree.remove(nodeData);
            System.out.printf("Data deleted, here is your new tree:\n");
            userTree.print();
        }
    }

    public static void getHeight(){
        System.out.printf("The height of your EBST is: %d\n", userTree.getHeight(userTree.getRoot()));
    }

    /**
     * used by other methods for easy tree validation check and user prompt
     * @return
     */
    public static boolean checkTree(){
        if (!filled) {
            System.out.printf("Your Enhanced Binary Search Tree is empty\n\n");
            return false;
        }else{ return true;} 
    }
}

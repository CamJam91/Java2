//Cameron Murphy CIS 2217 R01

import java.util.Scanner;

public class UserInterface {
    private static int userChoice;
    private static final Scanner userInput = new Scanner(System.in);
    private static EnhancedBinarySearchTree userTree;
    /**
     * Displays output to user, takes input and calls appropriate methods based on this
     */
    public static void go(){
        //Test tree
        EnhancedBinarySearchTree t = new EnhancedBinarySearchTree();
      t.add(10);
      t.add(3);
      t.add(2);
      t.add(4);
      t.add(30);
      t.add(29);
      t.add(35);
      t.add(38);
      t.add(40);
      t.add(39);
        System.out.printf("Welcome to enhanced BST Tester.\n\n\n");
        do{
            System.out.printf("0) Quit \n1) Build a BST from a text file \n2) Print the Tree" +
                    "\n3) Add data \n4) Remove Data \n5) Show Tree Height \n6) Show internal path length" +
                    "7) Count Absent Children \n8) Find a path sum \n9) Export a BST to a text file\n>>");
            userChoice = userInput.nextInt();
            switch (userChoice){
                case 1: int success = buildTree();
                case 2: t.print();
            }

        } while(userChoice != 0);
    }

    /**
     * Helper for the fillTree method. Will take a file from user, validate and fill the EBST using fillTree 
     * @return
     */
    public static int buildTree(){
            //does the file exist
        FileHandler fileTester;
        System.out.printf("\nEnter the name of your file.\n>>");
        String fileName = userInput.next();
        try{
          fileTester = new FileHandler(fileName);  
        } catch (RuntimeException e){
            return -1;
        }

        StringBuilder data = fileTester.fileImport(); //grab data from the fileHandler class
        System.out.printf("%s", data);
        userTree = fillTree(data);
        return 0;
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
}

public class Tester {

    /**
     * This is our test laboratory
     */
    public static void main(String[] args) throws Exception 
    {
        int myTestTotal = 314;   // This is the total for my assessments
        double testTotal = 357;  // This is the total for the class assessments
        int numberOfTests = 10;

        double testAverage = myTestTotal/numberOfTests;
        int testAvg = (int) (458./10);
        int myTestAverage = (int) (testTotal/numberOfTests);

        String myName = "Mel Hoffert";

        System.out.println("The class test average is " + testAverage);
        System.out.println("My test average is " + myTestAverage);
        System.out.println("Your name is " + myName);
        System.out.println("My last name is " + myName.substring(4));
        System.out.println("My first name is " + myName.substring(0, 3));

        BankAccount hoffertAccount = new BankAccount("Cameron Murphy");
        BankAccount bezosAccount = new BankAccount("Bezos", 1000000);

        System.out.println("Hoffert account: " + hoffertAccount.getBalance());
        System.out.println("Hoffert account: " + hoffertAccount.getBalance());

        System.out.println(hoffertAccount);
        System.out.println(bezosAccount);






    }
}

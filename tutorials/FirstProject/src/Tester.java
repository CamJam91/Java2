public class Tester {
    /**
     * Test Laboratory, keep separate from functional project files
     */
    public static void main(String[] args) throws Exception {
        int myTestTotal = 314;
        double testTotal = 357;
        int numberOfTests = 10;

        double testAverage = (double) myTestTotal/numberOfTests;
        int testAvg = (int) (458/10.);
        int myTestAverage = (int) (testTotal/numberOfTests);

        String myName = "Cameron Murphy";

        System.out.printf("The class test average is %.2f\n", testAverage);
        System.out.printf("My test Average is %d\n", myTestAverage);
        System.out.printf("Your name is %s\n", myName);
        System.out.printf("My Last name is %s\n", myName.substring(8));
        System.out.printf("My first name is %s\n", myName.substring(0,7));

        BankAccount cameronAccount = new BankAccount(900);

        System.out.println(cameronAccount);
    }
}

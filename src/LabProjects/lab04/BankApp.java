import java.util.Scanner;

/**
 * Created by user on 6/20/2017.
 */
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount accounts[] = new BankAccount[10];

        System.out.println("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++) {

            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            accounts[i] = new BankAccount(name, balance);
        }

        System.out.println();
        for(int i=0; i<n; i++) {
            System.out.println(accounts[i]);
        }
        System.out.println();

        System.out.println("Enter account name to transfer from: ");
        String sourceName = sc.nextLine();
        System.out.println("Enter account name to transfer to: ");
        String destinationName = sc.nextLine();
        System.out.println("Enter amount to transfer: ");
        double transferAmount = sc.nextDouble();

        BankAccount sourceAccount = null;
        BankAccount destinationAccount = null;
        for (int i=0; i<n; i++) {
            if(sourceName.equals(accounts[i].getName()))
                sourceAccount = accounts[i];
            if(destinationName.equals(accounts[i].getName()))
                destinationAccount = accounts[i];
        }
        sourceAccount.transfer(transferAmount, destinationAccount);

        System.out.println();
        for(int i=0; i<n; i++) {
            System.out.println(accounts[i]);
        }
        System.out.println();

//        BankAccount karimAccount = new BankAccount("Karim", 13000);
//        BankAccount rahimAccount = new BankAccount("Rahim", 11000);
//
//        System.out.println(karimAccount);
//        System.out.println(rahimAccount);
//        System.out.println();
//
//        karimAccount.transfer(1000, rahimAccount);
//
//        System.out.println(karimAccount);
//        System.out.println(rahimAccount);
//        System.out.println();
    }
}

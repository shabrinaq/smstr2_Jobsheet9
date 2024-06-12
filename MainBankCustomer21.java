import java.util.Scanner;

/**
 * MainBankCustomer21
 */
public class MainBankCustomer21 {

    public static void main(String[] args) {
        BankCustomerLinkedList21 customerList = new BankCustomerLinkedList21();
        Scanner sc = new Scanner(System.in);
        int choose;

        do {
            System.out.println("==============================================");
            System.out.println("Menu");
            System.out.println("==============================================");
            System.out.println("1. Add Customer");
            System.out.println("2. Show All Customers");
            System.out.println("3. Search Customer Based on Account Number");
            System.out.println("4. Delete Customer Based on Account Number");
            System.out.println("5. Exit");
            System.out.print("choose Menu (1-5): ");
            choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                System.out.println("==============================================");
                    System.out.print("Enter your Name       : ");
                    String name = sc.nextLine();
                    System.out.print("Enter your Address    : ");
                    String address = sc.nextLine();
                    System.out.print("Enter Account Number  : ");
                    String customerAccountNumber = sc.nextLine();

                    customerList.addCustomer(name, address, customerAccountNumber);
                    break;
                case 2:
                    System.out.println("==============================================");
                    customerList.displayCustomers();
                    break;
                case 3:
                    System.out.println("==============================================");
                    System.out.print("Enter The Desired Account Number: ");
                    String searchAccountNumber = sc.nextLine();

                    customerList.searchCustomer(searchAccountNumber);
                    break;
                case 4:
                    System.out.println("==============================================");
                    System.out.print("Enter The Account Number To Be Deleted: ");
                    String deleteAccountNumber = sc.nextLine();
                    
                    customerList.deleteCustomer(deleteAccountNumber);
                    break;
                case 5:
                    System.out.println("-------------------------");
                    System.out.println("Exit The Program");
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("-------------------------");
                    System.out.println("Not Valid");
            }
        } while (choose != 5);
        sc.close();
    }
        
}

import java.util.Scanner;

/**
 * MainBankCustomer21
 */
public class MainBankCustomer21 {

    public static void main(String[] args) {
        BankCustomerLinkedList21 customerQueue = new BankCustomerLinkedList21();
        Scanner sc = new Scanner(System.in);
        int choose;

        do {
            System.out.println("==============================================");
            System.out.println("Menu");
            System.out.println("==============================================");
            System.out.println("1. Add Customer to Queue (Enqueue)");
            System.out.println("2. Remove Customer from Queue (Dequeue)");
            System.out.println("3. Show All Customers in Queue");
            System.out.println("4. View the Customer at the Front of the Queue (Peek)");
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

                    customerQueue.enqueue(name, address, customerAccountNumber);
                    break;
                case 2:
                    System.out.println("==============================================");
                    customerQueue.dequeue();
                    break;
                case 3:
                    customerQueue.displayQueue();
                    break;
                case 4:
                    customerQueue.peek();
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

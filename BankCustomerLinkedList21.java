/**
 * BankCustomerLinkedList21
 */
public class BankCustomerLinkedList21 {

    NodeBankCustomer21 front, rear;

    public BankCustomerLinkedList21() {
        this.front = this.rear = null;
    }

    public void enqueue(String Name, String Address, String CustomerAccountNumber) {
        NodeBankCustomer21 newNodeBankCustomer21 = new NodeBankCustomer21(Name, Address, CustomerAccountNumber);
        
        if (this.rear == null) {
            this.front = this.rear = newNodeBankCustomer21;
            return;
        } 
        this.rear.next = newNodeBankCustomer21;
        this.rear = newNodeBankCustomer21;
    }

    public void dequeue() {
        if (this.front == null) {
            System.out.println("Empty queue, no customers to Deleted");
            return;
        }
        NodeBankCustomer21 temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        System.out.println("Customer with account number " + temp.CustomerAccountNumber + " Deleted");
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Empty Queue");
        } else {
            NodeBankCustomer21 temp = front;
            while (temp != null) {
                System.out.println("Name            : " + temp.Name);
                System.out.println("Address         : " + temp.Address);
                System.out.println("Account Number  : " + temp.CustomerAccountNumber);
                temp = temp.next;
            }
        }
    }

    public void peek() {
        if (front == null) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Nasabah di depan antrian:");
            System.out.println("Name            : " + front.Name);
            System.out.println("Address         : " + front.Address);
            System.out.println("Account Number  : " + front.CustomerAccountNumber);
        }
    }
}
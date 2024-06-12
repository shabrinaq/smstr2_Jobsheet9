/**
 * BankCustomerLinkedList21
 */
public class BankCustomerLinkedList21 {

    NodeBankCustomer21 head;

    public void addCustomer(String Name, String Address, String CustomerAccountNumber) {
        NodeBankCustomer21 newNodeBankCustomer21 = new NodeBankCustomer21(Name, Address, CustomerAccountNumber);
        
        if (head == null) {
            head = newNodeBankCustomer21;
        } else {
            NodeBankCustomer21 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNodeBankCustomer21;
        }
    }

    public void displayCustomers() {
        if (head == null) {
            System.out.println("Empty Customer List");
        } else {
            NodeBankCustomer21 temp = head;
            while (temp != null) {
                System.out.println("Name            : " + temp.Name);
                System.out.println("Address         : " + temp.Address);
                System.out.println("AccountNumber   : " + temp.CustomerAccountNumber);
                temp = temp.next;
            }
        }
    }

    public void searchCustomer(String customerAccountNumber) {
        NodeBankCustomer21 temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.CustomerAccountNumber.equals(customerAccountNumber)) {
                System.out.println("Name            : " + temp.Name);
                System.out.println("Address         : " + temp.Address);
                System.out.println("AccountNumber   : " + temp.CustomerAccountNumber);
                found = true;
                break;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Customer with account number " + customerAccountNumber + " Not Found");
        }
    }

    public void deleteCustomer(String customerAccountNumber) {
        if (head == null) {
            System.out.println("Empty Customer List");
            return;
        }

        if (head.CustomerAccountNumber.equals(customerAccountNumber)) {
            head = head.next;
            System.out.println("Customer with account number " + customerAccountNumber + " Deleted");
            return;
        }

        NodeBankCustomer21 temp = head;
        while (temp.next != null && !temp.next.CustomerAccountNumber.equals(customerAccountNumber)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Customer with account number " + customerAccountNumber + " Not Found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Customer with account number " + customerAccountNumber + " Deleted");
        }
    }
}
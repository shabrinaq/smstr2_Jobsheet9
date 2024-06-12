/**
 * NodeBankCustomer21
 */
public class NodeBankCustomer21 {

    String Name;
    String Address;
    String CustomerAccountNumber;
    NodeBankCustomer21 next;

    public NodeBankCustomer21(String Name, String Address, String CustomerAccountNumber) {
        this.Name = Name;
        this.Address = Address;
        this.CustomerAccountNumber = CustomerAccountNumber;
        this.next = null;
    }
}
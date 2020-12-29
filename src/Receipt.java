public class Receipt {
    private Customer customer;
    private int oldNumber;
    private int newNumber;



    public Receipt(Customer customer, int oldNumber, int newNumber) {
        this.customer = customer;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
    }
    public Customer getCustomer() {
        return customer;
    }


    public int payTheBill(){
        return (newNumber-oldNumber)*750;
    }


    @Override
    public String toString() {
        return "Receipt{" +
                "customer=" + customer +
                ", oldNumber=" + oldNumber +
                ", newNumber=" + newNumber +
                '}';
    }
}

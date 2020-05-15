import java.util.LinkedList;

public class Customer extends Person implements process {
    String customerId;
    LinkedList<Item> cart;

    @Override
    public String toString() {
        return "Customer{" +
                "SSN='" + SSN + '\'' +
                ", Name='" + Name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", customerId='" + customerId + '\'' +
                ", \ncart=" + cart +
                "\n}";
    }

    public Customer(String SSN, String name, String phoneNumber, String address, String customerId) {
        super(SSN, name, phoneNumber, address);
        this.customerId = customerId;
        cart = new LinkedList<>();
    }
    // interface function
    @Override
    public void run() {
        System.out.println("----------------------------------");
        System.out.println("Customer Name : " + Name);
        System.out.println("Customer Address : " + address);
        System.out.println("Customer Phone No. : " + phoneNumber);
        double bill = 0;
        System.out.println("----------------------------------");
        System.out.println("CartItems");
        for (Item item : cart) {
            System.out.println(item);
            bill += (item.price * item.quantity);
        }
        System.out.println("----------------------------------");
        System.out.println("Total Bill : " + bill);
    }

}

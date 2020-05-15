import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Store implements process {
    LinkedList<Item> stock;
    LinkedList<Customer> customers;
    Queue<Customer> customerQueue;

    Store() {
        stock = new LinkedList<>();
        customers = new LinkedList<>();
        customerQueue = new LinkedList<>();
    }

    void addNewCustomer(Customer customer) {
        customers.add(customer);
    }


    Customer addNewCustomerToQueue(String id, LinkedList<Item> items) {
        for (Customer customer : customers) {
            if (customer.customerId.equals(id)) {
                customer.cart = items;
                customerQueue.add(customer);
                return customer;
            }
        }
        return null;
    }

    // this will add item to the stock
    void addItems(Item item) {
        stock.add(item);
    }

    // this will print all items using iterator
    void printItem() {
        Iterator<Item> iterator = stock.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    // this will sort items on the basis of id using bubble sort
    void sortItems() {
        int n = stock.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (stock.get(j).itemId.compareTo(stock.get(j + 1).itemId) > 0) {
                    Item temp = stock.get(j);
                    stock.set(j, stock.get(j + 1));
                    stock.set(j + 1, temp);
                }
    }

    // this will search id using binary search and return its index0
    Item searchItem(String id) {
        int index = binarySearch(stock, 0, stock.size() - 1, id);
        if (index < 0)
            return null;
        return stock.get(index);
    }

    // the actual implementation of binary search
    int binarySearch(LinkedList<Item> arr, int l, int r, String x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid).itemId.compareTo(x) == 0)
                return mid;
            if (arr.get(mid).itemId.compareTo(x) > 0)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    @Override
    public void run() {
        while (!customerQueue.isEmpty()) {
            customerQueue.poll().run();
        }
    }
    // this will print all customersA
    public void printCustomer() {
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}

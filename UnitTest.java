import java.util.LinkedList;

public class UnitTest {
    private static Store store = new Store();
    public static void unitTest() {
        addItemsTest();
        printItemsTest();
        printItemsSortedTest();
        searchItemSortedTest();
        addCustomerTestTest();
        printCustomersTest();
        addItemToCartTest();
        addToQueueTest();
        runTest();
    }

    private static void addItemsTest() {
        store.addItems(new Item("000", "64gb USB", 15.7, 50));
        store.addItems(new Item("003", "Samsung 970EVO ", 150.7, 50));
        store.addItems(new Item("001", "HDMI to DVI", 24.7, 50));
        store.addItems(new Item("002", "128gb to DVI", 60.7, 50));
        System.out.println("Stock added");
    }
    private static void printItemsTest(){
        System.out.println("Printing Stock");
        store.printItem();
    }

    private static void addCustomerTestTest(){
        store.addNewCustomer(new Customer("0000000011236", "John Cena", "0000001", "Earth Home 1", "C1"));
        store.addNewCustomer(new Customer("0000000011233", "John Corner", "0000002", "Earth Home 2", "C2"));
        store.addNewCustomer(new Customer("0000000011234", "John Adam", "0000003", "Earth Home 3", "C3"));
        store.addNewCustomer(new Customer("0000000011238", "Michael Knight ", "0000004", "Earth Home 4", "C4"));
        store.addNewCustomer(new Customer("0000000011239", "Zill", "0000005", "Earth Home 5", "C5"));
        System.out.println("Customers added");
    }
    private static void printCustomersTest(){
        System.out.println("Printing Customers");
        store.printCustomer();
    }
    private static void printItemsSortedTest(){
        System.out.println("Items After Sorting");
        store.sortItems();
    }
    private static void searchItemSortedTest(){

        store.printItem();
        System.out.println("Searching Item with 008");
        Item res1 = store.searchItem("008");
        if (res1 == null)
            System.out.println("Result not found");
        else
            System.out.println(res1);
        System.out.println("Searching Item with 002");
        Item res2 = store.searchItem("002");
        if (res2 == null)
            System.out.println("Result not found");
        else
            System.out.println(res2);
    }

    private static void addItemToCartTest(){

        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item("000", "64gb USB", 15.7, 15));
        items.add(new Item("003", "Samsung 970EVO ", 150.7, 5));
        System.out.println("Adding Items in List 000,003");
        System.out.println("Printing Queue");
        System.out.println(store.addNewCustomerToQueue("C1", items));
    }

    private static void addToQueueTest(){
        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item("000", "64gb USB", 15.7, 15));
        items.add(new Item("003", "Samsung 970EVO ", 150.7, 5));
        System.out.println("Adding Items in List 000,003");
        System.out.println("Printing Queue");
        System.out.println(store.addNewCustomerToQueue("C1", items));
    }
    private static void runTest(){

        System.out.println("Running the process");
        store.run();
    }
    public static void main(String[] args) {
        unitTest();
    }
}





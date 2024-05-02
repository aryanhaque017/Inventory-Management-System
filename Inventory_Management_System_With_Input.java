import java.util.Scanner;

class Product { //  // crating Product class for attributes of products
    private String name;
    private int quantity;
    private double price;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() { // setting getter methods to display the attributes of products
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int newQuantity) { // providing setter methods to modify the attributes of products
        this.quantity = newQuantity;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}

class Inventory {   // creating Inventory class for controlling the products along with their attributes
    private Product[] products;
    private int productIndex;
    int index_Of_The_Remove_Product;

    Inventory(int allotable_Products) {   // assinging the no of products(generic) that the array can hold
        products = new Product[allotable_Products];
        productIndex = 0;
    }

    public void addProduct(Product product) { // method for adding new products
            if (productIndex < products.length) {
                products[productIndex] = product;
                productIndex++;

            } else if (products[index_Of_The_Remove_Product] == null){
                products[index_Of_The_Remove_Product] = product;
                
            } else {
                System.out.println("Inventory is full.");
            }
    
    }

    public void removeProduct(String productName) { // to remove products
        boolean found = false;

        for (int index = 0; index < productIndex; index++) {  // using brute force to find the products (Binary search is not applicable here)
            if (products[index] != null && products[index].getName().equals(productName)) {
                products[index] = null;
                index_Of_The_Remove_Product = index;
                System.out.println("Your product has been removed successfully");
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Sorry, no product is present in the inventor with this name.");
        }
    }
    public void updateQuantity(String productName, int newQuantity) {  // for updating the quantity of products
        boolean found = false;

        for (int index = 0; index < productIndex; index++) {  // using brute force to find the products (Binary search is not applicable here)
            if (products[index] != null && products[index].getName().equals(productName)) {
                products[index].setQuantity(newQuantity);
                found = true;
                break;
            }
        }
        if (found ==  false) {
            System.out.println("Sorry, no product is present in the inventor with this name.");
        }
    }

    public void totalCost(String productName) {
        boolean found = false;

        for (int index = 0; index < productIndex; index++) {  // using brute force to find the products (Binary search is not applicable here)
            if (products[index] != null && products[index].getName().equals(productName)) {
                System.out.println("Total cost of " + productName + ": $" + products[index].getPrice() * products[index].getQuantity()); // DFLDSJFLSJDLFJLSDFJLSJFLSDKF
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Sorry, no product is present in the inventor with this name.");
        }
    }

    public void displayInventory() {  // for dispaying the product details
        for (int index = 0; index < productIndex; index++) {
            if (products[index] != null) {
                System.out.println("Product Name: " + products[index].getName() + " | Price: $" + products[index].getPrice() + " | Quantity: " + products[index].getQuantity());
            }
        }
    }
}

public class Inventory_Management_System_With_Input {  // creating this class to add products to the inventory and along with their products
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        System.out.println("Welcome to our Inventory Management System (IMS)");  // Providing the common instructions
        System.out.println("NOTE: Please provide the maximum number of products which will be stored so that you can add more products in future i.e. do not set the current number of products as your maximum number of allotable products");

        System.out.println("Enter the number of products:");   // To provide the number of allotable product
        int Number_of_Products = var.nextInt();
        var.nextLine();
        Inventory inventory = new Inventory(Number_of_Products);

        System.out.println("If you want to exit from the this phase of adding products please enter 'Exit'");  // To add the products along with their details
        for (int i = 0; i < Number_of_Products; i++) {                  
            System.out.println("Details of product number "+(i+1));
            System.out.println("Enter product name:");
            String name = var.nextLine();
            if (name.equals("Exit")) {
                break;
            }
            System.out.println("Enter product price:"); 
            double price = var.nextDouble();
            System.out.println("Enter product quantity:");
            int quantity = var.nextInt();
            var.nextLine();

            Product product = new Product(name, price, quantity);   // Adding the products to the inventory
            inventory.addProduct(product);
        }
        System.out.println("Sir/Madam anything extra?");
        System.out.println("'Y' for Yes and 'N' for NO");
        String customer_word = var.nextLine();

        String customer_sen;

        if (customer_word.equals("Y")) {    // Do-while loop to repeat the process
            do {
                System.out.println("Catalogue: "); 
                System.out.println("If you want to:- ");
                System.out.println("    1. Add product then 'AP'");
                System.out.println("    2. Remove product then 'RP'");
                System.out.println("    3. Update the quantity of a product then 'UQ'");
                System.out.println("    4. Total cost of a product based on their quantity then 'TC'");
                System.out.println("    5. Product list and their details then 'SPD'\n");

                System.out.println("Plese enter your order:");
                String customer_order = var.nextLine();

                if (customer_order.equals("SPD")) {     // Implementing else-if to handle the user input  & Switch statement can be used
                                                            
                    inventory.displayInventory();

                } else if (customer_order.equals("AP")) {

                    System.out.println("Enter product name:");
                    String name = var.nextLine();
                    System.out.println("Enter product price:");
                    double price = var.nextDouble();
                    System.out.println("Enter product quantity:");
                    int quantity = var.nextInt();
                    var.nextLine();

                    Product product = new Product(name, price, quantity);
                    inventory.addProduct(product);

                } else if (customer_order.equals("RP")) {

                    System.out.println("Please enter the product name");
                    String remove_product_name = var.nextLine();
                    inventory.removeProduct(remove_product_name);

                } else if (customer_order.equals("UQ")) {

                    System.out.println("Please enter the product name");
                    String remove_product_name = var.nextLine();
                    System.out.println("Please enter the new quantity");
                    int new_Quantity = var.nextInt();
                    inventory.updateQuantity(remove_product_name, new_Quantity);
                    var.nextLine();

                } else if (customer_order.equals("TC")){

                    System.out.println("Please enter the product name");
                    String remove_product_name = var.nextLine();
                    inventory.totalCost(remove_product_name);
                } else {
                    System.out.println("Sorry, you are run out of options.");
                }
            
                System.out.println("Sir/Madam anything extra?");
                System.out.println("'Y' for Yes and 'N' for NO");
                customer_sen = var.nextLine();

            } while (customer_sen.equals("Y"));    

        } else {
            System.out.println("Thank You!");
        }
        var.close();
    }
}

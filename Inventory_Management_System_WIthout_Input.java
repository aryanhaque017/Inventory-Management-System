// Sk Elaf Ahmed had a contribution to overcome the error of this code(IMS)

class Product { // crating Product class for attributes of products
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

    public void setQuantity(int new_Quantity) { // providing setter methods to modify the attributes of products
        this.quantity = new_Quantity;
    }

    public void setPrice(double new_Price) {
        this.price = new_Price;
    }
}

class Inventory { // creating Inventory class for controlling the products along with their
                 
    private Product[] products;
    private int product_index;

    Inventory(int allotable_Products) { // assinging the no of products(generic) that the array can hold
        products = new Product[allotable_Products];
        product_index = 0;
    }

    public void addProduct(Product product) { // method for adding new products
        if (product_index < products.length) {          
            products[product_index] = product;
            product_index++;
        } else {
            System.out.println("Inventory is out of range.");
        }
    }

    public void removeProduct(String productName) {  // to remove products
        boolean cc = false;
        
        for (int index = 0; index < product_index; index++) {           // using brute force to find the products (Binary search is not applicable here)
            if ((products[index] != null) && products[index].getName().equals(productName)) {
                products[index] = null;
                cc = true;
                break;
            }
        }
        if (cc == false) {
            System.out.println("No product is present in the inventory with this name.");
        }
    }

    public void updateQuantity(String productName, int new_Quantity) {  // for updating the quantity of products
        boolean cc = false;
        
        for (int index = 0; index < product_index; index++) {          // using brute force to find the products (Binary search is not applicable here)
            if ((products[index] != null) && products[index].getName().equals(productName)) {
                products[index].setQuantity(new_Quantity);
                cc = true;
                break;
            }
        }
        if (cc == false) {
            System.out.println("No product is present in the inventory with this name.");
        }

    }
    public void totalCost (String productName) {
        boolean cc = false;
        
        for (int index = 0; index < product_index; index++) {          // using brute force to find the products (Binary search is not applicable here)
            if ((products[index] != null) && products[index].getName().equals(productName)) {
                System.out.println("Total cost of " + productName + ": $" + products[index].getPrice()*products[index].getQuantity());
                cc = true;
                break;
            }
        }
        if (cc == false) {
            System.out.println("No product is present in the inventory with this name.");
        }
    }

    public void displayInventory() { // for dispaying the product details
        for (int index = 0; index < product_index; index++) {        
            // To avoid null pointer exception
            if (products[index] != null) {                                
                System.out.println("Product Name: " + products[index].getName() + " | Price: $ "+ products[index].getPrice() + " | Quantity: " + products[index].getQuantity());
            }
        }
    }
}

public class Inventory_Management_System_WIthout_Input {
    public static void main(String[] args) {

        Inventory inventory = new Inventory(100); // providing the no. of products that inventory can hold

        Product products1 = new Product("Laptop", 999.99, 5); // providing products to the inventory
        Product products2 = new Product("Smartphone", 499.99, 10);
        Product products3 = new Product("Keyboard", 49.99, 20);
        Product products4 = new Product("CPU", 299.99, 8);
        Product products5 = new Product("Glasses", 129.99, 15);
        Product products6 = new Product("Monitor", 199.99, 12);
        Product products7 = new Product("Printer", 149.99, 6);
        Product products8 = new Product("Headphones", 79.99, 18);
        Product products9 = new Product("Mouse", 19.99, 25);
        Product products10 = new Product("Tablet", 349.99, 9);
        Product products11 = new Product("Speaker", 89.99, 12);
        Product products12 = new Product("External Hard Drive", 129.99, 7);
        Product products13 = new Product("Camera", 399.99, 4);
        Product products14 = new Product("Desk Lamp", 24.99, 30);
        Product products15 = new Product("Backpack", 39.99, 25);
        Product products16 = new Product("Router", 79.99, 15);
        Product products17 = new Product("Desk Chair", 149.99, 20);
        Product products18 = new Product("USB Flash Drive", 9.99, 50);
        Product products19 = new Product("Bluetooth Earbuds", 59.99, 15);
        Product products20 = new Product("Graphic Tablet", 199.99, 10);
        Product products21 = new Product("Wireless Mouse", 29.99, 20);
        Product products22 = new Product("Power Bank", 49.99, 20);
        Product products23 = new Product("Webcam", 69.99, 10);
        Product products24 = new Product("Smartwatch", 149.99, 15);
        Product products25 = new Product("Wireless Keyboard", 59.99, 20);
        Product products26 = new Product("VR Headset", 299.99, 8);
        Product products27 = new Product("Coffee Maker", 79.99, 10);
        Product products28 = new Product("Wireless Charger", 29.99, 30);
        Product products29 = new Product("External SSD", 199.99, 10);
        Product products30 = new Product("Fitness Tracker", 99.99, 15);
        Product products31 = new Product("Microphone", 129.99, 12);
        Product products32 = new Product("Drawing Tablet", 149.99, 10);
        Product products33 = new Product("External DVD Drive", 49.99, 15);
        Product products34 = new Product("USB-C Hub", 39.99, 20);
        Product products35 = new Product("Wireless Router", 89.99, 15);
        Product products36 = new Product("Desk Organizer", 19.99, 25);
        Product products37 = new Product("Portable Speaker", 59.99, 20);
        Product products38 = new Product("HDMI Cable", 9.99, 40);
        Product products39 = new Product("LED Desk Lamp", 34.99, 25);
        Product products40 = new Product("Bluetooth Speaker", 79.99, 15);
        Product products41 = new Product("Power Strip", 19.99, 30);
        Product products42 = new Product("Gaming Mouse", 69.99, 15);
        Product products43 = new Product("Wireless Earbuds", 49.99, 20);
        Product products44 = new Product("Bluetooth Keyboard", 39.99, 20);
        Product products45 = new Product("Wireless Headset", 99.99, 15);
        Product products46 = new Product("USB Microphone", 29.99, 25);
        Product products47 = new Product("Gaming Chair", 199.99, 10);
        Product products48 = new Product("RGB Gaming Keyboard", 89.99, 15);
        Product products49 = new Product("Wireless Gaming Mouse", 79.99, 12);
        Product products50 = new Product("Wireless Gaming Headset", 149.99, 10);
  

        inventory.addProduct(products1);
        inventory.addProduct(products2);
        inventory.addProduct(products3);
        inventory.addProduct(products4);
        inventory.addProduct(products5);
        inventory.addProduct(products6);
        inventory.addProduct(products7);
        inventory.addProduct(products8);
        inventory.addProduct(products9);
        inventory.addProduct(products10);
        inventory.addProduct(products11);
        inventory.addProduct(products12);
        inventory.addProduct(products13);
        inventory.addProduct(products14);
        inventory.addProduct(products15);
        inventory.addProduct(products16);
        inventory.addProduct(products17);   
        inventory.addProduct(products18);
        inventory.addProduct(products19);
        inventory.addProduct(products20);
        inventory.addProduct(products21);
        inventory.addProduct(products22);
        inventory.addProduct(products23);
        inventory.addProduct(products24);
        inventory.addProduct(products25);
        inventory.addProduct(products26);
        inventory.addProduct(products27);
        inventory.addProduct(products28);
        inventory.addProduct(products29);
        inventory.addProduct(products30);
        inventory.addProduct(products31);
        inventory.addProduct(products32);
        inventory.addProduct(products33);
        inventory.addProduct(products34);
        inventory.addProduct(products35);
        inventory.addProduct(products36);
        inventory.addProduct(products37);
        inventory.addProduct(products38);
        inventory.addProduct(products39);
        inventory.addProduct(products40);
        inventory.addProduct(products41);
        inventory.addProduct(products42);
        inventory.addProduct(products43);
        inventory.addProduct(products44);
        inventory.addProduct(products45);
        inventory.addProduct(products46);
        inventory.addProduct(products47);
        inventory.addProduct(products48);
        inventory.addProduct(products49);
        inventory.addProduct(products50);

        inventory.displayInventory();
    }
}
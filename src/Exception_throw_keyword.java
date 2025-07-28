
class CartException extends Exception {
    public CartException(String message) {
        super(message);
    }
}

class Product {
    String Name;
    int stock;

    public Product(String name, int stock) {
        Name = name;
        this.stock = stock;
    }

    public void purchse(int quantity) throws CartException {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be more than 0");// We use throw to manually raise a
                                                                               // built-in exception.
        }
        if (quantity > stock) {
            throw new CartException("sorry, not enough stock available for " + Name);// We use throw to raise a custom
                                                                                     // exception.

        }
        stock -= quantity;
        System.out.println("You successfully purchased " + quantity + " " + Name + "(s).");
        System.out.println("Remaining stock: " + stock);
    }
}

public class Exception_throw_keyword {
    public static void main(String[] args) {
        Product Milk = new Product("Milk", 10);
        try {
            Milk.purchse(3);// valid
            Milk.purchse(0);// invalid, will throw IllegalArgumentException
            Milk.purchse(20);// invalid, will throw CartException
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (CartException e) {
            System.out.println("Purchase failed: " + e.getMessage());
        }

        System.out.println("Thank you for shopping!");
    }
}
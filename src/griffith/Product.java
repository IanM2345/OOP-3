package griffith;

public class Product implements Comparable<Product> {
	// Static counter for auto-incrementing code
    private static int counter = 0; 
    
 // Instance fields for each product
    private int code;
    private String title;
    private double price;

 // Constructor to initialize the product with title and price
    public Product(String title, double price) {
        this.code = ++counter; // Auto-increment code
        this.title = title;
        this.price = price;
    }

 // Getter method for product code
    public int getCode() {
        return code;
    }

 // Getter method for product title
    public String getTitle() {
        return title;
    }

 // Getter method for product price
    public double getPrice() {
        return price;
    }

 // Setter method for product title
    public void setTitle(String title) {
        this.title = title;
    }

 // Setter method for product price
    public void setPrice(double price) {
        this.price = price;
    }

 // Override toString() to provide a custom string representation of the product
    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    // Override equals() - Products are equal if their codes are the same
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return code == product.code;
    }

    // Override hashCode() to generate hash based on product code
    @Override
    public int hashCode() {
        return Integer.hashCode(code);
    }

 // Implement compareTo() to compare products by their titles alphabetically
    @Override
    public int compareTo(Product other) {
        return this.title.compareTo(other.title);
    }
}
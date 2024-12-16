package griffith;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // Set deadline to five days from now
        DeadLine deadline = new DeadLine(LocalDate.now().plusDays(5));

        // Get the singleton instance of AssignmentSubmission
        AssignmentSubmission submissionSystem = AssignmentSubmission.getInstance(deadline);

        // Create and submit assessments
        Assessment assessmentOne = new Assessment("Math Assignment", "Linear Algebra");
        submissionSystem.submit(assessmentOne);

        Assessment assessmentTwo = new Assessment("English Assignment", " Summary Essay On Noby Dick");
        submissionSystem.submit(assessmentTwo);

        // Print all submitted assessments
        submissionSystem.printAssessments();
        
        System.out.println(); // Print an empty line for better readability
        
     // Create four product objects with their titles and prices
        Product productOne = new Product ("Playstation", 388.00);
        Product productTwo = new Product ("Xbox", 420.00);
        Product productThree = new Product ("Nintendo", 200.00);
        Product productFour = new Product ("43 Inch LG TV", 342.00);
        
        // Create an ArrayList to store product orders
       ArrayList<Product> order = new ArrayList<>();
        
    // Add the products to the order list
        order.add(productOne);
        order.add(productTwo);
        order.add(productThree);
        order.add(productFour);
        
     // Create clones of productOne and productThree
        Product productOneClone = new Product(productOne.getTitle(),productOne.getPrice());
        Product productThreeClone = new Product(productThree.getTitle(),productThree.getPrice());
        
     // Add the cloned products to the order list
        order.add(productOneClone);
        order.add(productThreeClone);
        
     // Check and print if productOne and its clone are equal based on their values
        System.out.println("ProductOne equals ProductOneClone: " + productOne.equals(productOneClone));
        
     // This checks if productTwo is equal to itself, which should always be true, just to make sure the equals() method works properly
        System.out.println("ProductTwo equals ProductTwo: " + productTwo.equals(productTwo)); 
        
        // Print hash codes for productOne, its clone, and productTwo to compare their identities
        System.out.println("HashCode of ProductOne: " + productOne.hashCode());
        System.out.println("HashCode of ProductOneClone: " + productOneClone.hashCode());
        System.out.println("HashCode of ProductTwo: " + productTwo.hashCode());
        System.out.println("HashCode of ProductTwo: " + productTwo.hashCode());
        System.out.println();

        // Sort the list by the product title and print
        Collections.sort(order);
        for (Product product : order) {
            System.out.println(product);
        }

    }
}
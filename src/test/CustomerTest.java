// Файл: test/CustomerTest.java
package test;
import domain.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        // Створення об'єкта зі значеннями за замовчуванням
        Customer customer = new Customer();
        System.out.println("--- Default values ---");
        customer.displayCustomerInfo();

        // Використання setter-методів
        System.out.println("\n--- Updated values ---");
        customer.setID(42);
        customer.setStatus(false);
        customer.setTotal(1500.75);
        customer.displayCustomerInfo();

        // Спроба встановити некоректні значення
        System.out.println("\n--- Invalid values test ---");
        System.out.println("Set ID to -5: " + customer.setID(-5));
        System.out.println("Set total to -100: " + customer.setTotal(-100));
        customer.displayCustomerInfo(); // Значення не зміняться
    }
}

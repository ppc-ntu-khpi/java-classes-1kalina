// Файл: domain/Customer.java
package domain;

public class Customer {
    private int ID = 1;
    private boolean isNew = true;
    private double total = 1000.0;

    // Конструктор за замовчуванням
    public Customer() {
        // Значення вже ініціалізовані за замовчуванням
    }

    // Методи setter з перевірками
    public boolean setID(int newID) {
        if (newID > 0) {
            this.ID = newID;
            return true;
        }
        return false;
    }

    public boolean setStatus(boolean newStatus) {
        this.isNew = newStatus;
        return true;
    }

    public boolean setTotal(double newTotal) {
        if (newTotal >= 0) {
            this.total = newTotal;
            return true;
        }
        return false;
    }

    // Метод для виведення інформації
    public void displayCustomerInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Status is new: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
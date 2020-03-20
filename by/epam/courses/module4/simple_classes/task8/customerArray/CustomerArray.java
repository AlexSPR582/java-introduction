package by.epam.courses.module4.simple_classes.task8.customerArray;

import by.epam.courses.module4.simple_classes.task8.customer.Customer;

public class CustomerArray {
    private Customer[] customers;

    public CustomerArray(Customer... customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
}

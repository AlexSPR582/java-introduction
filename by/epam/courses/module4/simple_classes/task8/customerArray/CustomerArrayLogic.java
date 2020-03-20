package by.epam.courses.module4.simple_classes.task8.customerArray;

import by.epam.courses.module4.simple_classes.task8.customer.Customer;
import by.epam.courses.module4.simple_classes.task8.customer.CustomerLogic;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerArrayLogic {
    private static CustomerArrayLogic customerArrayLogic;

    private CustomerArrayLogic() {}

    public static CustomerArrayLogic getInstance() {
        if (customerArrayLogic == null) {
            customerArrayLogic = new CustomerArrayLogic();
        }
        return customerArrayLogic;
    }

    public void sortCustomersInAlphabeticalOrder(CustomerArray customerArray) {
        Arrays.sort(customerArray.getCustomers(), new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                int result = c1.getSurname().compareToIgnoreCase(c2.getSurname());
                if (result == 0) {
                    result = c1.getName().compareToIgnoreCase(c2.getName());
                    if (result == 0) {
                        result = c1.getPatronymic().compareToIgnoreCase(c2.getPatronymic());
                    }
                }
                return result;
            }

        });
    }

    public void printCustomersInCreditCardRange(int left, int right, CustomerArray customers) {
        CustomerLogic cl = CustomerLogic.getInstance();
        for (Customer customer: customers.getCustomers()) {
            if (customer.getCreditCardNumber() >= left
                    && customer.getCreditCardNumber() <= right) {
                cl.printCustomerFullName(customer);
            }
        }
    }

    public void printCustomers(CustomerArray customers) {
        for (Customer customer: customers.getCustomers()) {
            CustomerLogic.getInstance().printCustomerFullName(customer);
        }
    }
}

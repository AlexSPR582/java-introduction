package by.epam.courses.module4.simple_classes.task8.customer;

public class CustomerLogic {
    private static CustomerLogic customerLogic;

    private CustomerLogic() {
    }

    public static CustomerLogic getInstance() {
        if (customerLogic == null) {
            customerLogic = new CustomerLogic();
        }
        return customerLogic;
    }

    public void printCustomerFullName(Customer customer) {
        System.out.println(customer.getSurname() + " "
                + customer.getName() + " " + customer.getPatronymic());
    }
}

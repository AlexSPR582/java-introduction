package by.epam.courses.module4.simple_classes.task8.main;

//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import by.epam.courses.module4.simple_classes.task8.customerArray.CustomerArray;
import by.epam.courses.module4.simple_classes.task8.customerArray.CustomerArrayLogic;
import by.epam.courses.module4.simple_classes.task8.customer.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Василий", "Петров",
                "Александрович", 345);
        Customer customer2 = new Customer("Михаил", "Соловьёв",
                "Петрович", 672);
        Customer customer3 = new Customer("Александр", "Иванов",
                "Сергеевич", 267);

        CustomerArray array = new CustomerArray(customer1, customer2, customer3);
        CustomerArrayLogic arrayLogic = CustomerArrayLogic.getInstance();

        System.out.println("СПИСОК ПОКУПАТЕЛЕЙ В АЛФАВИТНОМ ПОРЯДКЕ:");
        arrayLogic.sortCustomersInAlphabeticalOrder(array);
        arrayLogic.printCustomers(array);
        System.out.println();

        System.out.println("СПИСОК ПОКУПАТЕЛЕЙ У КОТОРЫХ НОМЕР КРЕДИТНОЙ КАРТЫ НАХОДИТСЯ В ЗАДАННОМ ДИАПОЗОНЕ:");
        arrayLogic.printCustomersInCreditCardRange(300, 1000, array);
    }
}

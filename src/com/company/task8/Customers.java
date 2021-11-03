package com.company.task8;

public class Customers {

    private Customer[] customers;

    public Customers(int size) {
        customers = new Customer[size];
    }

    public void addNewCustomer(int index, Customer customer) {
        if (index >= 0 && index < customers.length) {

            this.customers[index] = customer;
        }
    }

    public Customer createCustomer(int id, String surname, String name, String patronymic,
                                   String adress, int numberOfCard, int bankAccount) {

        Customer customer = new Customer();

        customer.setId(id);
        customer.setSurname(surname);
        customer.setName(name);
        customer.setPatronymic(patronymic);
        customer.setAdress(adress);
        customer.setNumberOfCard(numberOfCard);
        customer.setBankAccount(bankAccount);

        return customer;
    }
}

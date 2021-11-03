package com.company.task8;

public class Customers {

    private final Customer[] customers;

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
        customer.setAddress(adress);
        customer.setNumberOfCard(numberOfCard);
        customer.setBankAccount(bankAccount);

        return customer;
    }

    public Customer[] sortByAlphabet() {
        for (int i = 0; i < customers.length - 1; i++) {
            for (int j = customers.length - 1; j > i; j--) {

                if (customers[j-1]!=null && customers[j] !=null &&
                        customers[j - 1].getSurname().compareTo(customers[j].getSurname()) > 0) {
                    swap(customers, j);
                }
            }
        }
        return customers;
    }

    private void swap(Customer[] customers, int j) {
        Customer tmp = customers[j - 1];
        customers[j - 1] = customers[j];
        customers[j] = tmp;
    }

    public Customer[] getCustomersByCard(int startNumber, int endNumber) {

        Customer[] filteredCustomerByCard = new Customer[this.customers.length];
        int index = 0;

        for (Customer customer : this.customers) {
            if (customer != null && customer.getNumberOfCard() >= startNumber && customer.getNumberOfCard() <= endNumber) {
                filteredCustomerByCard[index++] = customer;
            }
        }

        Customer[] filteredByCard = new Customer[index];
        for (int i = 0; i < index; i++) {
            if (filteredCustomerByCard[i] != null) {
                filteredByCard[i] = filteredCustomerByCard[i];
            }
        }
        return filteredByCard;
    }
}

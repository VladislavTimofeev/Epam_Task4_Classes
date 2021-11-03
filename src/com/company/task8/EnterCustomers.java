package com.company.task8;

import com.company.Util;

public class EnterCustomers {

    public static void main(String[] args) {
        Customers customers = new Customers(5);

        Customer customer1 = customers.createCustomer(21,"Яковлев","Володимир","Володимирович", "г. Минск, ул. Лобонка 62 100",184937,1234543);
        Customer customer2 = customers.createCustomer(18,"Измайлов","Михаил","Сергеевич","г. Брест, ул.Московская 210 33",792452,2048534);
        Customer customer3 = customers.createCustomer(8,"Никитин","Алексей", "Олегович","г. Гомель, ул. Чапаева 13 33", 496849,1019386);

        customers.addNewCustomer(1,customer1);
        customers.addNewCustomer(2,customer2);
        customers.addNewCustomer(3,customer3);

        Customer[] customerByCard= customers.getCustomersByCard(0,5000000);

        for (Customer customer : customerByCard){
            Util.print(customer.toString());
        }

        Util.print("--------------------");

        Customer[] sortCustomer = customers.sortByAlphabet();

        for (Customer customer : sortCustomer){
            if (customer != null){
                Util.print(customer.toString());
            }
        }
    }
}

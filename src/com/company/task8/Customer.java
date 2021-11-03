package com.company.task8;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int numberOfCard;
    private int bankAccount;

    public Customer() {

        this.id = 0;
        this.surname = "";
        this.name = "";
        this.patronymic = "";
        this.address = "";
        this.numberOfCard = 0;
        this.bankAccount = 0;

    }

    public Customer(int id, String surname, String name, String patronymic,
                    String address, int numberOfCard, int bankAccount) {

        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.numberOfCard = numberOfCard;
        this.bankAccount = bankAccount;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + address + '\'' +
                ", numberOfCard=" + numberOfCard +
                ", bankAccount=" + bankAccount +
                '}';
    }
}

package com.company.task9;

public class Book {

    private int id;
    private String nameOfBook;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int amountOfPages;
    private double price;
    private String bindingType;

    public Book() {
        this.id = 0;
        this.nameOfBook = "";
        this.author = "";
        this.publishingHouse = "";
        this.yearOfPublishing = 0;
        this.amountOfPages = 0;
        this.price = 0.0;
        this.bindingType = "";
    }

    public Book(int id, String nameOfBook, String author,
                String publishingHouse, int yearOfPublishing, int amountOfPages,
                double price, String bindingType) {

        this.id = id;
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.bindingType = bindingType;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameOfBook='" + nameOfBook + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", amountOfPages=" + amountOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}

package com.company.task9;

public class Books {

    private Book[] books;

    public Books(int size) {
        books = new Book[size];
    }

    public void addNewBook(int index, Book book) {
        if (index >= 0 && index < books.length) {

            this.books[index] = book;
        }
    }

    public Book getBookByIndex(int index) {
        if (index >= 0 && index < books.length) {
            return books[index];
        } else {
            return null;
        }
    }

    public Book createBook(int id, String nameOfBook, String author,
                           String publishingHouse, int yearOfPublishing, int amountOfPages,
                           double price, String bindingType) {

        Book book = new Book();

        book.setId(id);
        book.setNameOfBook(nameOfBook);
        book.setAuthor(author);
        book.setPublishingHouse(publishingHouse);
        book.setYearOfPublishing(yearOfPublishing);
        book.setAmountOfPages(amountOfPages);
        book.setPrice(price);
        book.setBindingType(bindingType);

        return book;

    }

    public Book[] getBooksByAuthor(String author) {

        Book[] filteredBooksByAuthor = new Book[this.books.length];
        int index = 0;

        for (Book book : this.books) {
            if (book != null && book.getAuthor().equalsIgnoreCase(author)) {
                filteredBooksByAuthor[index++] = book;
            }
        }

        Book[] finalBooks = new Book[index];
        for (int i = 0; i < index; i++) {
            if (filteredBooksByAuthor[i] != null) {
                finalBooks[i] = filteredBooksByAuthor[i];
            }
        }

        return finalBooks;
    }

    public Book[] getBooksByPublishingHouse(String publishingHouse) {

        Book[] filteredBooksByPublishingHouse = new Book[this.books.length];
        int index = 0;

        for (Book book : this.books) {
            if (book != null && book.getPublishingHouse().equalsIgnoreCase(publishingHouse)) {
                filteredBooksByPublishingHouse[index++] = book;
            }
        }

        Book[] fBooks = new Book[index];
        for (int i = 0; i < index; i++) {
            if (filteredBooksByPublishingHouse[i] != null) {
                fBooks[i] = filteredBooksByPublishingHouse[i];
            }
        }
        return fBooks;

    }

    public Book[] getBooksByYearOfPublishing(int yearOfPublishing) {

        Book[] filteredBooksByYearOfPublishing = new Book[this.books.length];
        int index = 0;

        for (Book book : this.books) {
            if (book != null && book.getYearOfPublishing() > yearOfPublishing) {
                filteredBooksByYearOfPublishing[index++] = book;
            }
        }

        Book[] filteredByYear = new Book[index];
        for (int i = 0; i < index; i++) {
            if (filteredBooksByYearOfPublishing[i] != null) {
                filteredByYear[i] = filteredBooksByYearOfPublishing[i];
            }
        }
        return filteredByYear;
    }


}

package com.company.task9;

import com.company.Util;

public class EnterBooks {
    public static void main(String[] args) {
        Books books = new Books(4);
        Book book = books.createBook(1, "Harry Potter", "J.K.Rowling", "blumberg", 2007, 867, 31.56, "hard");
        Book book2 = books.createBook(2, "SteelMan", "Robert Downy", "Jarvis", 2010, 1534, 59.16, "hard");
        Book book3 = books.createBook(3, "Another", "Steaven King", "Aversev", 2012, 396, 17.42, "hard");

        books.addNewBook(0, book);
        books.addNewBook(1, book2);
        books.addNewBook(2, book3);

//        Util.print(books.getBookByIndex(0).toString());
//
//        Book[] booksByAuthor = books.getBooksByAuthor("J.K.Rowling");
//
//        for (Book book1 : booksByAuthor){
//            Util.print(book1.toString());
//        }

//        Book[] booksByPublishingHouse = books.getBooksByPublishingHouse("jarvis");
//
//        for (Book stellMan : booksByPublishingHouse){
//            Util.print(stellMan.toString());
//        }

        Book[] booksByYear = books.getBooksByYearOfPublishing(2012);

        for (Book bookYear : booksByYear) {
            Util.print(booksByYear.toString());
        }

    }
}

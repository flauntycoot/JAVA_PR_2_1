package com.company;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Paul", "paulpaul2001@gmail.com", 'm');
        Author author2 = new Author("Kate", "katie@mail.ru", 'f');
        Author author3 = new Author("Ivan", "ivan2000@ya.ru",'m');
        System.out.println(author3);
        author1.out();
        author2.out();
        author3.out();
        System.out.println();
    }
}
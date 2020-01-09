/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv18library;

import entity.Book;
import entity.History;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tools {
    private Scanner scanner = new Scanner(System.in);
    
    public void printTakedOnBooks(List<History> histories){
        int n = 1;
        for(int i = 0; i < histories.size(); i++){
            History history = histories.get(i);
            if(history.getReturnBook()== null){
                System.out.printf("%d. Книгу \"%s\" читает %s %s%n"
                        ,n
                        ,history.getBook().getTitle()
                        ,history.getReader().getFirstname()
                        ,history.getReader().getLastname()
                );
                n++;
            }
        }
    }

    void printListBooks(List<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(i + 1 + ". " + book.toString());
        }
        System.out.println("Для редактирования книги введите ее номер или 0:");
        int indexBook = scanner.nextInt();
        scanner.nextLine();
        if(0 != indexBook){
            Book book = books.get(indexBook-1);
            book = editBook(book);
            books.set(indexBook-1, book);
        }
    }

    private Book editBook(Book book) {
        System.out.println("Введите правильное значение:");
        System.out.print("Заголовок: ");
        System.out.println(book.getTitle());
        System.out.print("Исправить на: ");
        String newTitle = scanner.nextLine();
        System.out.print("Автор: ");
        System.out.println(book.getAuthor());
        System.out.print("Исправить на: ");
        String newAuthor = scanner.nextLine();
        System.out.print("Год издания: ");
        System.out.println(book.getPublishedYear());
        System.out.print("Исправить на: ");
        int newPublishedYear = scanner.nextInt();
        scanner.nextLine();
        if(!"0".equals(newTitle)){
           book.setTitle(newTitle); 
        }
        if(!"0".equals(newAuthor)){
           book.setAuthor(newAuthor); 
        }
        if(0 != newPublishedYear){
           book.setPublishedYear(newPublishedYear); 
        }
        return book;
    }
}

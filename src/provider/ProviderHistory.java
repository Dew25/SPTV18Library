/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProviderHistory {
    public History createHistory(List<Book>books,List<Reader>readers){
        Scanner scanner = new Scanner(System.in);
        History history = new History();
        System.out.println("Список книг:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(i+1+". "+book.toString());
        }
        System.out.println("Выберите номер книги:");
        int numBooks = scanner.nextInt();
        history.setBook(books.get(numBooks-1));
         System.out.println("Список читателей:");
        for (int i = 0; i < readers.size(); i++) {
            Reader reader = readers.get(i);
            System.out.println(i+1+". "+reader.toString());
        }
        System.out.println("Выберите номер читателя:");
        int numReader = scanner.nextInt();
        history.setReader(readers.get(numReader-1));
        history.setGiveOutBook(new Date());
        return history;
    }
}

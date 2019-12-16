/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv18library;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import provider.ProviderBook;
import provider.ProviderHistory;
import provider.ProviderReader;

/**
 *
 * @author user
 */
public class App {
    List<Book> books = new ArrayList<>();
    List<Reader> readers = new ArrayList<>();
    List<History> histories = new ArrayList<>();
    SaverToFile saverToFile;
    public App() {
        saverToFile = new SaverToFile();
        books.addAll(saverToFile.loadBooks());
    }
    
    public void run(){
        System.out.println("--- Учебная библиотека группы SPTV18 ---");
        boolean repeat = true;
        do{
            System.out.println("Список задач:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить новую книгу");
            System.out.println("2. Добавить нового читателя");
            System.out.println("3. Выдать книгу читателю");
            System.out.println("4. Вернуть книгу в библиотеку");
            System.out.println("5. Список книг библиотеки");
            System.out.println("6. Список читателей библиотеки");
            System.out.println("Выбери номер задачи: ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Программа закрывается");
                    repeat=false;
                    break;
                case 1:
                    ProviderBook providerBook = new ProviderBook();
                    Book book=providerBook.createBook();
                    books.add(book);
                    saverToFile.saveBooks(books);
                    System.out.println("Книга инициирована: "+book.toString());
                    break;
                case 2:
                    ProviderReader providerReader = new ProviderReader();
                    Reader reader = providerReader.createReader();
                    readers.add(reader);
                    System.out.println("Инициирован новый читатель.");
                    System.out.println(reader.toString());
                    break;
                case 3:
                    ProviderHistory providerHistory = new ProviderHistory();
                    History history = providerHistory.createHistory(books, readers);
                    histories.add(history);
                    System.out.println("Книга выдана");
                    System.out.println(history.toString());
                    break;
                case 4:
                     System.out.println("Список историй:");
                    for (int i = 0; i < histories.size(); i++) {
                        System.out.println(i+1+". "+histories.get(i).toString());
                    }
                    System.out.println("Выберите какую книгу вернуть");
                    int numHistory = scanner.nextInt(); scanner.nextLine();
                    histories.get(numHistory-1).setReturnBook(new Date());
                    System.out.println("Книга возвращена. ");
                    System.out.println(histories.get(numHistory-1).toString());
                case 5:
                    System.out.println("Список книг:");
                    for (int i = 0; i < books.size(); i++) {
                        book = books.get(i);
                        System.out.println(i + 1 + ". " + book.toString());
                    }
                    break;
                case 6:
                    System.out.println("Список читателей:");
                    for (int i = 0; i < readers.size(); i++) {
                        reader = readers.get(i);
                        System.out.println(i + 1 + ". " + reader.toString());
                    }
                    break;    
            }
        }while(repeat);
    }
}

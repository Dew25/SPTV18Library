/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv18library;

import entity.Book;
import entity.History;
import entity.Reader;
import interfaces.Saveble;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class SaverToFile implements Saveble{
    public void saveBooks(List<Book>books){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Books.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(books);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Файла Books.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма записи в Books.txt", ex);
        }
       
    }
    public List<Book> loadBooks(){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Books.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Book>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Нет файла Books.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма чтения Books.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Неизвестный класс Books", ex);
        }
        return new ArrayList<Book>();
    }
    public void saveReaders(List<Reader>readers){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Readers.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(readers);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Файла Readers.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма записи в Readers.txt", ex);
        }
       
    }
    public List<Reader> loadReaders(){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Readers.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Reader>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Нет файла Readers.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма чтения Readers.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Неизвестный класс Readers", ex);
        }
        return new ArrayList<Reader>();
    }
    public void saveHistories(List<History>histories){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Histories.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(histories);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Файла Histories.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма записи в Histories.txt", ex);
        }
       
    }
    public List<History> loadHistories(){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Histories.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<History>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Нет файла Histories.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Проблемма чтения Histories.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName())
                    .log(Level.SEVERE, "Неизвестный класс Histories", ex);
        }
        return new ArrayList<History>();
    }
}

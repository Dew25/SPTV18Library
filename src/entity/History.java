/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author user
 */
public class History implements Serializable{
    private Book book;
    private Reader reader;
    private Date giveOutBook;
    private Date returnBook;

    public History() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getGiveOutBook() {
        return giveOutBook;
    }

    public void setGiveOutBook(Date giveOutBook) {
        this.giveOutBook = giveOutBook;
    }

    public Date getReturnBook() {
        return returnBook;
    }

    public void setReturnBook(Date returnBook) {
        this.returnBook = returnBook;
    }

    @Override
    public String toString() {
        return "History{" 
                + "book=" + book.getTitle()
                + ", reader=" + reader.getFirstname()
                + " " + reader.getLastname()
                + ", giveOutBook=" + giveOutBook + ", returnBook=" + returnBook + '}';
    }
    
    
}

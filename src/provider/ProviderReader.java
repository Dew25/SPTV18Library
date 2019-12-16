/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProviderReader {
    public Reader createReader(){
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader();
        System.out.println("Имя читателя:");
        String firstname = scanner.nextLine();
        reader.setFirstname(firstname);
        System.out.println("Фамилия читателя:");
        String lastname = scanner.nextLine();
        reader.setLastname(lastname);
        System.out.println("Телефон:");
        String phone = scanner.nextLine();
        reader.setPhone(phone);
        return reader;
    }
}

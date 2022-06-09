/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */

public class BookDemo {
    public static void main(String[] args) {
        Author author=new Author("Russel","Winderand");
        Book b1= new Book("Developing Java Software",author,79.75);
        String str=b1.toString();
        System.out.println(str);
    }
}

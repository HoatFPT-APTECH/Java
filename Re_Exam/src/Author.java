/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoatd
 */
public class Author {
    String firstName,lastName;

    public Author(String firsName, String lastName) {
        this.firstName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirsName(String firsName) {
        this.firstName = firsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString(){
        System.out.println(firstName+""+lastName);
        return firstName+""+lastName;
    }
}

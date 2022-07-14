/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;
import java.io.Serializable;

/**
 *
 * @author hoatd
 */
public class Student implements Serializable{
     public String EnrolID,FirstName,LastName;
    public int Age;

    public void setEnrolID(String EnrolID) {
        this.EnrolID = EnrolID;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEnrolID() {
        return EnrolID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    public Student() {
    }

    public Student(String EnrolID, String FirstName, String LastName, int Age) {
        this.EnrolID = EnrolID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
    }
    public String toString(){
        return EnrolID + "\t " + FirstName + " " + LastName + "\t " + Age;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Personnel;

/**
 *
 * @author kal bugrara
 */
public class Person {

    String personName;

    public Person(String id) {

        this.personName = id;
    }

    public String getPersonName() {
        return personName;
    }

    public boolean isMatch(String personName) {
        if (getPersonName().equals(personName)) {
            return true;
        }
        return false;
    }
}

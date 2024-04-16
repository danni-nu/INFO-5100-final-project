/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Personnel;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class PersonDirectory {
    
      ArrayList<Person> personlist ;
    
      public PersonDirectory (){
          
       personlist = new ArrayList();

    }

    public Person newPerson(String personName) {

        Person p = new Person(personName);
        personlist.add(p);
        return p;
    }

    public Person findPerson(String personName) {

        for (Person p : personlist) {

            if (p.isMatch(personName)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }
    
}

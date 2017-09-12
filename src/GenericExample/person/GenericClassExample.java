/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericExample.person;

/**
 *
 * @author Producer
 */
public class GenericClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person<Employee> e1 = new Person<>();
        Person<Contact> c1 = new Person<>();
        Employee e = new Employee("John", "Slattery", "12345");
        Contact c = new Contact("Mrs", "Peggy", "Fisher", "717-555-1212");
        e1.setPerson(e);
        c1.setPerson(c);
        System.out.println(e1.getPerson().toString());
        System.out.println(c1.getPerson().toString());
    }
    
}

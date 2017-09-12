/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericExample.person;


/**
 *
 * @author Producer
 * @param 
 */
public class Person<E> {
    public E e;
    public void setPerson(E e)
    {
        this.e = e;
    }
    public E getPerson()
    {
        return e;
    }
        
    
}

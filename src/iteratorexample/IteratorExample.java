/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


/**
 *
 * @author Producer
 */
public class IteratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection collection = Arrays.asList("red", "orange", "yellow", "green",
        "blue", "indigo", "violet");
        Iterator iterator = collection.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
    }

}

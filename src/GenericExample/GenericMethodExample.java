/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericExample;

/**
 *
 * @author Producer
 */
public class GenericMethodExample {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] ints = {10, 20, 30, 20, 50, 60, 70, 20};
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"};
        
        print(ints);
        print(daysOfWeek);
        System.out.println(countGreaterThan(daysOfWeek,"S"));
    
    }
    public static <T extends Comparable<T>> int countGreaterThan(T[] list, T elem)
    {
        int count = 0;
        for(T element:list)
        {
            if(element.compareTo(elem) > 0)
                count++;    
        }
        return count;
    }
    public static <E> void print(E[] list)
    {
        for(E element:list)
        {
            System.out.print(element+" ");
        }
        System.out.println("");
    }
    
}

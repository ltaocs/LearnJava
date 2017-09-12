/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericExample;

/**
 *
 *
 * @param <K>
 * @param <V>
 */
public class OrderedPair<K,V> implements Pair<K,V> {
    private final K key;
    private final V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {return key;}
    public V getValue() {return value;}
    
}

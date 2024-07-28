package io.github.johnchoi96.datastructure.hashtable;

import org.apache.commons.lang3.NotImplementedException;

public class MyHashTable<K, V> {

    // TODO: initialize an internal data structure to implement hash table's behavior.

    // TODO: create a constructor

    /**
     * Adds a new element to this hash table.
     * If key already exists, throw IllegalArgumentException.
     *
     * @param key   to add
     * @param value to add
     * @throws IllegalArgumentException if key already exists
     */
    public void add(K key, V value) {
        throw new NotImplementedException();
    }

    /**
     * Returns the number of key entries in the hash table.
     *
     * @return the size of the hash table
     */
    public int getSize() {
        throw new NotImplementedException();
    }

    /**
     * Returns true if hash table is empty.
     *
     * @return true or false
     */
    public boolean isEmpty() {
        throw new NotImplementedException();
    }

    /**
     * Removes the key from the hash table and returns the removed element.
     * If key does not exist in the hash table, throw new IllegalArgumentException().
     *
     * @param key to remove
     * @return removed value
     * @throws IllegalArgumentException if element does not exist
     */
    public V remove(K key) {
        throw new NotImplementedException();
    }

    /**
     * Returns true if key is in the hash table.
     * False if key does not exist.
     *
     * @param key to check
     * @return true if key exists
     */
    public boolean containsKey(K key) {
        throw new NotImplementedException();
    }

    /**
     * Replaces the value for the key with the new value.
     * Returns the old value.
     * Throws IllegalArgumentException if key does not exist.
     *
     * @param key      key
     * @param newValue value to update for the key
     * @return old value
     * @throws IllegalArgumentException if key does not exist
     */
    public V replace(K key, V newValue) {
        throw new NotImplementedException();
    }

    /**
     * Returns the value for the key.
     *
     * @param key key
     * @return value
     * @throws IllegalArgumentException if key does not exist
     */
    public V get(K key) {
        throw new NotImplementedException();
    }

    /**
     * Generates hashcode for the key.
     *
     * @param element to generate hashcode for
     * @return hashcode for the element
     */
    private int hashCode(K element) {
        throw new NotImplementedException();
    }
}

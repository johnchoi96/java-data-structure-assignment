package io.github.johnchoi96.datastructure.hashtable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyHashTableTest {

    @Test
    public void testAddOnePair() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        assertEquals(1, hashTable.getSize());
    }

    @Test
    public void testAddMultiplePair() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        hashTable.add("Lorem", "Ipsum");
        hashTable.add("Apple", "MacBook");
        assertEquals(3, hashTable.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDuplicateKey() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        hashTable.add("Lorem", "Ipsum");
        hashTable.add("Hello", "MacBook");
    }

    @Test
    public void testGetSizeWithNoEntry() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        assertEquals(0, hashTable.getSize());
    }

    @Test
    public void testGetSizeWithOneEntry() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        assertEquals(1, hashTable.getSize());
    }

    @Test
    public void testGetSizeWithMultipleEntries() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        hashTable.add("Lorem", "Ipsum");
        hashTable.add("Apple", "MacBook");
        assertEquals(3, hashTable.getSize());
    }

    @Test
    public void testIsEmptyWithNoEntry() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        assertTrue(hashTable.isEmpty());
    }

    @Test
    public void testIsEmptyWithEntry() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        assertFalse(hashTable.isEmpty());
    }

    @Test
    public void testRemoveWithOneEntry() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");

        String removed = hashTable.remove("Hello");
        assertTrue(hashTable.isEmpty());
        assertEquals("World", removed);
    }

    @Test
    public void testRemoveWithMultipleEntries() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        hashTable.add("Lorem", "Ipsum");
        hashTable.add("Apple", "MacBook");

        String removed = hashTable.remove("Lorem");
        assertFalse(hashTable.isEmpty());
        assertEquals(2, hashTable.getSize());
        assertEquals("Ipsum", removed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveWithInvalidKey() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        hashTable.add("Lorem", "Ipsum");
        hashTable.add("Apple", "MacBook");

        hashTable.remove("this-does-not-exist");
    }

    @Test
    public void testContainsKeyWithNoEntry() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        assertFalse(hashTable.containsKey("this-does-not-exist"));
    }

    @Test
    public void testContainsKeyWithOneEntry() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        assertTrue(hashTable.containsKey("Hello"));
        assertFalse(hashTable.containsKey("World"));
    }

    @Test
    public void testContainsKeyWithMultipleEntries() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        hashTable.add("Lorem", "Ipsum");
        hashTable.add("Apple", "MacBook");

        assertTrue(hashTable.containsKey("Hello"));
        assertTrue(hashTable.containsKey("Lorem"));
        assertTrue(hashTable.containsKey("Apple"));
        assertFalse(hashTable.containsKey("HELLO"));
        assertFalse(hashTable.containsKey("MacBook"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWithNoEntry() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.replace("Something", "new-value");
    }

    @Test
    public void testReplaceWithOneEntry() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        assertEquals("World", hashTable.get("Hello"));
        String old = hashTable.replace("Hello", "John");
        assertEquals("World", old);
        assertEquals("John", hashTable.get("Hello"));
        assertEquals(1, hashTable.getSize());
    }

    @Test
    public void testReplaceWithMultipleEntries() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        hashTable.add("Lorem", "Ipsum");
        hashTable.add("Apple", "MacBook");
        assertEquals("World", hashTable.get("Hello"));
        String old = hashTable.replace("Hello", "John");
        assertEquals("World", old);
        assertEquals("John", hashTable.get("Hello"));
        assertEquals(3, hashTable.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWithNoEntry() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.get("Something");
    }

    @Test
    public void testGetWithOneEntry() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        assertEquals(1, hashTable.getSize());
        assertEquals("World", hashTable.get("Hello"));
    }

    @Test
    public void testGetWithMultipleEntries() {
        MyHashTable<String, String> hashTable = new MyHashTable<>();
        hashTable.add("Hello", "World");
        hashTable.add("Lorem", "Ipsum");
        hashTable.add("Apple", "MacBook");
        assertEquals(3, hashTable.getSize());
        assertEquals("Lorem", hashTable.get("Ipsum"));
    }
}

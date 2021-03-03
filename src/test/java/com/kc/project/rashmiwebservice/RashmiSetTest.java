package com.kc.project.rashmiwebservice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RashmiSetTest {

    static RashmiSet rashmiSet=null;
    @BeforeAll
    static void setUp() {
        rashmiSet = new RashmiSet();
    }

    @Test
    void createEmptySet() {
        assertEquals(11,rashmiSet.size());
    }
    @Test
    void addToSet() {
        rashmiSet.add(10);
        rashmiSet.add(20);
        assertEquals(7,rashmiSet.size());
    }
    @Test
    void addToSetExceedArraySize() {
        rashmiSet.add(10);
        rashmiSet.add(20);
        rashmiSet.add(30);
        rashmiSet.add(40);
        rashmiSet.add(50);
        rashmiSet.add(60);
        assertEquals(11,rashmiSet.size());
    }
    @Test
    void addUniqueToSet() {
        rashmiSet.addUnique(20);
        rashmiSet.addUnique(20);
        rashmiSet.addUnique(30);
        rashmiSet.addUnique(10);
        rashmiSet.addUnique(50);
        rashmiSet.addUnique(60);
        assertEquals(5,rashmiSet.size());
    }
    @Test
    void removeFromSet() {
        assertEquals(7,rashmiSet.size());
        rashmiSet.remove(10);
        assertEquals(5,rashmiSet.size());
        assertArrayEquals(new int[]{20, 30, 50, 60, 20, 0, 0, 0, 0}, rashmiSet.intArr);
    }


}

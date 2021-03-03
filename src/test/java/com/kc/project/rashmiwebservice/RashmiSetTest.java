package com.kc.project.rashmiwebservice;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class RashmiSetTest {

    RashmiSet rashmiSet=null;

    @BeforeEach
    void setUp() {
        rashmiSet = new RashmiSet();
    }

    @Test
    void createEmptySet() {
        assertEquals(0,rashmiSet.size());
    }
    @Test
    void addToSet() {
        rashmiSet.add(10);
        rashmiSet.add(20);
        assertEquals(2,rashmiSet.size());
    }
    @Test
    void addToSetExceedArraySize() {
        rashmiSet.add(10);
        rashmiSet.add(20);
        rashmiSet.add(30);
        rashmiSet.add(40);
        rashmiSet.add(50);
        rashmiSet.add(60);
        assertEquals(6,rashmiSet.size());
    }
    @Test
    void addUniqueToSet() {
        rashmiSet.add(20);
        rashmiSet.add(20);
        rashmiSet.add(30);
        rashmiSet.add(10);
        rashmiSet.add(50);
        rashmiSet.add(60);
        assertEquals(5,rashmiSet.size());
    }
    @Test
    void removeFromSet() {
        rashmiSet.add(20);
        rashmiSet.add(30);
        rashmiSet.add(10);
        rashmiSet.add(50);
        rashmiSet.add(60);
        rashmiSet.remove(10);
        assertEquals(4,rashmiSet.size());
        assertArrayEquals(new int[]{20, 30, 60, 50, 0, 0, 0, 0, 0, 0}, rashmiSet.intArr);
    }

}

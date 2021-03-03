package com.kc.project.rashmiwebservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RashmiSetTest {

    @Test
    void createEmptySet() {
        RashmiSet rashmiSet = new RashmiSet();
        assertEquals(0,rashmiSet.size());
    }
    @Test
    void addToSet() {
        RashmiSet rashmiSet = new RashmiSet();
        rashmiSet.add(10);
        rashmiSet.add(20);
        assertEquals(2,rashmiSet.size());
    }
    @Test
    void addToSetExceedArraySize() {
        RashmiSet rashmiSet = new RashmiSet();
        rashmiSet.add(10);
        rashmiSet.add(20);
        rashmiSet.add(30);
        rashmiSet.add(40);
        rashmiSet.add(50);
        rashmiSet.add(60);
        rashmiSet.add(70);
        rashmiSet.add(80);
        rashmiSet.add(90);
        rashmiSet.add(100);
        rashmiSet.add(110);
        rashmiSet.add(120);
        rashmiSet.add(130);
        rashmiSet.add(140);
        rashmiSet.add(150);
        rashmiSet.add(160);
        assertEquals(16,rashmiSet.size());
    }

}

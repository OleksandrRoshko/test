package org.start.utils.mazutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DodavannyTest {

    @Test
    void dot() {
        int dot = Dodavanny.dot(2, 2);
        assertEquals(4,dot);
        System.out.println(dot);
    }

    @Test
    void metVidOdne () {
        int met = Dodavanny.met(2, -1);
        assertEquals(1, met);
        System.out.println("b<0");
    }

    @Test
    void metDvaDod(){
        int met = Dodavanny.met(2, 4);
        assertEquals(8,met);
        System.out.println("a & b > 0");

    }

    @Test
    void metZero(){
        int met = Dodavanny.met(0, 10);
        assertEquals(10,met);
        System.out.println("one number is zero");

    }
}

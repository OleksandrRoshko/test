package org.start.utils.mazutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    public void maxATest() {
        int max = MathUtils.max(2, 1);
        assertEquals(max, 2);
    }

    @Test
    public void rivneTest() {
        int max = MathUtils.max(2, 2);
        assertEquals(max, 2);

    }

    @Test
    public void videmneTest() {
        int max = MathUtils.max(-2, -3);
        assertEquals(max, -2);
    }

    @Test
    public void minA() {
        System.out.println("Вхідні параметри а = 1, b = 2");

        int min = MathUtils.min(1, 2);

        assertEquals(min, 1);
        System.out.println("Metod retorn min " + min + " it`s good");
    }

    @Test
    public void maxTreeNam() {
        int max = MathUtils.max(2, 3, 4);
        assertEquals(4, max);
        max = MathUtils.max(2, 4, 3);
        assertEquals(4, max);
        max = MathUtils.max(4, 3, 2);
        assertEquals(4, max);
        max = MathUtils.max(4, 4, 3);
        assertEquals(4, max);
        max = MathUtils.max(3, 4, 4);
        assertEquals(4, max);
        max = MathUtils.max(4, 3, 4);
        assertEquals(4, max);
    }

}


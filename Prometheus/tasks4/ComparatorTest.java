package Prometheus.tasks4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComparatorTest {

    @Test
    public void compareEqualsValues() {
        Comparator comparator = new Comparator();
        assertEquals(0, comparator.compare(3,3));
    }

    @Test
    public void compareFirstGrater() {
        Comparator comparator = new Comparator();
        assertEquals(1, comparator.compare(5,4));
    }

    @Test
    public void compareFirstLess() {
        Comparator comparator = new Comparator();
        assertEquals(-1, comparator.compare(2,44));
    }
}
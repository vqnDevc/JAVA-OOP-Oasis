//package org.example.week12.bai2;

import java.util.Collections;
import java.util.List;

public class Week11<T extends Comparable<T>> {
    /**
     * quick sort.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        Collections.sort(list);
        return list;
    }
}
package ru.netology;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    protected int filterValue;

    public Filter(int filterValue) {
        this.filterValue = filterValue;
    }

    public int getFilterValue() {
        return filterValue;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Stream<Integer> stream = source.stream();
        return stream.filter(integer -> integer > getFilterValue()).collect(Collectors.toList());
    }
}

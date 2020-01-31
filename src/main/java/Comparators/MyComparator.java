package Comparators;

import animal.Animal;

import java.util.Comparator;

public interface MyComparator<T> extends Comparator<T> {
     int compare(Animal o1, Animal o2);
}

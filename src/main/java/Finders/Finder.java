package Finders;

import animal.Animal;

public abstract class Finder<T> {
    public abstract boolean check(Animal a, T... obj);
}
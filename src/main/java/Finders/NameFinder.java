package Finders;

import animal.Animal;

public class NameFinder<T> extends Finder<String> {
    @Override
    public boolean check(Animal a, String... obj) {
        return obj[0].equals(a.getName());
    }
}

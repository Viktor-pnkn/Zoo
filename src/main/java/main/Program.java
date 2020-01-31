package main;

import Comparators.AgeComparator;
import Finders.NameFinder;
import animal.Animal;
import animal.AnimalList;
import animal.Dog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {
        try {
            AnimalList animals = new AnimalList("Zoo.txt");
            animals.sort(new AgeComparator());
            System.out.println(animals);
            /*ArrayList<Animal> artemons = animals.find(new NameFinder<>(), "Artemon");
            System.out.println(artemons);*/
            Queue<Animal> dogs = animals.getDogs();
            dogs.add(new Dog("fdf", 4,123));
            System.out.println(dogs);
            /*System.out.println();
            Queue<Animal> cats = animals.getCats();
            System.out.println(cats);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

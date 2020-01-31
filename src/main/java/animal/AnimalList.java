package animal;

import Finders.Finder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class AnimalList {
    private ArrayList<Animal> animals = new ArrayList<>();

    public AnimalList(String fileName) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        while (bf.ready()) {
            String s = bf.readLine();
            String[] str = s.split(";");
            if (str.length > 1) {
                if (str[0].equals("D")) {
                    Dog d = new Dog(str[1], Integer.parseInt(str[3]), Double.parseDouble(str[2]));
                    this.animals.add(d);
                } else {
                    Cat c = new Cat(str[1], Integer.parseInt(str[3]), Double.parseDouble(str[2]));
                    this.animals.add(c);
                }
            }
        }
        bf.close();
    }

    public Queue<Animal> getDogs() {
        Queue<Animal> queue = new PriorityQueue<>();
        for (Animal animal : this.animals) {
            if (animal.getType()) {
                queue.add(animal);
            }
        }
        return queue;
    }

    public Queue<Animal> getCats() {
        Queue<Animal> queue = new PriorityQueue<>();
        for (Animal animal : this.animals) {
            if (!animal.getType()) {
                queue.add(animal);
            }
        }
        return queue;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < animals.size(); i++) {
            s += animals.get(i) + "\n";
        }
        return s;
    }

    public void sort(Comparator f) {
        this.animals.sort(f);
    }

    public <T> ArrayList<Animal> find(Finder<T> f, T... obj) {
        ArrayList<Animal> animals = new ArrayList<>();
        for (Animal a : this.animals) {
            if (f.check(a, obj)) {
                animals.add(a);
            }
        }
        return animals;
    }
}


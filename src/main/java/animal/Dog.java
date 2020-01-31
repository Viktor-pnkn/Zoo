package animal;

public class Dog extends Animal implements Comparable<Dog> {
    private String name;
    private int age;
    private double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sound() {
        return super.sound().replace("animal", "Dog") + " GAVGAV";
    }

    @Override
    boolean getType() {
        return true;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return Integer.compare(age, o.getAge());
    }
}

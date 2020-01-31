package animal;

public class Cat extends Animal implements Comparable<Cat> {
    private String name;
    private int age;
    private double weight;

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    boolean getType() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public String sound() {
        return super.sound().replace("Animal", "Dog") + "myau-myau motherfucker";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(age, o.getAge());
    }
}

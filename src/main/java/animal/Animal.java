package animal;

abstract public class Animal {
    public int getAge() {
        return 33;
    }

    public double getWeight() {
        return 99.99;
    }

    public String sound() {
        return "Our animal sound like this";
    }

    abstract boolean getType();

    public abstract String getName();
}

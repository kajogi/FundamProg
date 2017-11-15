package practice7;

public class Human extends one {

    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println(greetAsString());
    }

    public String greetAsString() {

        String greet;
        if (age > 3)
            greet = String.format("Hello, I am %s and I am %d years old", name, age);
        else
            greet = "Boo,boo";
        return greet;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
public class Animal implements Move, Eat  {

    public int numberOfLegs;
    public boolean eats;

    public Animal(int numberOfLegs, boolean eats) {
        this.numberOfLegs = numberOfLegs;
        this.eats = eats;
    }

    public Animal() {
        this(4, true);
    }

    @Override
    public void eat() {
        System.out.println("Called Animal.eat");
    }

    @Override
    public void move() {
        System.out.println("Called Animal.move");
    }
}

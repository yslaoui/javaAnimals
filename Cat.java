package animals;

public class Cat extends Animal implements NoiseCapable{

    public  Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {
        System.out.println(this.name + " purrs");
    }

    public void makeNoise() {
        this.purr();
    }
}

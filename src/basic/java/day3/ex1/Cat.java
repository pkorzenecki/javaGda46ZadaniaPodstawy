package basic.java.day3.ex1;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Meow, meow");
    }
    public void eatMice(int mice) {
        System.out.println("I ate " + mice + " mice");
    }
    public void print() {
        System.out.println("Cat: ");
        System.out.println("\t name: " + name);
    }

   /* @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }*/
}

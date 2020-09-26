package basic.java.day3.ex1;

public class Main {
    public static void main(String[] args) {
        Cat[] array = new Cat[2];
        Cat cat1 = new Cat("Burek");
        Cat cat2 = new Cat("Filemon");

        array[0] = cat1;
        array[1] = cat2;

        int mice = 10;
        for(Cat element : array) {
            element.print();
            element.makeSound();
            element.eatMice(mice++);
            System.out.println(element.toString());
            System.out.println();
        }
        Cat cat3 = new Cat("Bonifacy");
        System.out.println("Pierwsze imię kota3: " + cat3.getName());
        cat3.setName("Puszek");
        System.out.println("Nowe imię kota 3: " + cat3.getName());

    }
}

package org.example;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Ванек", 200, 0),
                new Dog("Санек"),
                new Dog( "Кузьмич"),
                new Tiger("Димас", 200, 0),
                new Moose("Женя", 150, 0),
                new Hare("Казбек", 400, 0),
                new kurwa_bober("Марк", 50, 150)

        };
        Cat cat = new Cat("wer",200,0);
        for (Animal a:animals) {
            a.run(400);
            a.swim(5);
        }

        System.out.println("Количество котов " + Cat.count);
        System.out.println("Количество собак " + Dog.count);
        System.out.println("Количество тигров " + Tiger.count);
        System.out.println("Количество лося " + Moose.count);
        System.out.println("Количество зайца " + Hare.count);
        System.out.println("Количество бобра " + kurwa_bober.count);

        System.out.println("Общее количество животных: " + Animal.getCount());
        ((Danggerus) animals[6]).dangerus();
        ((Danggerus) animals[5]).dangerus();
        ((Danggerus) animals[4]).dangerus();
    }
}
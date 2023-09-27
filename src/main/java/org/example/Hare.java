package org.example;

public class Hare extends Danggerus{
    public static int count;
    public Hare(String name, int maxRunDistance, int maxSwimDistance) {
        super(name,"заяц","собаки, лисы, волки", maxRunDistance, maxSwimDistance);
        count++;
    }

}

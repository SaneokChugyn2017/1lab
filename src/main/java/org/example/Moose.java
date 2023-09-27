package org.example;

public class Moose extends Danggerus{
    public static int count;
    public Moose(String name, int maxRunDistance, int maxSwimDistance) {
        super(name,"лось","медведи,волки", maxRunDistance, maxSwimDistance);
        count++;
    }

}

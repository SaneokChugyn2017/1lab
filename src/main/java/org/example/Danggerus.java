package org.example;


public abstract class Danggerus extends Animal {
    private String type;
    private  String danger;

    public Danggerus(String name, String type, String danger, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        this.type = type;
        this.danger = danger;
    }

    public String getType() {
        return type;
    }

    public String getOpasno(){
        return danger;
    }

    public void dangerus() {
        System.out.println(this.type + " " + this.getName() + " опасны: " + danger);

    }
}
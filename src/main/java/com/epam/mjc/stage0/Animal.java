package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String s = "This animal is mostly " + this.color + ". " +
                    "It has " + this.numberOfPaws + (this.numberOfPaws > 1 ? " paws" : " paw") +
                    " and " + (this.hasFur ? "a" : "no") + " fur.";
        return s;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }

}

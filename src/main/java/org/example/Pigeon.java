package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Pigeon extends Bird implements AnimalBehavior {
    private String species;

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, int age, String species) {
        super(name, age, "Grey");
        this.species = species;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " pecks from pavement " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " coos");
    }

    public void transportsMail() {
        System.out.println(getName() + " delivers a letter");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps silently");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies");
    }
}
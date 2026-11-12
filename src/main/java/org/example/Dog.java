package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    public Dog(String name, int age, int weight, String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }

    public Dog(String name, int age, String breed) {
        super(name, age, "Carnivora");
        this.breed = breed;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the dog gobbles " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " woofs");
    }

    public void aport() {
        System.out.println(getName() + " fetches the stick");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps soundly");
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }
}
package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Mammal extends Animal {
    private String order;

    public Mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    public Mammal(String name, int age, String order) {
        super(name, age);
        this.order = order;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes some mammal sound idk");
    }

    public void drinkMilk() {
        System.out.println(getName() + " drinks milk");
    }
}
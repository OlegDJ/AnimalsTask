package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Fish extends Animal {
    private String scaleColor;

    public Fish(String name, int age, int weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String name, int age, String scaleColor) {
        super(name, age);
        this.scaleColor = scaleColor;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " slurps " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " is silent");
    }

    public void swim() {
        System.out.println(getName() + " swims");
    }
}
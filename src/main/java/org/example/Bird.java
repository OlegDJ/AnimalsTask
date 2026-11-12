package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Bird extends Animal {
    private String featherColor;

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " pecks " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " tweets");
    }

    public void layEggs() {
        System.out.println(getName() + " lays eggs");
    }
}
package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Blowfish extends Fish implements AnimalBehavior {
    private int diameter;

    public Blowfish(String name, int age, int weight, String scaleColor, int diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    public Blowfish(String name, int age, int diameter) {
        super(name, age, "Grey");
        this.diameter = diameter;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " nibbles " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes a quiet pop");
    }

    public void blows() {
        diameter = diameter * 2;
        System.out.println(getName() + " blows up to " + diameter + " cm");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps fishy");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims");
    }
}
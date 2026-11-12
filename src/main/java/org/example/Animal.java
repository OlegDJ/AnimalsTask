package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Animal implements AnimalMove {
    private String name;
    private int age;
    private int weight;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat(String food);

    public abstract void getVoice();
}
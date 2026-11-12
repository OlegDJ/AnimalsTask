package org.example;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[9];

        animals[0] = new Mammal("Cow", 5, 600, "Artiodactylawtf");
        animals[1] = new Fish("Nemo", 1, "Orange");
        animals[2] = new Bird("Parrot", 2, "Rainbow");
        animals[3] = new Dog("Rex", 4, 20, "Carnivora", "Labrador");
        animals[4] = new Dog("Burek", 2, "Mutt");
        animals[5] = new Blowfish("Puff", 2, 1, "Yellow", 10);
        animals[6] = new Blowfish("Bubble", 1, 15);
        animals[7] = new Pigeon("WhiteKesha", 3, 1, "White", "Rock Pigeon");
        animals[8] = new Pigeon();

        animals[0].eat("Grass");
        animals[3].getVoice();
        ((Dog) animals[3]).aport();
        ((Dog) animals[4]).drinkMilk();
        ((Blowfish) animals[5]).blows();
        ((Pigeon) animals[7]).transportsMail();
        ((Bird) animals[2]).layEggs();

        for (Animal animal : animals) {
            System.out.println(animal);

            animal.move();
            AnimalName.name(animal.getName());
        }

        AnimalBehavior[] animalBehaviors = new AnimalBehavior[]{
                (AnimalBehavior) animals[4],
                (AnimalBehavior) animals[6],
                (AnimalBehavior) animals[7]
        };

        for (AnimalBehavior animalBehavior : animalBehaviors) {
            animalBehavior.sleep();
        }
    }
}
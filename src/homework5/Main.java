package homework5;

import homework5.pet.*;
import homework5.wild.*;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        Cat cat = new Cat(1, 2, "white", 7, "Nick", true);
        Dog dog = new Dog(2, 10, "black", 10, "Elsa", true);
        Fish fish = new Fish(3, 1, "blue", 0.15, "Boolby", false);
        GuideDog guideDog = new GuideDog(4, 5, "black", 12, "Giry", true, true);
        Hamster hamster = new Hamster(5, 10, "brown", 0.5, "Dio", false);
        Crocodile crocodile = new Crocodile(6,4,"green",40,true);
        Giraffe giraffe = new Giraffe(7,7,"yellow",40,false);
        Lion lion = new Lion(8,5,"white",60,true);
        Wolf wolf = new Wolf(9,4,"grey",55,true);
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(fish);
        animalList.add(guideDog);
        animalList.add(hamster);
        animalList.add(crocodile);
        animalList.add(giraffe);
        animalList.add(lion);
        animalList.add(wolf);
        for (Animal animal:animalList) {
            animal.makeVoice();
        }
    }
}

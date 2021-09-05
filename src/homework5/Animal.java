package homework5;

import java.util.Locale;

public class Animal {
    public Animal(int id, int age, String color, double weight) {
        this.id = id;
        this.age = age;
        this.color = color.toLowerCase(Locale.ROOT);
        this.weight = weight;
    }

    int id,age;
    String color;
    double weight;
    public void makeVoice(){
        System.out.print("Hello,");
    }

}

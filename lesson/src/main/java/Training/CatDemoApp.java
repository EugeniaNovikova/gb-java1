package Training;

public class CatDemoApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.name = "БАРСИК";
        cat1.colour = "белый";
        cat1.age = 4;
        cat2.name = "МУРЗИК";
        cat2.colour = "черный";
        cat2.age = 6;
        System.out.println("Кот1 имя: " + cat1.name + " цвет " + cat1.colour + " возраст " + cat1.age);
        System.out.println("Кот2 имя: " + cat2.name + " цвет " + cat2.colour + " возраст " + cat2.age);

    }
}

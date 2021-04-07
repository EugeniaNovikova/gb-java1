package homework6;

public class Cat {
    private final String name;
    private boolean hungry;
    private final int appetite;
    hungry = true;
}
public String getName() {
    return name;
}
public int getAppetite() {
    return appetite;
}
public boolean isHungry() {
    return hungry;
}
public void eat(Plate plate) {
    if (!hungry) {
        System.out.println(this + "is not hungry");
        return;
    }
    hungry = !plate.eat(appetite);
    if (hungry) {
        System.out.println("Eat is not enough");
    } else {
        System.out.println(this + " ate " + appetite + " bites of food");
    }
    @Override
            public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

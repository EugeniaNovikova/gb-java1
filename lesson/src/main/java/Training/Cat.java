package Training;

public class Cat {
    String name;
    String colour;
    int age;

    public void setAge (int Age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }
    public int getAge {
        return age;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

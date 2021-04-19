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
}

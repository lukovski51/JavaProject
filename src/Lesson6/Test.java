package Lesson6;

public class Test {
    public static void main(String[] args) {


        Animal[] animal = new Animal[6];
        animal[0] = new Cat("Cat1", 200, 300);
        animal[1] = new Cat("Cat2", 400, 600);
        animal[2] = new Cat("Cat3", 600, 900);

        animal[3] = new Dog("Dog1", 300, 100, 400);
        animal[4] = new Dog("Dog2", 200, 200, 100);
        animal[5] = new Dog("Dog3", 100, 300, 500);

        for (int i = 0; i < animal.length; i++) {
            animal[i].jump(300);
            animal[i].swim(300);
            animal[i].run(300);
        }
    }
}

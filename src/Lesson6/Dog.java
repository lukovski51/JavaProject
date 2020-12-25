package Lesson6;

public class Dog extends Animal {

    private int run;
    private int jump;
    private int swim;
    private String name;
    public Dog(String name,int run,int jump,int swim){
        this.name = name;
        this.run =run;
        this.jump = jump;
        this.swim = swim;
    }
    public void run(int runDistance){
        if(run>=runDistance) System.out.println(name + " справился с бегом");
        else System.out.println(name + " Не справился с бегом");
    }
    public void swim(int swimDistance){
        if(swim>=swimDistance) System.out.println(name + " справился с плаваньем");
        else System.out.println(name + " Не справился с плаваньем");
    }
    public void jump(int jumpHeight){
        if(jump>=jumpHeight) System.out.println(name + " справился с прыжком");
        else System.out.println(name + " Не справился с прыжком");
    }
}



package Lesson6;

public class Cat extends Animal {

    private int run;
    private int jump;
    private String name;
    public Cat(String name,int run,int jump){
        this.name = name;
        this.run = run;
        this.jump = jump;
    }
    public void jump(int jumpHeight){
        if(jump>=jumpHeight) System.out.println(name + " справился с прыжком");
        else System.out.println(name + " Не справился с прыжком");
    }
    public void run(int runDistance){
        if(run>=runDistance) System.out.println(name + " справился с бегом");
        else System.out.println(name + " Не справился с бегом");
    }

}

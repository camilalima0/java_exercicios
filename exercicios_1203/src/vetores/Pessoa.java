package vetores;

public class Pessoa {
    private String name;
    private int age;
    private double height;

    public void pessoa(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }
}

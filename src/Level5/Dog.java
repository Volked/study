/**
 * Created by Anrew on 25.04.2016.
 */
public class Dog
{
    //напишите тут ваш код
    String name;
    int weight;
    String color;

    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name,int weight){
        this.name = name + weight;
    }
    public void initialize(String name, int wieght,String color){
        this.name = name + weight + color;
    }
}
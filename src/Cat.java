/**
 * Created by Anrew on 24.04.2016.
 */
public class Cat
{
    //напишите тут ваш код
    String name;
    int weight = 56;
    int age = 5;
    String color;
    String adr;
    public void initialize(String name)
    {this.name = name;
    }
    public void initialize(String name, int weight, int age)
    {this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void initialize(String name, int age)
    {this.name = name;
        this.age = age;
    }
    public void initialize(int weight, String color)
    {this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight, String color, String adr)
    {this.weight = weight;
        this.color = color;
        this.adr = adr;
    }
}
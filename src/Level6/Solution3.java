public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Dog sobaca = new Dog("Doggy", 10, "Blue");
        Cat coshka = new Cat("Catty", 5 ,"Seriy");
        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog
    {
        String name;
        int height;
        String color;

        public Dog(String name, int height, String color){
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }
    public static class Cat
    {
        String name;
        int age;
        String color;
        public  Cat(String name, int age, String color){
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }
}

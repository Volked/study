public class Solution
{
        public static void main(String[] args)
    {
          Man man = new Man("Vlad", 15, "Hell know street");
          Man man1 = new Man("Egor", 16, "fckng hole street");
          Woman woman1 = new Woman("Gina", 26, "Stalin square ");
          System.out.println(man);
          System.out.println(man1);
          System.out.println(woman);
          System.out.println(woman1);
    }
           public static class Man
    {
           String name;
            int age;
            String address;
            public Man(String name, int age, String address)
    {
            this.name = name;
            this.age = age;
            this.address = address;
    }
            public String toString(){
            return name.toString() + " " + age + " " + address.toString();
    }
    }
            public static class Woman
    {
           String name;
           int age;
           String address;
           public Woman(String name, int age, String address)
    {
            this.name = name;
            this.age = age;
            this.address = address;
    }
           public String toString(){
            return name.toString() + " " + age + " " + address.toString();
    }
    }
}
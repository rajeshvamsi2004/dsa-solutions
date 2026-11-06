class Dog
{
   public void sound()
   {
      System.out.println("Dog is barking");
   }
}
class Cat extends Dog
{
   public void sound()
   {
      System.out.println("Cat is meow");
   }
}
class Snake extends Dog
{
   public void sound()
   {
      System.out.println("Snake is bus-bus sound");
   }
}
public class RunTime
{
   public static void main(String[] args) {
       Dog d;
       d = new Dog();
       d.sound();
       d = new Cat();
       d.sound();
       d = new Snake();
       d.sound();
   }
}

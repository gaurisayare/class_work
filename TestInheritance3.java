class Animal
{
   void eat()
   {
     System.out.println("Eating.....");
   }
}
class Cat extends Animal
{
   void meow()
   {
     System.out.println("Meow..Meow");
   }
}
class Dog extends Animal
{
   void bark()
   {
     System.out.println("Barking....."); 
   }
}

class TestInheritance3
{
   public static void main (String args[])
   {
     Cat c = new Cat();
     c.eat();
     //c.bark();
     c.meow();
   }
}
   
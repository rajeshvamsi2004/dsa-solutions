class Vehicle
   {
      String brand;
      int speed;
      public void displayinfo()
      {
         System.out.println("Brand is : "+ brand);
         System.out.println("Speed is : " + speed);
      }
   }
   class Car extends Vehicle
   {
      int seats;
      public void displayCarinfo()
      {
         displayinfo();
         System.out.println("Seats are : " + seats);
      }
   }
   class Bike extends Vehicle
   {
      String type;
      public void displayBikeinfo()
      {
         displayinfo();
         System.out.println("Type is : " + type);
      }
   }

   public class Inherit
   {
      public static void main(String[] args) {
          Car c = new Car();
          c.brand = "ferari";
          c.speed = 60;
          c.seats = 4;
          c.displayCarinfo();

          Bike b = new Bike();
          b.brand = "splender";
          b.speed=80;
          b.type="sports";
          b.displayBikeinfo();
      }
   }
   
   

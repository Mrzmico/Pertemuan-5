public class Atribut5 {
    int x = 5;
  
    public static void main(String[] args) {
      Atribut5 myObj1 = new Atribut5();  // Object 1
      Atribut5 myObj2 = new Atribut5();  // Object 2
      myObj2.x = 25;
      System.out.println(myObj1.x);  // Outputs 5
      System.out.println(myObj2.x);  // Outputs 25
    }
  }
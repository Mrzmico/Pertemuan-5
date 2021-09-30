public class Mod {
    final int x = 10;
    final double PI = 3.14;
  
    public static void main(String[] args) {
      Mod myObj = new Mod();
      myObj.x = 50; // will generate an error: cannot assign a value to a final variable
      myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
      System.out.println(myObj.x);
    }
  }
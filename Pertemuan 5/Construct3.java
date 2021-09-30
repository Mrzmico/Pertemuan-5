public class Construct3 {
    int modelYear;
    String modelName;
  
    public Construct3(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      Construct3 myCar = new Construct3(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }
  
  // Outputs 1969 Mustang
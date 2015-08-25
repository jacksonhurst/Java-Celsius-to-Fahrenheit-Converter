import java.util.*;
 
class FahrenheitToCelsius {
  public static void main(String[] args) {
    float temperature;
    Scanner in = new Scanner(System.in);      
 
    System.out.println("What is the Temperature in Celcius?");
    temperature = in.nextInt();
 
    temperature = ((temperature * 9)/5 + 32);
 
    System.out.println("That Temperature in Fahrenheit is = " + temperature);
  }
}

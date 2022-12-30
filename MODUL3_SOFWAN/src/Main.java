import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner inputscanner = new Scanner(System.in);
    Calculation calc = new Calculation();

    do {
      try {
        System.out.println("=~=~=~=~=~Menu Program=~=~=~=~=~\n1. Square\n2. Circle\n3. Trapezoid");
        System.out.print("Please Select Your Menu : ");
        int chooseinput = inputscanner.nextInt();

        switch (chooseinput) {
          case 1:
            System.out.println("Enter the length of the side of the square : ");
            double sisipersegi = inputscanner.nextDouble();
            calc.setSquare(sisipersegi);
            calc.run();
            System.out.println("The calculation result: " + calc.getSquare());
            break;
          case 2:
            System.out.println("Enter the radius of the circle : ");
            double radius = inputscanner.nextDouble();
            calc.setCircle(radius);
            calc.run();
            System.out.println("The calculation result: " + calc.getCircle());
            break;
          case 3:
            System.out.println("Enter the upper side of the trapezoid : ");
            double a = inputscanner.nextDouble();
            System.out.println("Insert the side of the base of the trapezoid : ");
            double b = inputscanner.nextDouble();
            System.out.println("Enter the height of the trapezoid : ");
            double t = inputscanner.nextDouble();
            calc.setTrapezoid(a, b, t);
            calc.run();
            System.out.println("The calculation result: " + calc.getTrapezoid());
            break;
          default:
            System.out.println("Option not available");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("=~=~=~=~=~ Error! Input must be a number =~=~=~=~=~");
        inputscanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);

    inputscanner.close();
  }
}

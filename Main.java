import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Student obj1 = new Student(4.1, 260.0, " henry", 6, true);
    Student obj2 = new Student(8.7, 16.0, " clarence", 2, true);
obj1.rollerCoaster();
obj2.rollerCoaster();

    Scanner scan = new Scanner(System.in);

    System.out.println("what is your height?");
    double height = scan.nextDouble();
    System.out.println("how much do you weigh?");
    double weight = scan.nextDouble();
    System.out.println("what is your name?");
    String name = scan.next();
    System.out.println("how old are you?");
    int age = scan.nextInt();
    System.out.println("is it sunny outside? true/false");
    boolean weather = scan.nextBoolean();

    Student obj3 = new Student(height, weight, name, age, weather);
    obj3.rollerCoaster();
  }
}
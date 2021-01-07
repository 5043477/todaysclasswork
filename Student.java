public class Student{
//variables
private double height;
private double weight;
private String name;
private int age;
private boolean goodWeather;

//constructor
public Student(double studentHeight, double studentWeight, String studentName, int studentAge, boolean Weather)
{
  height = studentHeight;
  weight = studentWeight;
  name = studentName;
  age = studentAge;
  goodWeather = Weather;
}
//method

public void rollerCoaster()
 {
  if(height < 4.6 && weight < 300.0 && age > 5 && goodWeather)
  {
    System.out.println("yay! you get to ride the roller coaster" + name);
  }else{
    System.out.println("sorry, maybe next year" + name);
  }
 }

public void rollerCoaster2()
 {
  if(height < 4.6 && weight < 300.0 && age > 5 && goodWeather)
  {
    System.out.println("yay! you get to ride the roller coaster" + name);
  }else{
    System.out.println("sorry, maybe next year" + name);
  }
 }
}
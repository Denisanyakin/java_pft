package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("wold");
    hello("user");
    hello("Denys");

    double l = 5;
    System.out.println("Ploshad kvadrata so storonoj " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Ploshad pryamougolnika so storonami " + a + " и " + b + " = " + area(a, b));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");

  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }

}

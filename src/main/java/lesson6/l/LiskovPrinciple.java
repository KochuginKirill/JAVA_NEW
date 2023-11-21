package ru.gb.lesson6.l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class LiskovPrinciple {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    // если q(x) является свойством, верным относительно объектов x некоторого типа T,
    // тогда q(y) также должно быть верным для объектов y типа S, где S является подтипом типа T.

    Square r = new Square();
    System.out.println(r.calculateArea());

    Collection<Integer> coll = new ArrayList<>();
    Collections.addAll(coll, 1, 2, 1, 2);
    System.out.println(coll);

    coll = new TreeSet<>();
    Collections.addAll(coll, 1, 2, 1, 2);
    System.out.println(coll);

  }

  private static class NdsCalculator {

    public double getPriceWithNds(Product product) {
      double coefficient = product.getCoefficient();
      return (coefficient + 1) * product.getPrice();
    }

  }

  private static class ForeignProduct extends Product {
    public ForeignProduct(double price) {
      super(price, 0.2);
    }
  }

  private static class NationalProduct extends Product {
    public NationalProduct(double price) {
      super(price, 0.0);
    }
  }

  private static class Product {
    private double price;
    private double coefficient;

    public Product(double price, double coefficient) {
      this.price = price;
      this.coefficient = coefficient;
    }

    public double getPrice() {
      return price;
    }

    public double getCoefficient() {
      return coefficient;
    }
  }

  static interface Shape {
    int calculateArea();
  }

  static class Square implements Shape {
    private int size;

    public int calculateArea() {
      return size * size;
    }

  }

  static class Rectangle implements Shape {
    private int x;
    private int y;

    public void setX(int x) {
      this.x = x;
    }

    public void setY(int y) {
      this.y = y;
    }

    public int calculateArea() {
      return x * y;
    }
  }

}

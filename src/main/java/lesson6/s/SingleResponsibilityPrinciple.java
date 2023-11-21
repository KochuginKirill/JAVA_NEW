package ru.gb.lesson6.s;

public class SingleResponsibilityPrinciple {

  public static void main(String[] args) {
    // Принцип единой ответственности
    // Один повод для изменений
  }

  private static class NdsCalculator {

    private final double ndsForToday;

    public NdsCalculator(double ndsForToday) {
      this.ndsForToday = ndsForToday;
    }

    public double getPriceWithNds(Product product) {
      double price = product.getPrice();
      return price + price * ndsForToday;
    }

  }

  private static class Product {
    private double price;

    public Product(double price) {
      this.price = price;
    }

    public double getPrice() {
      return price;
    }
  }

}

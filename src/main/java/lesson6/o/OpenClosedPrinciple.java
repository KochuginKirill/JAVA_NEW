package ru.gb.lesson6.o;

public class OpenClosedPrinciple {

  public static void main(String[] args) {
    // Принцип открытости\закрытости

    NdsCalculator ndsCalculator = new NdsCalculator();
  }

  private static class NdsCalculator {

    public double getPriceWithNds(Product product) {
      return product.getType().applyCoefficient(product.getPrice());

//      double coefficient = product.getType().getCoeff();
//      double coefficient = switch (product.getType()) {
//        case NATIONAL -> 0.0;
//        case FOREIGN -> 0.05;
//        case SANCTIONED -> 0.25;
//        case NEW -> 0.10;
//      };

//      double price = product.getPrice();
//      return price + price * coefficient;
    }

  }

  private static class Product {
    private double price;
    private ProductType type;

    public Product(double price, ProductType type) {
      this.price = price;
      this.type = type;
    }

    public double getPrice() {
      return price;
    }

    public ProductType getType() {
      return type;
    }
  }

  private enum ProductType {
    NATIONAL(0.0),    // 0%
    FOREIGN(0.05),     // 5%
    SANCTIONED(0.25),  // 25%
    NEW(0.1);          // 10%

    private final double coeff;

    public double getCoeff() {
      return coeff;
    }

    ProductType(double coeff) {
      this.coeff = coeff;
    }

    public double applyCoefficient(double value) {
      return value * (1 + coeff);
    }

  }

}

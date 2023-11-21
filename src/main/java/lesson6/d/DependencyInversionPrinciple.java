//package ru.gb.lesson6.d;
//
//import ru.gb.lesson2.CentralBankNdsResolver;
//
//public class DependencyInversionPrinciple {
//
//  public static void main(String[] args) {
//    // Принцип внедрения зависимостей
//
////    NdsCalculator ndsCalculator = new NdsCalculator(new CentralBankNdsResolver("http://central-bank/nds"));
//  }
//
//  private static class NdsCalculator {
//
//    private NdsResolver ndsResolver;
//
//    public NdsCalculator(NdsResolver ndsResolver) {
//      this.ndsResolver = ndsResolver;
//    }
//
//    public double getPriceWithNds(double price) {
//      double coefficient = ndsResolver.getNdsForToday();
//      return (1 + coefficient) * price;
//    }
//
//  }
//
//  private static interface NdsResolver {
//    double getNdsForToday();
//  }
//
//
//
//
//
//}

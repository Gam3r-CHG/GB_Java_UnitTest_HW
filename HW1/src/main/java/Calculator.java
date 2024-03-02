public class Calculator {
  public static double calculateDiscount(double purchaseAmount, int discountAmount) {
    if (discountAmount < 0 || discountAmount >= 100) {
      throw new ArithmeticException("Discount amount must be between 0 and 100");
    }

    if (purchaseAmount <= 0) {
      throw new ArithmeticException("Purchase amount must be grater than 0");
    }

    return purchaseAmount * (100 - discountAmount) / 100;
  }
}

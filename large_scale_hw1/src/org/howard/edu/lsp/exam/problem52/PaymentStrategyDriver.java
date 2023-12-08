package org.howard.edu.lsp.exam.problem52;


public class PaymentStrategyDriver {
 public static void main(String[] args) {
     ShoppingCart cart = new ShoppingCart();

     // Credit card payment
     cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
     cart.checkout(100.0);

     // PayPal payment
     cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
     cart.checkout(50.0);

     // Bitcoin payment
     cart.setPaymentStrategy(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
     cart.checkout(75.0);
 }
}

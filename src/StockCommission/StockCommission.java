package src.StockCommission;

import javax.swing.JOptionPane;

public class StockCommission {
    public static void main(String[] args) {
        double shares;
        double pricePerShare;
        double subTotal;
        double commission;
        double totalPrice;
        String input;

        input = JOptionPane.showInputDialog("How many shares are you buying?");
        shares = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("What is the price per share?");
        pricePerShare = Double.parseDouble(input);

        subTotal = shares * pricePerShare;

        input = JOptionPane.showInputDialog("How much will be added for commission? (percent)");
        commission = subTotal * (Double.parseDouble(input) / 100);

        totalPrice = subTotal + commission;

        JOptionPane.showMessageDialog(null, "Price for " + shares + " shares: $" + subTotal +
                "\nTotal price with commission included: $" + totalPrice);
    }
}

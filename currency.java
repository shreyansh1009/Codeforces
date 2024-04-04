package codeforces;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        // Format for US currency
        NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String usCurrency = usFormatter.format(payment);
        System.out.println("US: " + usCurrency);

        // Format for Indian currency (Rupees)
        String indianCurrency = formatIndianCurrency(payment);
        System.out.println("India: " + indianCurrency);

        // Format for Chinese currency
        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chinaCurrency = chinaFormatter.format(payment);
        System.out.println("China: " + chinaCurrency);

        // Format for French currency
        NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String franceCurrency = franceFormatter.format(payment);
        System.out.println("France: " + franceCurrency);
    }

    private static String formatIndianCurrency(double amount) {
        // Format for Indian currency (Rupees) without symbol
        NumberFormat indiaFormatter = NumberFormat.getNumberInstance(new Locale("en", "IN"));
        indiaFormatter.setMinimumFractionDigits(2);
        indiaFormatter.setMaximumFractionDigits(2);

        String formatted = indiaFormatter.format(amount);
        formatted = "Rs." + formatted.substring(formatted.indexOf(' ') + 1);
        return formatted;
    }
}

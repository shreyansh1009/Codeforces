package codeforces;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currencyformated {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String indianCurrency = indiaFormatter.format(payment);

        // Remove the currency symbol from the formatted string
        indianCurrency = "Rs." + indianCurrency.substring(indianCurrency.indexOf(' ') + 1);

        System.out.println("India: " + indianCurrency);

        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        String usCuurency = formatter.format(payment);
        System.out.println("US: "+usCuurency);



        NumberFormat chinaformatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chinaCuurency = formatter.format(payment);
        System.out.println("US: "+chinaCuurency);

        NumberFormat franceformatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String franceCuurency = formatter.format(payment);
        System.out.println("France: "+franceCuurency);




    }
}

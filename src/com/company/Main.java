package com.company;

public class Main {

    public static void main(String[] args) {
        Currency [] currencies = Currency.values();

        for (Currency currency:
             currencies) {
            System.out.println(currency + "\t" + currency.ordinal());
        }

        Currency c1 = Currency.EUR;
        switch (c1){
            case AUD -> System.out.println("Australian Dollar");
            case BGN -> System.out.println("Bulgarian Lev");
            case CAD -> System.out.println("Canadian Dollar");
            case CHF -> System.out.println("Swiss Franc");
            case EUR -> System.out.println("European Euro");
            case GBP -> System.out.println("British Pound");
            case JPY -> System.out.println("Japanese Yen");
            case NZD -> System.out.println("New Zealand Dollar");
            case USD -> System.out.println("United States Dollar");
        }
    }
}

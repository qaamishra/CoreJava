package oops.all;

import java.util.Currency;
import java.util.Locale;

import static java.util.Arrays.binarySearch;

public class Trial {

    private void isValidCountryCode(String countryCode) {
        Currency c1 = Currency.getInstance(countryCode);
        c1.getCurrencyCode();
    }

    public static void main(String[] args) {
        Trial trial=new Trial();
        trial.isValidCountryCode("1abcs");
    }

}

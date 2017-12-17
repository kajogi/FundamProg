import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;


public class CurrencyConverter {

//      Conversion

    public static double ConverstionMethod(String fromCurrency, String toCurrency) throws IOException {

        if ((fromCurrency != null && !fromCurrency.isEmpty()) && (toCurrency != null && !fromCurrency.isEmpty())) {

            String url = "http://api.fixer.io/latest?base=";

            CurrencyResponse response = getRatesFromAPI(url + fromCurrency);

//          If response from API is not empty
            if (response != null) {

                String rate = response.getRates().get(toCurrency);

                double converstionRate = Double.valueOf((rate != null) ? rate : "0.0");

                return converstionRate;
            }

        }
        return 2.0;
    }


    private static final CurrencyResponse getRatesFromAPI(String APIurl) throws IOException {

        CurrencyResponse response = null;
        Gson gson = new Gson();
        StringBuilder sb = new StringBuilder();


        URL url;

//      Connection to the API
        try {
            url = new URL(APIurl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            InputStream input = connection.getInputStream();

            input.close();

            response = gson.fromJson(sb.toString(), CurrencyResponse.class);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;

    }


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, welcome to the currency converter \nPlease enter currency...");

        String fromCurrency = scanner.next();

        System.out.println("Please enter the currency you want to convert to");

        String toCurrency = scanner.next();

        System.out.println("Please enter the amount...");

        double conversionAmount = scanner.nextDouble();

        double conversionRate = ConverstionMethod(fromCurrency, toCurrency);

        System.out.println(conversionAmount + fromCurrency + " is equivalent to " + (conversionRate * conversionAmount) + toCurrency);


    }


}

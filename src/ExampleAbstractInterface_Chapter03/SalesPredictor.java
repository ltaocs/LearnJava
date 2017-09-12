package ExampleAbstractInterface_Chapter03;

import java.util.Arrays;
import java.util.List;

import static ExampleAbstractInterface_Chapter03.FixedFeeCalculator.STANDARD_FEE;
import static ExampleAbstractInterface_Chapter03.HourlyRateCalculator.STANDARD_HOURLY_RATE;
import static ExampleAbstractInterface_Chapter03.RoyaltyShareCalculator.STANDARD_ROYALTY_PERCENTAGE;

public class SalesPredictor
{
    public static void main(String[] args)
    {
        final List<ClientEngagement> engagements = Arrays.asList(
            new ClientEngagement("Catherine's Cookies", 40, 40_000),
            new ClientEngagement("Bob's Burgers", 30, 4000),
            new ClientEngagement("Dave's Doughnuts", 25, 1000),
            new ClientEngagement("Susan's Sausages", 10, 2000));

        System.out.println("Fixed Fee");
        printTotalRevenue(engagements, new FixedFeeCalculator(STANDARD_FEE));

        System.out.println("Hourly Rate");
        printTotalRevenue(engagements, new HourlyRateCalculator(STANDARD_HOURLY_RATE));

        System.out.println("Royalty Share");
        printTotalRevenue(engagements, new RoyaltyShareCalculator(STANDARD_ROYALTY_PERCENTAGE));
    }

    private static void printTotalRevenue(
        final List<ClientEngagement> engagements, final RevenueCalculator calculator)
    {
        double total = 0;
        for (ClientEngagement clientEngagement : engagements)
        {
            total += calculator.calculate(clientEngagement);
        }
        System.out.println("total = " + total);
    }

}

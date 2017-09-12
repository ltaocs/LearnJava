package ExampleAbstractInterface;

import static ExampleAbstractInterface.FixedFeeCalculator.STANDARD_FEE;

public class RevenueCalculatorRunner
{
    public static void main(String[] args)
    {
        final ClientEngagement clientEngagement =
            new ClientEngagement("Pluralsight", 100, 15_000);

        RevenueCalculator revenueCalculator = new FixedFeeCalculator(STANDARD_FEE);

        final double price = revenueCalculator.calculate(clientEngagement);
        System.out.println("price = " + price);
    }
}

package ExampleAbstractInterface_Chapter03;

public class RoyaltyShareCalculator implements RevenueCalculator
{
    public static final double STANDARD_ROYALTY_PERCENTAGE = 0.15;

    private final double royaltyPercentage;

    public RoyaltyShareCalculator(final double royaltyPercentage)
    {
        this.royaltyPercentage = royaltyPercentage;
    }

    @Override
    public double calculate(final ClientEngagement clientEngagement)
    {
        return royaltyPercentage * clientEngagement.getAnticipatedRevenue();
    }
}

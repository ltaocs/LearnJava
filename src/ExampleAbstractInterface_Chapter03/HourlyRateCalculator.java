package ExampleAbstractInterface_Chapter03;

public class HourlyRateCalculator implements RevenueCalculator
{
    public static final double STANDARD_HOURLY_RATE = 50;

    private final double hourlyRate;

    public HourlyRateCalculator(final double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculate(final ClientEngagement clientEngagement)
    {
        return hourlyRate * clientEngagement.getHoursWorked();
    }
}

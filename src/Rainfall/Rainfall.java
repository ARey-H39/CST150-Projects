package src.Rainfall;

public class Rainfall {
    private double[] rainPerMonth;
    private final String[] months = {
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
    };

    public Rainfall() {}

    public String[] getMonths() {
        return months;
    }

    public void setFigures(double[] monthlyRain) {
        rainPerMonth = monthlyRain;
    }

    public double yearTotal() {
        double result = 0;

        for(int i = 0; i < rainPerMonth.length; i++) {
            result += rainPerMonth[i];
        }

        return result;
    }

    public double monthlyAverage() {
        double result = 0;

        for (int i = 0; i < rainPerMonth.length; i++) {
            result += rainPerMonth[i];
        }

        result /= rainPerMonth.length;

        return result;
    }

    public String mostRainfall() {
        double highest = rainPerMonth[0];
        String month = "";

        for (int i = 1; i < rainPerMonth.length; i++) {
            if (rainPerMonth[i] > highest) {
                highest = rainPerMonth[i];
                month = months[i];
            }
        }

        return month + " - " + highest;
    }

    public String leastRainfall() {
        double lowest = rainPerMonth[0];
        String month = "";

        for (int i = 1; i < rainPerMonth.length; i++) {
            if (rainPerMonth[i] < lowest) {
                lowest = rainPerMonth[i];
                month = months[i];
            }
        }

        return month + " - " + lowest;
    }
}

// Challenge 1: Rainfall Tracker
// File: RainfallTracker.java
// Instructions: Analyze monthly precipitation data

public class RainfallTracker {
    public static void main(String[] args) {
        // Monthly rainfall in inches for the year
        double[] rainfall = {2.5, 3.1, 4.2, 3.8, 2.9, 1.5, 0.8, 0.9, 2.1, 3.5, 4.0, 3.2};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println("Annual Rainfall Analysis");
        System.out.println("========================\n");

        // TODO: Calculate and print the total rainfall for the year
        double totalRainfall = 0;
        for(int i = 0; i < rainfall.length; i++){
            totalRainfall += rainfall[i];
        }
        System.out.println("Total Rainfall: " + totalRainfall + " inches");

        // TODO: Calculate and print the average monthly rainfall
        double averageMonthlyRainfall = totalRainfall / rainfall.length;
        System.out.printf("Average Rainfall: %.2f inches", averageMonthlyRainfall);

        // TODO: Find and print the wettest month (highest rainfall)
        // Hint: Keep track of the highest value and its index
        double highestRainfall = rainfall[0];
        int wettestMonthIndex = 0;
        for(int i = 1; i < rainfall.length; i++){
            if (rainfall[i] > highestRainfall) {
                highestRainfall = rainfall[i];
                wettestMonthIndex = i;
            }
        }

        System.out.println();
        System.out.printf("Wettest Month: %s with %.1f inches of rain.", months[wettestMonthIndex], highestRainfall);

        // TODO: Find and print the driest month (lowest rainfall)
        double lowestRainfall = rainfall[0];
        int driestMonthIndex = 0;
        for(int i = 1; i < rainfall.length; i++){
            if (rainfall[i] < lowestRainfall) {
                lowestRainfall = rainfall[i];
                driestMonthIndex = i;
            }
        }

        System.out.println();
        System.out.printf("Driest Month: %s with %.1f of rain.", months[driestMonthIndex], lowestRainfall);

        // TODO: Count how many months had more than 3 inches of rain
        int wetMonths = 0;
        for(int i = 0; i < rainfall.length; i++){
            if (rainfall[i] >= 3)
            wetMonths++;
        }

        System.out.println();
        System.out.printf("%d months had totals equal to or above 3 inches.", wetMonths);
        // BONUS: Print a simple bar chart showing rainfall for each month
        // Example: Jan: ***** (2.5 inches)
        //          Feb: ****** (3.1 inches)

    }
}

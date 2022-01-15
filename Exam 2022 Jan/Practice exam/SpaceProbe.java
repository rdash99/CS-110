public class SpaceProbe {
    public static void main(String[] args) {
        double speed = 30; // speed of the probe in km/s
        double originalSpeed = 30; // original speed of the probe in km/s
        double slowdown = 9; // slowdown percentage per year
        double gravityChange = 12; // slowdown reduction per year (percentage)
        int year = 0; // year of the game
        int finalYear = 8; // final year of the game

        // calculate the speed of the probe after the final year
        while (year
                < finalYear) {
            speed = speed
                    - (speed
                            * slowdown
                            / 100);
            slowdown = slowdown
                    - (slowdown
                            * gravityChange
                            / 100);
            year++;
        }
        System.out.println(speed);

        // calculate how many years it takes the probe to slow down to half or less of it's original speed
        year = 0;
        speed = 30; // speed of the probe in km/s
        originalSpeed = 30; // original speed of the probe in km/s
        slowdown = 9; // slowdown percentage per year
        gravityChange = 12; // slowdown reduction per year (percentage)
        while (speed
                > originalSpeed
                        / 2) {
            speed = speed
                    - (speed
                            * slowdown
                            / 100);
            slowdown = slowdown
                    - (slowdown
                            * gravityChange
                            / 100);
            year++;
        }
        System.out.println(year);

        year = 1;
        speed = 30000000; // speed of the probe in mm/s
        originalSpeed = 30000000; // original speed of the probe in mm/s
        double targetSpeed = 1; // target speed mm/s
        slowdown = 9; // slowdown percentage per year
        gravityChange = 12; // slowdown reduction per year (percentage)
        // calculate how many years it takes the probe to slow down to 1mm/s or less
        while ((speed
                * (slowdown
                        / 100))
                > targetSpeed) {
            speed = speed
                    - (speed
                            * slowdown
                            / 100);
            slowdown = slowdown
                    - (slowdown
                            * gravityChange
                            / 100);
            year++;
        }
        System.out.println(year);

        year = 0;
        speed = 30; // speed of the probe in km/s
        originalSpeed = 30; // original speed of the probe in km/s
        targetSpeed = 1; // target speed mm/s
        slowdown = 9; // slowdown percentage per year
        gravityChange = 12; // slowdown reduction per year (percentage)

        while (year
                < 4) {
            speed = speed
                    - (speed
                            * slowdown
                            / 100);
            slowdown = slowdown
                    - (slowdown
                            * gravityChange
                            / 100);
            year++;
        }
        targetSpeed = speed;
        speed = speed
                * 1.5;
        while (speed
                > targetSpeed) {
            speed = speed
                    - (speed
                            * slowdown
                            / 100);
            slowdown = slowdown
                    - (slowdown
                            * gravityChange
                            / 100);
            year++;
        }
        System.out.println(year);
    }
}

package school.lesson4.paymentAndPark;

public class Park {

    public static void parkPrintRides() {

        Park.Rides[] ridesArray = new Park.Rides[4];
        ridesArray[0] = new Park.Rides("Колесо обозрения", "10.00-20.00", 5.50);
        ridesArray[1] = new Park.Rides("Детский поезд", "10.00-15.00", 3.00);
        ridesArray[2] = new Park.Rides("Автодром с электрическими машинками", "10.00-16.00", 5.50);
        ridesArray[3] = new Park.Rides("Карусель цепочная", "12.00-18.30", 5.50);

        for (Park.Rides rides : ridesArray) {
            rides.printRideInfo();
        }
    }

    public static class Rides {

        private final String rideName;
        private final String rideOpenHours;
        private final double ridePrice;

        public Rides(String rideName, String rideOpenHours, double ridePrice) {
            this.rideName = rideName;
            this.rideOpenHours = rideOpenHours;
            this.ridePrice = ridePrice;
        }

        public void printRideInfo() {
            System.out.println(" Название аттракциона: " + rideName + " время работы аттракциона: "
                    + rideOpenHours + " Стоимость аттракциона: " + ridePrice + " рублей.");
        }
    }

}
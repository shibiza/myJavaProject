package school.lesson4.paymentAndPark;

public class Payment {

    public static void paymentPrintProducts() {

        Product[] productArray = new Product[3];
        productArray[0] = new Product("Spaghetti Bolognese", 2.40);
        productArray[1] = new Product("Bread Volotovskoy", 1.50);
        productArray[2] = new Product("Coffe Lavazza", 21.15);

        for (Product productFirst : productArray) {
            productFirst.printPaymentDetails();
        }
    }

    public static class Product {

        private final String prod;
        private final double productPrice;

        public Product(String prod, double productPrice) {
            this.prod = prod;
            this.productPrice = productPrice;
        }

        public void printPaymentDetails() {
            System.out.println(" Товар: " + prod + " Стоимость: " + productPrice + " рублей");
        }
    }
}


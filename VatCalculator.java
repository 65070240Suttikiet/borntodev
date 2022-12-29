public class VatCalculator {
    public static void main(String[] args) {
        // TODO code application logic here
        // price float, vat float
        float price = 200.00f;
        float vat = 10.00f;
        float total = (price*vat/100) + price;
        System.out.println(total);
    }
}

package builder;

public class Purchase {
    public static void main(String[] args) {

        PaymentMethod cardPaymen = PaymentMethod.cardPaymen();
        PaymentMethod BankTransferPayment = PaymentMethod.BankTransferPayment();
        PaymentMethod CashOnDeliveryPayment = PaymentMethod.CashOnDeliveryPayment();



        Customer customer1 = new Customer("Juan", "310522", "calle 2", "pepito",cardPaymen);
        Customer customer2 = new Customer("marcela", "315658", "calle 51", "marcela123",BankTransferPayment);
        Customer customer3 = new Customer("sebas", "318540", "avenida 4", "chicoT",CashOnDeliveryPayment);

        Product lavadora = new Product("Lavadora", 500000);
        Product nevera = new Product("Nevera", 700000);
        Product microondas = new Product("Microondas", 300000);


        //creacion de ordenes de compra usando el builder
        OrderSummary orderSummary1 =new OrderSummaryBuilder()
                .customer(customer1)
                .addProduct(lavadora)
                .addProduct(microondas)
                .buildOrderPurchase();

        OrderSummary orderSummary2 =new OrderSummaryBuilder()
                .customer(customer2)
                .addProduct(nevera)
                .buildOrderPurchase();

        OrderSummary orderSummary3 =new OrderSummaryBuilder()
                .customer(customer3)
                .addProduct(microondas)
                .buildOrderPurchase();


        System.out.println("Orden 1: ");
        orderSummary1.displaySummary();

        System.out.println("Orden 2: ");
        orderSummary2.displaySummary();

        System.out.println("Orden 2: ");
        orderSummary3.displaySummary();
    }
}
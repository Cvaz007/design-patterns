package builder;

public class PaymentMethod {

    private String type;

    public PaymentMethod(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static PaymentMethod cardPaymen() {
        return new PaymentMethod("Tarjeta de Crédito");
    }

    public static PaymentMethod BankTransferPayment() {
        return new PaymentMethod("Transferencia Bancaria");
    }

    public static PaymentMethod CashOnDeliveryPayment() {
        return new PaymentMethod("Pago en Efectivo");
    }
}

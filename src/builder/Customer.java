package builder;

public class Customer {

    private String name;
    private String phoneNunmber;
    private String address;
    private String email;
    private PaymentMethod paymentMethod;


    public Customer(String name, String phoneNunmber, String address, String email, PaymentMethod paymentMethod) {
        this.name = name;
        this.phoneNunmber = phoneNunmber;
        this.address = address;
        this.email = email;
        this.paymentMethod = paymentMethod;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNunmber() {
        return phoneNunmber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}

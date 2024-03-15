import java.util.List;

public class OrderSummary {

    private Customer customer;
    private List<Product> products;

    public OrderSummary(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }


    public double totalAmount(){
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void displaySummary(){
        System.out.println("Resumen de la orden:");
        System.out.println("Cliente: " + customer.getName());
        System.out.println("Dirección de envío: " + customer.getAddress());
        System.out.println("Método de pago: " + customer.getPaymentMethod().getType());
        System.out.println("Numero de contacto: " + customer.getPhoneNunmber());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Productos:");
        products.forEach(product -> System.out.println("- " + product.getName() + ": $" + product.getPrice()));
        System.out.println("Total: $" + totalAmount());
    }
}

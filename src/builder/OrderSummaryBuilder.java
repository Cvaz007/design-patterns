import java.util.ArrayList;
import java.util.List;

public class OrderSummaryBuilder {

    private Customer customer;
    private List<Product> products = new ArrayList<>();

    public OrderSummaryBuilder customer(Customer customer){
        this.customer=customer;
        return this;
    }

    public OrderSummaryBuilder addProduct(Product product) {
        this.products.add(product);
        return this;
    }

    public OrderSummary buildOrderPurchase(){
        return new OrderSummary(customer, products);
    }
}

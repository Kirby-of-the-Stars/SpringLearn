package fun.turou.springlearn.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    Customer getCustomer() {
        return new Customer(1, "Maimai DX");
    }
}

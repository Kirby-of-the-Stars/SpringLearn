package fun.turou.springlearn.customer;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return List.of();
    }
}

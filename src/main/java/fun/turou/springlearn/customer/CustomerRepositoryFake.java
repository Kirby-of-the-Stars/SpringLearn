package fun.turou.springlearn.customer;

import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "fake")
public class CustomerRepositoryFake implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return List.of(new Customer(1, "John Doe"));
    }
}

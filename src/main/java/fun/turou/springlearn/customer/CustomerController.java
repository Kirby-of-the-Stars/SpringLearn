package fun.turou.springlearn.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    CustomerService customerService;

    @Autowired
    CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    Customer getCustomer() {
        return customerService.getCustomer();
    }
}

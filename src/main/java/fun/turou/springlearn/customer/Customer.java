package fun.turou.springlearn.customer;

import lombok.Getter;

@Getter
class Customer {
    private final int id;
    private final String name;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

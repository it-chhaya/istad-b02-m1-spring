package kh.edu.istad.ioc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
public class CoffeeBean {
    public void getCoffee() {
        IO.println("Ice Latte");
    }
}

package kh.edu.istad.ioc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RequiredArgsConstructor
public class DemoApplication implements
        CommandLineRunner {

    // 1. Declare dependency
    // a. Required dependency
    // b. Optional dependency
    private final CoffeeBean coffeeBean;

    // 2. Inject dependency by constructor-based injection
    public DemoApplication(CoffeeBean coffeeBean) {
        this.coffeeBean = coffeeBean;
    }

    @Override
    public void run(String... args) throws Exception {
        coffeeBean.getCoffee();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

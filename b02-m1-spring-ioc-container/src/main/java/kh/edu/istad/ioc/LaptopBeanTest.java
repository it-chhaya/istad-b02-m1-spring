package kh.edu.istad.ioc;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j // Use for class-level logging
public class LaptopBeanTest {

    // 1. Declare optional dependency
    private LaptopBean laptopBean;

    @Autowired
    public void setLaptopBean(LaptopBean laptopBean) {
        this.laptopBean = laptopBean;
    }

    @PostConstruct // Invoke method after spring boot started
    public void test() {
        log.info("LaptopBean = {}", laptopBean);
        IO.println("LaptopBean = " + laptopBean);
        laptopBean.getBrand();
    }

}

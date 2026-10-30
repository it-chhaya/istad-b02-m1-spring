package kh.edu.istad.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Create or configure bean with Java-based configuration
@Configuration
public class CpuConfiguration {

    @Primary
    @Bean
    public CPU intelCpu() {
        // TODO
        return new CPU("Intel Core i7");
    }

    @Bean
    public CPU amd64Cpu() {
        return new CPU("AMD64 CPU");
    }

}

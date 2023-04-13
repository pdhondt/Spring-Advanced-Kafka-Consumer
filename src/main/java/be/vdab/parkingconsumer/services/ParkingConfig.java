package be.vdab.parkingconsumer.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.JsonMessageConverter;

@Configuration
public class ParkingConfig {
    @Bean
    public JsonMessageConverter converter() {
        return new JsonMessageConverter();
    }
}

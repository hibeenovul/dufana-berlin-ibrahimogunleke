package com.dufuna.berlin.ibrahimogunleke.tax;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

//Enable auto-configuration and component scanning
@SpringBootApplication

public class TaxApplication {
    //creates a static logger bound to this specific class
    private static final Logger log = LoggerFactory.getLogger(TaxApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TaxApplication.class, args);
    }

    //execute terminal logging
    @EventListener(ApplicationReadyEvent.class)
    public void logStartupURL() {
        log.info("API is actively listening. Click to test: http://localhost:8080/api/tax/calculate?income=20000");
    }
}

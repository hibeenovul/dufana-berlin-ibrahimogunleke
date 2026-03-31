package com.dufuna.berlin.ibrahimogunleke.tax.component;

import com.dufuna.berlin.ibrahimogunleke.tax.model.TaxBracket;
import com.dufuna.berlin.ibrahimogunleke.tax.repository.TaxBracketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//   Registers this class as a Spring Bean to be auto-detected during component scanning.
@Component
public class DatabaseSeeder implements CommandLineRunner {

    private final TaxBracketRepository taxBracketRepository;

    //   Wires the repository so we can save data to the Vault.
    public DatabaseSeeder(TaxBracketRepository taxBracketRepository) {
        this.taxBracketRepository = taxBracketRepository;
    }

    //  This executes exactly once during application startup.
    @Override
    public void run(String... args) throws Exception {

        // Only seed the database if it is completely empty
        if (taxBracketRepository.count() == 0) {

            // Recreate your original Sprint 6 tax rules here
            TaxBracket bracket1 = new TaxBracket(0.0, 50000.0, 0.10);
            TaxBracket bracket2 = new TaxBracket(50000.0, 100000.0, 0.20);
            TaxBracket bracket3 = new TaxBracket(100000.0, Double.MAX_VALUE, 0.30);

            // Save the entities to the H2 database
            List<TaxBracket> bracketsToSave = Arrays.asList(bracket1, bracket2, bracket3);
            taxBracketRepository.saveAll(bracketsToSave);

            System.out.println("Vault Manager: Successfully secured " + taxBracketRepository.count() + " tax brackets in the database.");
        }
    }
}

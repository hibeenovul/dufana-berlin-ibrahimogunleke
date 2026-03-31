package com.dufuna.berlin.ibrahimogunleke.tax.repository;
import com.dufuna.berlin.ibrahimogunleke.tax.model.TaxBracket;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

//this register this interface as a Data Access Object (DAO) been in the SSpring ApplicationContext
@Repository


public interface TaxBracketRepository extends JpaRepository<TaxBracket, Long> {
}

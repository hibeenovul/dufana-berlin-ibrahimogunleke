package com.dufuna.berlin.ibrahimogunleke.lekki.repository;
import com.dufuna.berlin.ibrahimogunleke.lekki.model.LekkiProperty;
import java.util.List;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty property);
    LekkiProperty findById(Long  propertyId);
    List<LekkiProperty> findAll();
    LekkiProperty update(LekkiProperty property);
}

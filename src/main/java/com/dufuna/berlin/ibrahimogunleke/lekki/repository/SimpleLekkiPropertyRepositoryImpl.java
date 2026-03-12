package com.dufuna.berlin.ibrahimogunleke.lekki.repository;
import com.dufuna.berlin.ibrahimogunleke.lekki.model.LekkiProperty;
import  java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {
    private Map<Long, LekkiProperty> database = new HashMap<>();
    
    @Override
    public LekkiProperty save(LekkiProperty property) {
        database.put(property.getPropertyId(), property);
        return property;
    }
    @Override
    public LekkiProperty findById(Long propertyId) {
        return database.get(propertyId);
    }
    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<>(database.values());
    }
    @Override
    public LekkiProperty update(LekkiProperty property) {
        database.put(property.getPropertyId(), property);
        return property;
    }
}

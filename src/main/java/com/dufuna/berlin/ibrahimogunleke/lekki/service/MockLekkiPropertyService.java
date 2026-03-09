package com.dufuna.berlin.ibrahimogunleke.lekki.service;
import com.dufuna.berlin.ibrahimogunleke.lekki.model.LekkiProperty;
import com.dufuna.berlin.ibrahimogunleke.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.ibrahimogunleke.lekki.repository.SimpleLekkiPropertyRepositoryImpl;
import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService {
    private final SimpleLekkiPropertyRepository repository = new SimpleLekkiPropertyRepositoryImpl();
    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        return repository.save(property);
    }

    @Override
    public LekkiProperty getProperty(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return repository.findAll();
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return new LekkiProperty();
    }
}

package com.dufuna.berlin.ibrahimogunleke.lekki.service;
import com.dufuna.berlin.ibrahimogunleke.lekki.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService {
    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiProperty.saveProperty called");
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiProperty.getProperty called");
        return new LekkiProperty();
    }
}

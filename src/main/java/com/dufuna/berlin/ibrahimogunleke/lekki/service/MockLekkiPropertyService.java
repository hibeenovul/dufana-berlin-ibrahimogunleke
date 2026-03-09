package com.dufuna.berlin.ibrahimogunleke.lekki.service;
import com.dufuna.berlin.ibrahimogunleke.lekki.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService {
    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return new LekkiProperty();
    }
}

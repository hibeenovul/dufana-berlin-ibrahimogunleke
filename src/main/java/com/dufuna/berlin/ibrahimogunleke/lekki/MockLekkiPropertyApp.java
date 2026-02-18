package com.dufuna.berlin.ibrahimogunleke.lekki;
import com.dufuna.berlin.ibrahimogunleke.lekki.model.LekkiProperty;
import com.dufuna.berlin.ibrahimogunleke.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.ibrahimogunleke.lekki.service.MockLekkiPropertyService;


public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiPropertyService service = new MockLekkiPropertyService();
        LekkiProperty property = new LekkiProperty();
        service.saveProperty(property);
        LekkiProperty retrievedProperty = service.getProperty();
        System.out.println(retrievedProperty);
    }
}

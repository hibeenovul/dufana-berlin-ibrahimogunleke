package com.dufuna.berlin.ibrahimogunleke.lekki;
import com.dufuna.berlin.ibrahimogunleke.lekki.model.LekkiProperty;
import com.dufuna.berlin.ibrahimogunleke.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.ibrahimogunleke.lekki.service.MockLekkiPropertyService;
import java.util.List;


public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiPropertyService service = new MockLekkiPropertyService();
        LekkiProperty property = new LekkiProperty();
        for (int i = 1; i <= 3; i++) {

            property.setPropertyId((long) i);
            service.saveProperty(property);
        }

        LekkiProperty singleProperty = service.getProperty(1L);
        System.out.println("Sucess! Found Property with ID"+ singleProperty.getPropertyId());

        List<LekkiProperty> allProperties = service.getProperties();
        System.out.println("Sucess! Found Properties in database" +allProperties.size());

    }
}

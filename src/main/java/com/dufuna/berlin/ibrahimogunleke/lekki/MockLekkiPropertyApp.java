package com.dufuna.berlin.ibrahimogunleke.lekki;
import com.dufuna.berlin.ibrahimogunleke.lekki.model.LekkiProperty;
import com.dufuna.berlin.ibrahimogunleke.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.ibrahimogunleke.lekki.service.MockLekkiPropertyService;
import java.util.List;


public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiPropertyService service = new MockLekkiPropertyService();

        for (int i = 1; i <= 3; i++) {

        LekkiProperty property = new LekkiProperty();


            property.setPropertyId((long) i);
            service.saveProperty(property);
        }

        LekkiProperty singleProperty = service.getProperty(1L);
        System.out.println("Sucess! Found Property with ID"+ singleProperty.getPropertyId());

        List<LekkiProperty> allProperties = service.getProperties();
        System.out.println("Sucess! Found Properties in database" +allProperties.size());

        System.out.println("--- PRINTING DETAILED RECEIPT ---");
        for (LekkiProperty p : allProperties) {
            System.out.println("Property ID in Database: " + p.getPropertyId());
        }
    }
}

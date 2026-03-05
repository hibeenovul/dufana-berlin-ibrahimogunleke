package com.dufuna.berlin.ibrahimogunleke.lekki.service;
import com.dufuna.berlin.ibrahimogunleke.lekki.model.LekkiProperty;
import java.util.List;

public interface LekkiPropertyService {
    LekkiProperty saveProperty(LekkiProperty property);
    LekkiProperty getProperty(Long id);
    List<LekkiProperty> getProperties();
}

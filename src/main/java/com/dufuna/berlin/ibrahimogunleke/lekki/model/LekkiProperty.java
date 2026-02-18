package com.dufuna.berlin.ibrahimogunleke.lekki.model;

import java.time.LocalDate;
import java.util.Objects;

public class LekkiProperty {
    private Long propertyId;
    private String propertyAddress;
    private String propertyType;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathRooms;
    private int numberOfToilets;
    private String propertyOwner;
    private String description;
    private LocalDate validFrom;
    private LocalDate validTo;

    public LekkiProperty() {

    }
        public Long getPropertyId() {
            return propertyId;
        }
        public void setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
        }

        public String getPropertyAddress() {
            return propertyAddress;
        }
        public void setPropertyAddress(String propertyAddress) {
            this.propertyAddress = propertyAddress;
        }

        public String getPropertyType() {
            return propertyType;
        }
        public void setPropertyType(String propertyType) {
            this.propertyType = propertyType;
        }

        public int getNumberOfBedrooms() {
            return numberOfBedrooms;
        }
        public void setNumberOfBedrooms(int numberOfBedrooms) {
            this.numberOfBedrooms = numberOfBedrooms;
        }

        public int getNumberOfSittingRooms() {
            return numberOfSittingRooms;
        }
        public void setNumberOfSittingRooms(int numberOfSittingRooms) {
            this.numberOfSittingRooms = numberOfSittingRooms;
        }

        public int getNumberOfKitchens() {
            return numberOfKitchens;
        }
        public void setNumberOfKitchens(int numberOfKitchens) {
            this.numberOfKitchens = numberOfKitchens;
        }

        public int getNumberOfBathRooms() {
            return numberOfBathRooms;
        }
        public void setNumberOfBathRooms(int numberOfBathRooms) {
            this.numberOfBathRooms = numberOfBathRooms;
        }

        public int getNumberOfToilets() {
            return numberOfToilets;
        }
        public void setNumberOfToilets(int numberOfToilets) {
            this.numberOfToilets = numberOfToilets;
        }

        public String getPropertyOwner() {
            return propertyOwner;
        }
        public void setPropertyOwner(String propertyOwner) {
            this.propertyOwner = propertyOwner;
        }

        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }

        public LocalDate getValidFrom() {
            return validFrom;
        }
        public void setValidFrom(LocalDate validFrom) {
            this.validFrom = validFrom;
        }

        public LocalDate getValidTo() {
            return validTo;
        }
        public void setValidTo(LocalDate validTo) {
            this.validTo = validTo;
        }

        @Override
        public String toString() {
            return propertyAddress + "," + propertyAddress + "," + propertyType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LekkiProperty that = (LekkiProperty) o;
            return Objects.equals(propertyId, that.propertyId);
        }

        @Override
        public int hashCode() {
            return propertyId != null ? propertyId.intValue() : 0;
        }

}
